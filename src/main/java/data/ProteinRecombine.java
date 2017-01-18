package data;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zjc on 2016/12/23.
 */
public class ProteinRecombine {

    private static String[] dirNames = {"Celeg20160731_new", "Dmela20160731_new", "Ecoli20160731_new", "Hpylo20160731_new", "Mmusc20160731_new", "Rnorv20160731_new", "Scere20160731_new", "Hsapi20160731_new"};

    public static void getProteinRecombine(String inputPath, String outputPath, int wantedFileNums) throws IOException{
        File outputDir = new File(outputPath);
        if(!outputDir.exists()){
            outputDir.mkdirs();
        }
        Random random = new Random();
        int firstDir, secondDir, firstFile, secondFile, firstProtein, secondProtein;
        for(int i = 1; i <= wantedFileNums; i ++){
            firstDir = random.nextInt(dirNames.length);
            secondDir = random.nextInt(dirNames.length);
            while(secondDir == firstDir){
                secondDir = random.nextInt(dirNames.length);
            }
            File inputDir1 = new File(inputPath + "\\" + dirNames[firstDir]);
            File[] inputFiles1 = inputDir1.listFiles();
            File inputDir2 = new File(inputPath + "\\" + dirNames[secondDir]);
            File[] inputFiles2 = inputDir2.listFiles();
            firstFile = random.nextInt(inputFiles1.length) + 1;
            secondFile = random.nextInt(inputFiles2.length) + 1;
            firstProtein = random.nextInt(2);
            secondProtein = random.nextInt(2) + 2;
            System.out.print(i + "\t" + dirNames[firstDir] + ":\t" + firstFile + "\t" + dirNames[secondDir] + ":\t" + secondFile);
//            System.out.print(i + "\t" + inputFiles1[firstFile].getAbsolutePath() + "\t" + inputFiles2[secondFile].getAbsolutePath() + "\tfirstProtein: " + firstProtein + "\tsecondProtein: " + secondProtein);
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath + "\\" + dirNames[firstDir] + "\\" + firstFile + ".fasta"), "utf-8"));
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath + "\\" + dirNames[secondDir] + "\\" + secondFile + ".fasta"), "utf-8"));
            ArrayList<StringBuilder> dataList = new ArrayList<StringBuilder>();
            String line = bufferedReader1.readLine();
            while(line != null){
                if(line.length() == 0){
                    line = bufferedReader1.readLine();
                    continue;
                }
                StringBuilder tempString = new StringBuilder();
                if(line.startsWith(">")){
                    tempString.append(line + "\r\n");
                    line = bufferedReader1.readLine();
                    while(line != null && line.length() == 0){
                        line = bufferedReader1.readLine();
                    }
                    if(line == null){
                        break;
                    }
                    while(line != null && !line.startsWith(">")){
                        if(line.length() == 0){
                            line = bufferedReader1.readLine();
                            continue;
                        }
                        tempString.append(line);
                        line = bufferedReader1.readLine();
                    }
                    dataList.add(tempString);
//                    line = bufferedReader1.readLine();
                }
            }
            bufferedReader1.close();

            line = bufferedReader2.readLine();
            while(line != null){
                if(line.length() == 0){
                    line = bufferedReader1.readLine();
                    continue;
                }
                StringBuilder tempString = new StringBuilder();
                if(line.startsWith(">")){
                    tempString.append(line + "\r\n");
                    line = bufferedReader2.readLine();
                    while(line != null && line.length() == 0){
                        line = bufferedReader2.readLine();
                    }
                    if(line == null){
                        break;
                    }
                    while(line != null && !line.startsWith(">")){
                        if(line.length() == 0){
                            line = bufferedReader2.readLine();
                            continue;
                        }
                        tempString.append(line);
                        line = bufferedReader2.readLine();
                    }
                    dataList.add(tempString);
//                    line = bufferedReader2.readLine();
                }
            }
            bufferedReader2.close();
            if(dataList.size() == 4){
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath + "\\" + i + ".fasta"), false), "utf-8"));
                bufferedWriter.write(dataList.get(firstProtein).toString());
                bufferedWriter.newLine();
                bufferedWriter.write(dataList.get(secondProtein).toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
                bufferedWriter.close();
                System.out.println("success!!");
            }else{
                i--;
                System.out.println("fail!!");
            }
        }
    }
}
