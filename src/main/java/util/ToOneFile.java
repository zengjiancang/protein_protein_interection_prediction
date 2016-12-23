package util;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zjc on 2016/12/19.
 */
public class ToOneFile {
    public static void collectToOneFile(String wrong1, String wrong2, String inputPath, String outputPath) throws IOException{
        File wrongFile1 = new File(wrong1);
        File wrongFile2 = new File(wrong2);
        Set<String> wrongFileSet = new HashSet<String>();
        BufferedReader wrongReader = new BufferedReader(new InputStreamReader(new FileInputStream(wrongFile1), "utf-8"));
        String wrongFileName = wrongReader.readLine();
        while(wrongFileName != null){
            wrongFileSet.add(wrongFileName);
            wrongFileName = wrongReader.readLine();
        }
        wrongReader = new BufferedReader(new InputStreamReader(new FileInputStream(wrongFile2), "utf-8"));
        wrongFileName = wrongReader.readLine();
        while(wrongFileName != null){
            wrongFileSet.add(wrongFileName);
            wrongFileName = wrongReader.readLine();
        }
        wrongReader.close();

        File inputDir = new File(inputPath);
        File[] inputFiles = inputDir.listFiles();
        BufferedWriter countWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\countAfterCollect.txt"), true), "utf-8"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath), false), "utf-8"));
        int fileNum = 0;
        for(File file: inputFiles){
            String fileName = file.getName().split("\\.")[0];
            System.out.print(file.getAbsolutePath() + "\t");
            if(wrongFileSet.contains(fileName)){
                System.out.println();
                continue;
            }
            System.out.println("run!!!");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            String line = bufferedReader.readLine();
            while(line != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileNum ++;
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        countWriter.write(inputPath + "\t" + fileNum);
        countWriter.newLine();
        countWriter.flush();
        countWriter.close();

    }
}
