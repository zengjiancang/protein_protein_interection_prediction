package feature.mrmd;

import java.io.*;
import java.util.*;

/**
 * Created by zjc on 2017/3/7.
 */
public class MRMD {

    private double calcAvaerageForVector(double[] data){
        double average = 0.0;
        for(int i = 0; i < data.length; ++ i){
            average += data[i];
        }
        return average / data.length;
    }

    private double calcVarianceForVector(double[] data, double average){
        double variance = 0.0;
        for(int i = 0; i < data.length; ++ i){
            variance += Math.pow((data[i] - average), 2);
        }
        return Math.sqrt(variance / (data.length - 1));
    }

    private double calcAverageForMatrix(double[][] data, int col, int instanceNums){
        double average = 0.0;
        for(int i = 0; i < instanceNums; ++ i){
            average += data[i][col];
        }
        return average / instanceNums;
    }

    private double calcVarianceForMatrix(double[][] data, int col, int instanceNums, double average){
        double variance = 0.0;
        for(int i = 0; i < instanceNums; ++ i){
            variance += Math.pow((data[i][col] - average), 2);
        }
        return Math.sqrt(variance / (instanceNums - 1));
    }

    private double[] calcPearson(double[][] data, double[] label, int instanceNums, int featureNums){
        System.out.println("calc pearson!");
        double[] pearsonValues = new double[instanceNums];
        double labelAverage = calcAvaerageForVector(label);
        double labelVariance = calcVarianceForVector(label, labelAverage);
        for(int i = 0; i < featureNums; ++ i){
            double featureAverage = calcAverageForMatrix(data, i, instanceNums);
            double featureVariance = calcVarianceForMatrix(data, i, instanceNums, featureAverage);
            double covariance = 0.0;
            for(int j = 0; j < instanceNums; ++ j){
                covariance += (data[j][i] - featureAverage) * (label[j] - labelAverage);
            }
            if(labelVariance * featureVariance < 1e-20){
                pearsonValues[i] = 0.0;
            }else{
                pearsonValues[i] = (covariance / (instanceNums - 1)) / (labelVariance * featureVariance);
            }
//            System.out.println(pearsonValues[i]);
        }
        return pearsonValues;
    }

    private double[] calcED(double[][] data, int instanceNums, int featureNums){
        System.out.println("calc ED!");
        double[][] EDvalues = new double[featureNums][featureNums];
        for(int col1 = 0; col1 < featureNums; ++ col1){
            for(int col2 = 0; col2 < featureNums; ++ col2){
//                System.out.print(col1 + "\t" + col2);
                double temp = 0.0;
                for(int row = 0; row < instanceNums; ++ row){
                    temp += Math.pow((data[row][col1] - data[row][col2]), 2);
                }
                EDvalues[col1][col2] = Math.sqrt(temp);
//                System.out.println("\t" + EDvalues[col1][col2]);
            }
        }
        double[] values = new double[featureNums];
        for(int i = 0; i < featureNums; ++ i){
            double temp = 0.0;
            for(int j = 0; j < featureNums; ++ j){
                temp += EDvalues[i][j];
            }
            values[i] = temp/ (featureNums - 1);
        }
        return values;
    }

    private double calcDotMul(double[][] data, int instanceNums, int col1, int col2){
        double dotMulValue = 0.0;
        for(int i = 0; i < instanceNums; ++ i){
            dotMulValue += (data[i][col1] * data[i][col2]);
        }
        return dotMulValue;
    }

    private double mouLength(double[][] data, int instanceNums, int col){
        double mouLengthValue = 0.0;
        for(int i = 0; i < instanceNums; ++ i){
            mouLengthValue += Math.pow(data[i][col], 2);
        }
        return Math.sqrt(mouLengthValue);
    }

    private double[] calcCosine(double[][] data, int instanceNums, int featureNums){
        System.out.println("calc cosine!");
        double[][] cosineValues = new double[featureNums][featureNums];
        for(int col1 = 0; col1 < featureNums; ++ col1){
            for(int col2 = 0; col2 < featureNums; ++ col2){
//                System.out.print(col1 + "\t" + col2);
                double dotMulValue = calcDotMul(data, instanceNums, col1, col2);
                double mouLength1 = mouLength(data, instanceNums, col1);
                double mouLength2 = mouLength(data, instanceNums, col2);
                if(mouLength1 * mouLength2 < 1e-20){
                    cosineValues[col1][col2] = 0.0;
                }else{
                    cosineValues[col1][col2] = dotMulValue / (mouLength1 * mouLength2);
                }
//                System.out.println("\t" + cosineValues[col1][col2]);
            }
        }
        double[] values = new double[featureNums];
        for(int i = 0; i < featureNums; ++ i){
            double temp = 0.0;
            for(int j = 0; j < featureNums; ++ j){
                temp += cosineValues[i][j];
            }
            values[i] = temp/ (featureNums - 1);
        }
        return values;
    }

    private double[] calcTC(double[][] data, int instanceNums, int featureNums){
        System.out.println("calc TC!");
        double[][] tcValues = new double[featureNums][featureNums];
        for(int col1 = 0; col1 < featureNums; ++ col1){
            for(int col2 = 0; col2 < featureNums; ++ col2){
//                System.out.print(col1 + "\t" + col2);
                double temp = Math.pow(mouLength(data, instanceNums, col1), 2) + Math.pow(mouLength(data, instanceNums, col2), 2) - calcDotMul(data, instanceNums, col1, col2);
                if(temp < 1e-20){
                    tcValues[col1][col2] = 0.0;
                }else{
                    tcValues[col1][col2] = calcDotMul(data, instanceNums, col1, col2) / temp;
                }
//                System.out.println("\t" + tcValues[col1][col2]);
            }
        }
        double[] values = new double[featureNums];
        for(int i = 0; i < featureNums; ++ i){
            double temp = 0.0;
            for(int j = 0; j < featureNums; ++ j){
                temp += tcValues[i][j];
            }
            values[i] = temp/ (featureNums - 1);
        }
        return values;
    }

    public void runMRMD(String inputPath, String outputPath, int instanceNums, int featureNums) throws IOException{
        File inputFile = new File(inputPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "utf-8"));
        String line = bufferedReader.readLine();
        while(!line.contains("@data") || line.contains("@DATA")){
            line = bufferedReader.readLine();
        }
        line = bufferedReader.readLine();
        double[][] data = new double[instanceNums][featureNums];
        double[] label = new double[instanceNums];
        int lineNum = 0;
        while(line != null){
            String[] dataTemp = line.split(",");
            for(int i = 0; i < dataTemp.length - 1; ++ i){
                data[lineNum][i] = Double.parseDouble(dataTemp[i]);
            }
            label[lineNum] = Double.parseDouble(dataTemp[dataTemp.length - 1]);
            lineNum ++;
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
//        for(int i = 0; i < 4; i ++){
//            for(int j = 0; j < featureNums; j ++){
//                System.out.print(data[i][j]);
//            }
//            System.out.println();
//        }

        double[] pearsonValues = calcPearson(data, label, instanceNums, featureNums);
        double[] edValues = calcED(data, instanceNums, featureNums);
        double[] cosineValues = calcCosine(data, instanceNums, featureNums);
        double[] tcValues = calcTC(data, instanceNums, featureNums);

        Map<String, Double> feaMap = new HashMap<String, Double>();
        for(int i = 0; i < featureNums; ++ i){
//            System.out.println(pearsonValues[i] + "\t" + edValues[i] + "\t" + consineValues[i] + "\t" + tcValues[i] + "\t" + (Math.abs(pearsonValues[i]) + edValues[i]));
            feaMap.put("fea" + i, (Math.abs(pearsonValues[i])*3  + edValues[i] + cosineValues[i] - tcValues[i])/3);
        }

        List<Map.Entry<String, Double>> zValueList = new ArrayList<Map.Entry<String, Double>>(feaMap.entrySet());
        System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
        Collections.sort(zValueList, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                if(o1.getValue() > o2.getValue()){
                    return -1;
                }else if(o1.getValue() < o2.getValue()){
                    return 1;
                }else {
                    return 0;
                }
            }
        });

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath), false), "utf-8"));
        for(Map.Entry<String, Double> map: zValueList){
            bufferedWriter.write(map.getKey() + "\t" + map.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
