package util;

import java.io.*;

/**
 * Created by zjc on 2017/2/27.
 */
public class GetArffFiles {
    public static void constructArffFile(String negativeFilePath, String positiveFilePath, String outputPath, int samples, int featureNums) throws IOException{
        File positiveFile = new File(positiveFilePath);
        File negativeFile = new File(negativeFilePath);
        System.out.println(positiveFile.getAbsolutePath() + "\t" + negativeFile.getAbsolutePath());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath + "\\" + negativeFile.getName().split("\\.")[0] + ".arff"), false), "utf-8"));
        bufferedWriter.write("@relation PPI");
        bufferedWriter.newLine();
        for(int i = 1; i <= featureNums; ++ i){
            bufferedWriter.write("@attribute fea" + i + " numeric");
            bufferedWriter.newLine();
        }
        bufferedWriter.write("@attribute class {1, -1}\r\n@data\r\n");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(negativeFile), "utf-8"));
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(positiveFile), "utf-8"));
        String lineString = bufferedReader.readLine();
        int count = 1;
        while(count <= samples && lineString != null){
            if(lineString.endsWith(",")){
                bufferedWriter.write(lineString + "-1");
            }
            else{
                bufferedWriter.write(lineString + ",-1");
            }
            bufferedWriter.newLine();
            lineString = bufferedReader.readLine();
            count ++;
        }
        bufferedReader.close();
        count = 1;
        lineString = bufferedReader1.readLine();
        while(count <= samples && lineString != null){
            if(lineString.endsWith(",")){
                bufferedWriter.write(lineString + "1");
            }
            else{
                bufferedWriter.write(lineString + ",1");
            }
            bufferedWriter.newLine();
            lineString = bufferedReader1.readLine();
            count ++;
        }
        bufferedReader1.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void constructArffFile188(String negativeFilePath, String positiveFilePath, String outputPath, int samples, int featureNums) throws IOException{
        File positiveFile = new File(positiveFilePath);
        File negativeFile = new File(negativeFilePath);
        System.out.println(positiveFile.getAbsolutePath() + "\t" + negativeFile.getAbsolutePath());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath + "\\" + negativeFile.getName().split("\\.")[0] + ".arff"), false), "utf-8"));
        bufferedWriter.write("@relation PPI");
        bufferedWriter.newLine();
        for(int i = 1; i <= featureNums; ++ i){
            bufferedWriter.write("@attribute fea" + i + " numeric");
            bufferedWriter.newLine();
        }
        bufferedWriter.write("@attribute class {1, -1}\r\n@data\r\n");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(negativeFile), "utf-8"));
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(positiveFile), "utf-8"));
        String lineString = bufferedReader.readLine();
        int count = 1;
        while(count <= samples && lineString != null){
            if(lineString.endsWith(",")){
                bufferedWriter.write(lineString.substring(0, lineString.length() - 2) + "-1");
            }
            else{
                bufferedWriter.write(lineString.substring(0, lineString.length() - 1) + ",-1");
            }
            bufferedWriter.newLine();
            lineString = bufferedReader.readLine();
            count ++;
        }
        bufferedReader.close();
        lineString = bufferedReader1.readLine();
        while(lineString != null){
            if(lineString.endsWith(",")){
                bufferedWriter.write(lineString.substring(0, lineString.length() - 2) + "1");
            }
            else{
                bufferedWriter.write(lineString.substring(0, lineString.length() - 1) + ",1");
            }
            bufferedWriter.newLine();
            lineString = bufferedReader1.readLine();
        }
        bufferedReader1.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
