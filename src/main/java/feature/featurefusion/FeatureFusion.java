package feature.featurefusion;

import java.io.*;

/**
 * Created by zjc on 2016/12/14.
 */
public class FeatureFusion {

    private static double calcHarmonicMean(double a, double b){
        return Math.abs(a + b) < 1e-10 ? 0.0 : 2 * a * b / (a + b);
    }

    private static double calcArithmeticMean(double a, double b){
        return (a + b) / 2;
    }
    public static void runFeatureFusionByHarmonicMean(String inputPath, String outputPath) throws IOException{
        File inputDir = new File(inputPath);
        File outputDir = new File(outputPath);
        if(!outputDir.exists()){
            outputDir.mkdirs();
        }
        File[] inputFiles = inputDir.listFiles();
        for(File file: inputFiles){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            String outputFileName = outputPath + "\\" + file.getName();
            System.out.println(outputFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputFileName), false), "utf-8"));
            String line = bufferedReader.readLine();
            String[] feature1 = line.split(",");
            line = bufferedReader.readLine();
            bufferedReader.close();
            String[] feature2 = line.split(",");
            int feaLength = feature1.length;
            for(int i = 0; i < feaLength - 1; ++ i){
                bufferedWriter.write(calcHarmonicMean(Double.parseDouble(feature1[i]), Double.parseDouble(feature2[i])) + ",");
            }
            bufferedWriter.write(calcHarmonicMean(Double.parseDouble(feature1[feaLength - 1]), Double.parseDouble(feature2[feaLength - 1])) + "");
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }

    public static void runFeatureFusionByArithmeticMean(String inputPath, String outputPath) throws IOException{
        File inputDir = new File(inputPath);
        File outputDir = new File(outputPath);
        if(!outputDir.exists()){
            outputDir.mkdirs();
        }
        File[] inputFiles = inputDir.listFiles();
        for(File file: inputFiles){
            System.out.println(file.getAbsolutePath());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            String outputFileName = outputPath + "\\" + file.getName();
            System.out.println(outputFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputFileName), false), "utf-8"));
            String line = bufferedReader.readLine();
            String[] feature1 = line.split(",");
            line = bufferedReader.readLine();
            bufferedReader.close();
            String[] feature2 = line.split(",");
            int feaLength = feature1.length;
            for(int i = 0; i < feaLength - 1; ++ i){
                bufferedWriter.write(calcArithmeticMean(Double.parseDouble(feature1[i]), Double.parseDouble(feature2[i])) + ",");
            }
            bufferedWriter.write(calcArithmeticMean(Double.parseDouble(feature1[feaLength - 1]), Double.parseDouble(feature2[feaLength - 1])) + "");
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }

}
