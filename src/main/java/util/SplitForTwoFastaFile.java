package util;

import java.io.*;

/**
 * Created by zjc on 2016/11/25.
 */
public class SplitForTwoFastaFile {
    public static void splitFile(String inputDirPath) throws IOException{
        File inputDir = new File(inputDirPath);
        File[] inputFiles = inputDir.listFiles();
        String outputDirPath = inputDirPath + "_single";
        System.out.println(outputDirPath);
        File outputDir = new File(outputDirPath);
        if(!outputDir.exists()){
            outputDir.mkdirs();
        }
        for(File file: inputFiles){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputDirPath + "\\" + file.getName().split("\\.")[0] + "_1.fasta"), false), "utf-8"));
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputDirPath + "\\" + file.getName().split("\\.")[0] + "_2.fasta"), false), "utf-8"));
            String line = bufferedReader.readLine();
            bufferedWriter1.write(line);
            bufferedWriter1.newLine();
            line = bufferedReader.readLine();
            while(line != null && !line.startsWith(">")){
                bufferedWriter1.write(line);
                bufferedWriter1.newLine();
                line = bufferedReader.readLine();
            }
            bufferedWriter1.flush();
            bufferedWriter1.close();
            bufferedWriter2.write(line);
            bufferedWriter2.newLine();
            line = bufferedReader.readLine();
            while(line != null && !line.startsWith(">")){
                bufferedWriter2.write(line);
                bufferedWriter2.newLine();
                line = bufferedReader.readLine();
            }
            bufferedWriter2.flush();
            bufferedWriter2.close();
            bufferedReader.close();
        }
    }
}
