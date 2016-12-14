package feature.secondary;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by zjc on 2016/11/27.
 */
public class Secondary {

    private static String calcSecondaryFrequency(StringBuilder stringBuilder){
        int coilNum = 0;
        int helixNum = 0;
        int strandNum = 0;
        int length = stringBuilder.length();
        for(int i = 0; i < length; ++ i){
            if(stringBuilder.charAt(i) == 'C'){
                coilNum ++;
            }else if(stringBuilder.charAt(i) == 'H'){
                helixNum ++;
            }else{
                strandNum ++;
            }
        }
        return (coilNum * 1.0 / length) + "," + (helixNum * 1.0 / length) + "," + (strandNum * 1.0 / length);
    }

    private static double calcAverage(ArrayList<Double> scoreList){
        double sum = 0.0;
        for(int i = 0; i < scoreList.size(); ++ i){
            sum += scoreList.get(i);
        }
        return sum / scoreList.size();
    }

    private static double calcVariance(ArrayList<Double> scoreList, double average){
        double variance = 0.0;
        for(int i = 0; i < scoreList.size(); ++ i){
            variance += (Math.pow(scoreList.get(i) - average, 2));
        }
        return variance / (scoreList.size() - 1);
    }

    private static double calcPearsonCorrelationCoefficient(ArrayList<Double> scoreList1, ArrayList<Double> scoreList2, double average1, double average2, double standardDeviation1, double standardDeviation2){
        double pearson = 0.0;
        for(int i = 0; i < scoreList1.size(); i ++){
            pearson += (((scoreList1.get(i) - average1) / standardDeviation1) * ((scoreList2.get(i) - average2) / standardDeviation2));
        }
        return pearson / (scoreList1.size() - 1);
    }

    public static void getSecondaryFeature(String inputDirPath, String outputDirPath) throws IOException {
        File inputDir = new File(inputDirPath);
        File outputDir = new File(outputDirPath);
        if(!outputDir.exists()){
            outputDir.mkdirs();
        }
        File[] inputFiles = inputDir.listFiles();
        int fileNums = inputFiles.length;
        for(int i = 0; i < fileNums; ++ i){
            File file = inputFiles[i];
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            StringBuilder secondaryStructureString = new StringBuilder();
            ArrayList<Double> coilScoreList = new ArrayList<Double>();
            ArrayList<Double> helixScoreList = new ArrayList<Double>();
            ArrayList<Double> strandScoreList = new ArrayList<Double>();

            String line = bufferedReader.readLine();
            line = bufferedReader.readLine();
            line = bufferedReader.readLine();
            while(line != null){
                String[] data = line.trim().split("[ ]+");
                secondaryStructureString.append(data[2]);
                coilScoreList.add(Double.parseDouble(data[3]));
                helixScoreList.add(Double.parseDouble(data[4]));
                strandScoreList.add(Double.parseDouble(data[5]));
                line = bufferedReader.readLine();
            }
            bufferedReader.close();


            double coilAverage1 = calcAverage(coilScoreList);
            double helixAverage1 = calcAverage(helixScoreList);
            double strandAverage1 = calcAverage(strandScoreList);
            double coilStandardDeviation1 = Math.sqrt(calcVariance(coilScoreList, coilAverage1));
            double helixStandardDeviation1 = Math.sqrt(calcVariance(helixScoreList, helixAverage1));
            double strandStandardDeviation1 = Math.sqrt(calcVariance(strandScoreList, strandAverage1));

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputDirPath + "\\" + file.getName().replace(".ss2", ".txt")), false), "utf-8"));
            bufferedWriter.write(calcSecondaryFrequency(secondaryStructureString) + "," + coilAverage1 + "," + helixAverage1 + "," + strandAverage1 + ","
                    + coilStandardDeviation1 + "," + helixStandardDeviation1 + "," + strandStandardDeviation1
                    + calcPearsonCorrelationCoefficient(coilScoreList, helixScoreList, coilAverage1, helixAverage1, coilStandardDeviation1, helixStandardDeviation1) + ","
                    + calcPearsonCorrelationCoefficient(coilScoreList, strandScoreList, coilAverage1, strandAverage1, coilStandardDeviation1, strandStandardDeviation1) + ","
                    + calcPearsonCorrelationCoefficient(helixScoreList, strandScoreList, helixAverage1, strandAverage1, helixStandardDeviation1, strandStandardDeviation1));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}
