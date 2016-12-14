package feature.pssm;

import java.io.*;

/**
 * Created by zjc on 2016/11/27.
 */
public class PSSM {

    private static void calcSum(double[] data, String line){
        String[] score = line.split("[ ]+");
        for(int j = 3; j < 23; ++ j){
            data[j - 3] += (Double.parseDouble(score[j]));
        }
    }

    private static void calcAverage(File file, double[] average) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
        String line = bufferedReader.readLine();
        line = bufferedReader.readLine();
        line = bufferedReader.readLine();
        line = bufferedReader.readLine();
        int lineNum = 0;
        while(line.length() > 5){
            calcSum(average, line);
            lineNum ++;
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        for(int k = 0; k < 20; ++ k){
            average[k] /= lineNum;
        }
    }

    private static void calcVariance(File file, double[] variance, double[] average) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
        String line = bufferedReader.readLine();
        line = bufferedReader.readLine();
        line = bufferedReader.readLine();
        line = bufferedReader.readLine();
        int lineNum = 0;
        while(line.length() > 5){
            String[] score = line.split("[ ]+");
            for(int j = 3; j < 23; ++ j){
                variance[j - 3] += Math.pow(Double.parseDouble(score[j]) - average[j - 3], 2);
            }
            lineNum ++;
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        for(int k = 0; k < 20; ++ k){
            variance[k] /= lineNum;
        }
    }

    public static void getPSSMFeature(String inputDirPath, String outputDirPath) throws IOException {
        File inputDir = new File(inputDirPath);
        File outputDir = new File(outputDirPath);
        if(!outputDir.exists()){
            outputDir.mkdirs();
        }
        File[] inputFiles = inputDir.listFiles();
        int fileNum = inputFiles.length;
        for(int i = 0; i < fileNum; i ++){
            File file = inputFiles[i];
            System.out.println(file.getAbsolutePath());
            double[] average = new double[20];
            for(int k = 0; k < 20; ++ k){
                average[k] = 0.0;
            }
            calcAverage(file, average);
            double[] variance = new double[20];
            for(int k = 0; k < 20; ++ k){
                variance[k] = 0.0;
            }
            calcVariance(file, variance, average);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputDirPath + "\\" + file.getName().replace(".pssm", ".txt")), false), "utf-8"));
            StringBuilder feature = new StringBuilder();
            for(int k = 0; k < 20; k ++){
                feature.append(average[k] + ",");
            }
            for(int k = 0; k < 19; k ++){
                feature.append(variance[k] + ",");
            }
            feature.append(variance[19]);
            bufferedWriter.write(feature.toString());
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}
