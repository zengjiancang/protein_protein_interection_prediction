package sampling.kmeans;

import java.io.*;
import java.util.*;

/**
 * Created by zjc on 2016/11/28.
 */
public class KMeans {

    private static double calcEuclideanDistance(ArrayList<ArrayList<Double>> data, ArrayList<ArrayList<Double>> center, int ithInstance, int jthCenter, int dimensions){
        double euclideanDistance = 0.0;
        for(int i = 0; i < dimensions; ++ i){
            euclideanDistance += Math.pow((data.get(ithInstance).get(i) - center.get(jthCenter).get(i)), 2);
        }
        return Math.sqrt(euclideanDistance);
    }

    private static double calcSumDisFromCenter(double[] centerDis, int instanceNum){
        double sumDis = 0.0;
        for(int i = 0; i < instanceNum; ++ i){
            sumDis += centerDis[i];
        }
        return sumDis;
    }

    private static ArrayList<ArrayList<Double>> getData(String inputPath) throws IOException {
        ArrayList<ArrayList<Double>> data = new ArrayList<ArrayList<Double>>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputPath)), "utf-8"));
        String line = bufferedReader.readLine();
        while(line != null){
            ArrayList<Double> tempList = new ArrayList<Double>();
//            tempList.clear();
            String[] features = line.split(",");
            for(int i = 0; i < features.length; ++ i){
                tempList.add(Double.parseDouble(features[i]));
            }
            data.add(tempList);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return data;
    }

    private static double calDisFromOthers(ArrayList<ArrayList<Double>> data, int iThInstance){
        double dis = 0.0;
        for(ArrayList<Double> feature: data){
            double tempDis = 0.0;
            for(int i = 0; i < feature.size(); ++ i){
                tempDis += (Math.pow((feature.get(i) - data.get(iThInstance).get(i)), 2));
            }
            dis += Math.sqrt(tempDis);
        }
        return dis / data.size();
    }

    private static ArrayList<ArrayList<Double>> getCenterList(ArrayList<ArrayList<Double>> data, int centerNums){
        ArrayList<ArrayList<Double>> centerList = new ArrayList<ArrayList<Double>>();
        Map<Integer, Double> idDisMap = new HashMap<Integer, Double>();
        for(int i = 0; i < data.size(); ++ i){
            idDisMap.put(i, calDisFromOthers(data, i));
        }
        List<Map.Entry<Integer, Double>> sortedList = new ArrayList<Map.Entry<Integer, Double>>(idDisMap.entrySet());
        Collections.sort(sortedList, new Comparator<Map.Entry<Integer, Double>>() {
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                if(o1.getValue() < o2.getValue()){
                    return 1;
                }
                else if(o1.getValue() > o2.getValue()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        for(int i = 0; i < centerNums; ++ i){
            centerList.add(data.get(sortedList.get(i).getKey()));
        }
        return centerList;
    }

    public static void runKMeans(int centers, int instanceNum, String inputPath, String outputPath, int wantedNums) throws IOException{
        System.out.println(inputPath);
        System.out.println("centers: " + centers);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputPath)), "utf-8"));
        String line = bufferedReader.readLine();
        int dimensions = line.split(",").length;
        bufferedReader.close();
        System.out.println("get data");
        ArrayList<ArrayList<Double>> data = getData(inputPath);
        System.out.println("get center list");
        ArrayList<ArrayList<Double>> centerList = getCenterList(data, centers);
//        Set<Integer> centerIdSet = new HashSet<Integer>();
//        Random random = new Random();
        //随机初始化样本中心
//        for(int i = 0; i < centers; ++ i){
//            int nextCenterId = random.nextInt(instanceNum);
//            while(centerIdSet.contains(nextCenterId)){
//                nextCenterId = random.nextInt(centers);
//            }
//            centerIdSet.add(nextCenterId);
//            centerList.add(data.get(nextCenterId));
//        }
        double preTotalDis = Double.MAX_VALUE;
        double nowTotalDis = 0.0;
        double prePreTotalDis = Double.MAX_VALUE;
        int[] centerFlag = new int[instanceNum];//标记样本属于第几个中心
        double[] centerDis = new double[instanceNum];
        int round = 1;
        while(true){
            System.out.println("round " + round + " preTotalDis: " + prePreTotalDis + " nowTotalDis: " + preTotalDis);
            //计算每个样本到中心的距离
            for(int i = 0; i < instanceNum; i ++){
                double minDis = Double.MAX_VALUE;
                for(int j = 0; j < centers; j ++){
                    double tempDis = calcEuclideanDistance(data, centerList, i, j, dimensions);
                    if(minDis > tempDis){
                        minDis = tempDis;
                        centerFlag[i] = j;
                    }
                }
                centerDis[i] = minDis;
            }

            //总距离变大了，就退出
            nowTotalDis = calcSumDisFromCenter(centerDis, instanceNum);
            if(nowTotalDis >= preTotalDis){
                Map<Integer, ArrayList<ArrayList<Double>>> centerData = new HashMap<Integer, ArrayList<ArrayList<Double>>>();
                for(int i = 0; i < centers; ++ i){
                    centerData.put(i, new ArrayList<ArrayList<Double>>());
                }
                for(int i = 0; i < instanceNum; ++ i){
                    centerData.get(centerFlag[i]).add(data.get(i));
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath + "_" + preTotalDis), false), "utf-8"));
//                bufferedWriter.write((round --) + "\t" + preTotalDis);
//                bufferedWriter.newLine();
                for(int i = 0; i < centers; ++ i){
//                    bufferedWriter.write("center: " + i);
                    float centerSize = centerData.get(i).size();
//                    bufferedWriter.newLine();
                    for(ArrayList<Double> feature: getCenterList(centerData.get(i), Math.round(centerSize / instanceNum * wantedNums) == 0? (int) centerSize:Math.round(centerSize / instanceNum * wantedNums))){
                        for(int j = 0; j < dimensions; ++ j){
                            bufferedWriter.write(feature.get(j) + ",");
                        }
                        bufferedWriter.newLine();
                    }
//                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
                bufferedWriter.close();
                break;
            }
            prePreTotalDis = preTotalDis;
            preTotalDis = nowTotalDis;

            //更新样本中心
            for(int i = 0; i < centers; ++ i){
                ArrayList<Double> center = new ArrayList<Double>();
                for(int j = 0; j < dimensions; ++ j){
                    center.add(0.0);
                }
                int centerBelongs = 0;
                for(int j = 0; j < instanceNum; ++ j){
                    if(centerFlag[j] == i){
                        centerBelongs ++;
                        for(int k = 0; k < dimensions; ++ k){
                            center.set(k, center.get(k) + data.get(j).get(k));
                        }
                    }
                }
                for(int k = 0; k < dimensions; ++ k){
                    center.set(k, center.get(k) / centerBelongs);
                }
                centerList.set(i, center);
            }

            round ++;
        }
        System.out.println("kmeans over!!!");

    }
}
