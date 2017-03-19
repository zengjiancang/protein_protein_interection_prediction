package util;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by zjc on 2017/3/6.
 */
public class FeatureSelect {

    public static void getMRMDFeature(String feaInputPath, String arffInputPath, String outputPath, int featureNums) throws IOException{
        File feaInputFile = new File(feaInputPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(feaInputFile), "utf-8"));
        String line = bufferedReader.readLine();
        ArrayList<Integer> feaList = new ArrayList<Integer>();
        int feaNums = 1;
        while(line != null && feaNums <= featureNums){
            int index = Integer.parseInt(line.split("\t")[0].substring(3));
            feaList.add(index);
            feaNums ++;
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        File arffInputFile = new File(arffInputPath);
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(arffInputFile), "utf-8"));
        String dataLine = bufferedReader1.readLine();

        while(!dataLine.startsWith("@data")){
//            System.out.println(dataLine);
            dataLine = bufferedReader1.readLine();
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath), false), "utf-8"));
        bufferedWriter.write("@relation PPI");
        bufferedWriter.newLine();
        for(int i = 1; i <= featureNums; ++ i){
            bufferedWriter.write("@attribute fea" + i + " numeric");
            bufferedWriter.newLine();
        }
        bufferedWriter.write("@attribute class {1, -1}\r\n@data\r\n");

        dataLine = bufferedReader1.readLine();
        while(dataLine != null){
            String[] data = dataLine.split(",");
            for(Integer index: feaList){
                bufferedWriter.write(data[index] + ",");
            }
            bufferedWriter.write(data[data.length - 1]);
            bufferedWriter.newLine();
            dataLine = bufferedReader1.readLine();
        }
        bufferedReader1.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void getZtestFeature(String feaInputPath, String arffInputPath, String outputPath, int featureNums) throws IOException{
        File feaInputFile = new File(feaInputPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(feaInputFile), "utf-8"));
        String line = bufferedReader.readLine();
        ArrayList<Integer> feaList = new ArrayList<Integer>();
        int feaNums = 1;
        while(line != null && feaNums <= featureNums){
            String data[] = line.split("\t");
            int index = Integer.parseInt(data[0].substring(3));
            feaList.add(index);
            feaNums ++;
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        File arffInputFile = new File(arffInputPath);
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(arffInputFile), "utf-8"));
        String dataLine = bufferedReader1.readLine();

        while(!dataLine.startsWith("@data")){
            dataLine = bufferedReader1.readLine();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath), false), "utf-8"));
        bufferedWriter.write("@relation PPI");
        bufferedWriter.newLine();
        for(int i = 1; i <= featureNums; ++ i){
            bufferedWriter.write("@attribute fea" + i + " numeric");
            bufferedWriter.newLine();
        }
        bufferedWriter.write("@attribute class {1, -1}\r\n@data\r\n");

        dataLine = bufferedReader1.readLine();
        while(dataLine != null){
            String[] data = dataLine.split(",");
            for(Integer index: feaList){
                bufferedWriter.write(data[index] + ",");
            }
            bufferedWriter.write(data[data.length - 1]);
            bufferedWriter.newLine();
            dataLine = bufferedReader1.readLine();
        }
        bufferedReader1.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void getInforGainFeature(String feaInputPath, String arffInputPath, String outputPath, int featureNums) throws IOException{
        File feaInputFile = new File(feaInputPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(feaInputFile), "utf-8"));
        String line = bufferedReader.readLine();
        ArrayList<Integer> feaList = new ArrayList<Integer>();
        int feaNums = 1;
        while(line != null && feaNums <= featureNums){
            String data[] = line.split("[ ]+");
            int index = Integer.parseInt(data[2]) - 1;
            feaList.add(index);
            feaNums ++;
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        File arffInputFile = new File(arffInputPath);
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(arffInputFile), "utf-8"));
        String dataLine = bufferedReader1.readLine();
        while(!dataLine.contains("@data")){
            dataLine = bufferedReader1.readLine();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath), false), "utf-8"));
        bufferedWriter.write("@relation PPI");
        bufferedWriter.newLine();
        for(int i = 1; i <= featureNums; ++ i){
            bufferedWriter.write("@attribute fea" + i + " numeric");
            bufferedWriter.newLine();
        }
        bufferedWriter.write("@attribute class {1, -1}\r\n@data\r\n");

        dataLine = bufferedReader1.readLine();
        while(dataLine != null){
            String[] data = dataLine.split(",");
            for(Integer index: feaList){
                bufferedWriter.write(data[index] + ",");
            }
            bufferedWriter.write(data[data.length - 1]);
            bufferedWriter.newLine();
            dataLine = bufferedReader1.readLine();
        }
        bufferedReader1.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }






}
