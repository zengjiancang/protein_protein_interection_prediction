package feature;

import java.io.*;
import java.util.*;

/**
 * Created by zjc on 2017/3/6.
 */
public class Ztest {
    public static void calcZtest(String inputPath, String outputPath, int instanceNums, int featureNums) throws IOException{
        File inputFile = new File(inputPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "utf-8"));
        String readLine = bufferedReader.readLine();
        while(!readLine.startsWith("@data")){
            readLine = bufferedReader.readLine();
        }
        readLine = bufferedReader.readLine();
        int positiveLine = 0, negativeLine = 0;
        double[][] positiveData = new double[featureNums][instanceNums];
        double[][] negativeData = new double[featureNums][instanceNums];
        while(readLine != null){
            if(readLine.endsWith("-1")){
                String negative[] = readLine.split(",");
                for(int i = 0; i < featureNums; ++ i){
                    negativeData[i][negativeLine] = Double.parseDouble(negative[i]);
                }
                negativeLine ++;
            }else{
                String positive[] = readLine.split(",");
                for(int i = 0; i < featureNums; ++ i){
                    positiveData[i][positiveLine] = Double.parseDouble(positive[i]);
                }
                positiveLine ++;
            }
            readLine = bufferedReader.readLine();
        }
        bufferedReader.close();

        Map<String, Double> zValueMap = new TreeMap<String, Double>();

        for(int i = 0; i < featureNums; ++ i){
            System.out.print("fea" + i + "\tpositiveAverage\t");
            double positiveAverage = calcAverage(positiveData, instanceNums, i);
            double negativeAverage = calcAverage(negativeData, instanceNums, i);
            double positiveStandarVariance = calcStandarVariance(positiveData, instanceNums, i, positiveAverage);
            double negativeStandarVariance = calcStandarVariance(negativeData, instanceNums, i, negativeAverage);
            System.out.println(positiveAverage + "negativeAverage\t" + negativeAverage + "positiveStandarVariance\t" + positiveStandarVariance + "negativeStandarVariance\t" + negativeStandarVariance);
            double temp = Math.sqrt(positiveStandarVariance/instanceNums + negativeStandarVariance/instanceNums);
            if(temp < 1e-20){
                zValueMap.put("fea" + i, 0.0);
            }else{
                zValueMap.put("fea" + i, Math.abs((positiveAverage - negativeAverage)/temp));
            }
        }
        //排序
        List<Map.Entry<String, Double>> zValueList = new ArrayList<Map.Entry<String, Double>>(zValueMap.entrySet());
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

    public static double calcAverage(double[][] data, int instanceNums, int ithFeature){
        double average = 0.0;
        for(int i = 0; i < instanceNums; ++ i){
            average += data[ithFeature][i];
        }
        return average / instanceNums;
    }

    public static double calcStandarVariance(double[][] data, int instanceNums, int ithFeature, double average){
        double variance = 0.0;
        for(int i = 0; i < instanceNums; ++ i){
            variance += Math.pow(data[ithFeature][i] - average, 2);
        }
        return Math.sqrt(variance / instanceNums);
    }

}
