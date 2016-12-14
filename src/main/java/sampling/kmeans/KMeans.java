package sampling.kmeans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by zjc on 2016/11/28.
 */
public class KMeans {

    private static double calcEuclideanDistance(ArrayList<ArrayList<Double>> data, ArrayList<ArrayList<Double>> center, int ithInstance, int jthcenter, int dimensions){
        double euclideanDistance = 0.0;
        for(int i = 0; i < dimensions; ++ i){
            euclideanDistance += Math.pow((data.get(ithInstance).get(i) - center.get(jthcenter).get(i)), 2);
        }
        return euclideanDistance;
    }

    private static double calcSumDisFromCenter(double[] centerDis, int instanceNum){
        double sumDis = 0.0;
        for(int i = 0; i < instanceNum; ++ i){
            sumDis += centerDis[i];
        }
        return sumDis;
    }


    public static void runKMeans(int centers, int instanceNum, int dimensions){
        ArrayList<ArrayList<Double>> data = new ArrayList<ArrayList<Double>>();
//        double[][] data = new double[instanceNum][dimensions];
        ArrayList<ArrayList<Double>> centerList = new ArrayList<ArrayList<Double>>();
        Set<Integer> centerIdSet = new HashSet<Integer>();
        Random random = new Random();
        //随机初始化样本中心
        for(int i = 0; i < centers; ++ i){
            int nextCenterId = random.nextInt(instanceNum);
            while(centerIdSet.contains(nextCenterId)){
                nextCenterId = random.nextInt(centers);
            }
            centerIdSet.add(nextCenterId);
            centerList.add(data.get(nextCenterId));
        }
        double preTotalDis = Double.MAX_VALUE;
        double nowTotalDis = 0.0;
        int[] centerFlag = new int[instanceNum];
        double[] centerDis = new double[instanceNum];
        int round = 1;
        while(true){
            System.out.println("round " + round + " preTotalDis: " + preTotalDis + " nowTotalDis: " + nowTotalDis);
            //计算每个样本到中心的距离
            for(int i = 0; i < instanceNum; i ++){
                double minDis = Double.MAX_VALUE;
                for(int j = 0; j < centers; j ++){
                    double tempDis = calcEuclideanDistance(data, centerList, i, j, dimensions);
                    if(minDis < tempDis){
                        minDis = tempDis;
                        centerFlag[i] = j;
                    }
                }
                centerDis[i] = minDis;
            }

            //总距离变大了，就退出
            nowTotalDis = calcSumDisFromCenter(centerDis, instanceNum);
            if(nowTotalDis > preTotalDis){
                break;
            }
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
                    for(int k = 0; k < dimensions; ++ k){
                        center.set(k, center.get(k) / centerBelongs);
                    }
                    centerList.set(i, center);
                }
            }

            round ++;
        }

    }
}
