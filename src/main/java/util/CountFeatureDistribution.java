package util;

import java.io.*;

/**
 * Created by zjc on 2017/3/12.
 */
public class CountFeatureDistribution {

    public static void countMRMD(String inputPath, int feaNums) throws IOException{
        File inputFile = new File(inputPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "utf-8"));
        int skipCount = 0;
        int ngramCount = 0;
        int PCPCount = 0;
        int PSSMCount = 0;
        int SSCount = 0;
        String lineString = bufferedReader.readLine();
        int count = 1;
        while(lineString != null && count <= feaNums){
            int feaIndex = Integer.parseInt(lineString.split("\t")[0].substring(3));
            if(0 <= feaIndex && feaIndex < 800){
                skipCount ++;
            }else if(800 <= feaIndex && feaIndex < 1220){
                ngramCount ++;
            }else if(1220 <= feaIndex && feaIndex < 1409){
                PCPCount ++;
            }else if(1409 <= feaIndex && feaIndex < 1449){
                PSSMCount ++;
            }else{
                SSCount ++;
            }
            lineString = bufferedReader.readLine();
            count ++;
        }
        bufferedReader.close();
        System.out.println("skipCount: " + skipCount + "\tngramCount: " + ngramCount + "\tPCPCount: " + PCPCount + "\tPSSMCount: " + PSSMCount + "\tSSCount: " + SSCount);
    }

    public static void countInforGain(String inputPath, int feaNums) throws IOException{
        File inputFile = new File(inputPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "utf-8"));
        int skipCount = 0;
        int ngramCount = 0;
        int PCPCount = 0;
        int PSSMCount = 0;
        int SSCount = 0;
        String lineString = bufferedReader.readLine();
        int count = 1;
        while(lineString != null && count <= feaNums){
            String data[] = lineString.split("[ ]+");
            int feaIndex = Integer.parseInt(data[2]) - 1;
            if(0 <= feaIndex && feaIndex < 800){
                skipCount ++;
            }else if(800 <= feaIndex && feaIndex < 1220){
                ngramCount ++;
            }else if(1220 <= feaIndex && feaIndex < 1409){
                PCPCount ++;
            }else if(1409 <= feaIndex && feaIndex < 1449){
                PSSMCount ++;
            }else{
                SSCount ++;
            }
            lineString = bufferedReader.readLine();
            count ++;
        }
        bufferedReader.close();
        System.out.println("skipCount: " + skipCount + "\tngramCount: " + ngramCount + "\tPCPCount: " + PCPCount + "\tPSSMCount: " + PSSMCount + "\tSSCount: " + SSCount);
    }

    public static void countZtest(String inputPath, int feaNums) throws IOException{
        File inputFile = new File(inputPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "utf-8"));
        int skipCount = 0;
        int ngramCount = 0;
        int PCPCount = 0;
        int PSSMCount = 0;
        int SSCount = 0;
        String lineString = bufferedReader.readLine();
        int count = 1;
        while(lineString != null && count <= feaNums){
            String data[] = lineString.split("\t");
            int feaIndex = Integer.parseInt(data[0].substring(3));
            if(0 <= feaIndex && feaIndex < 800){
                skipCount ++;
            }else if(800 <= feaIndex && feaIndex < 1220){
                ngramCount ++;
            }else if(1220 <= feaIndex && feaIndex < 1409){
                PCPCount ++;
            }else if(1409 <= feaIndex && feaIndex < 1449){
                PSSMCount ++;
            }else{
                SSCount ++;
            }
            lineString = bufferedReader.readLine();
            count ++;
        }
        bufferedReader.close();
        System.out.println("skipCount: " + skipCount + "\tngramCount: " + ngramCount + "\tPCPCount: " + PCPCount + "\tPSSMCount: " + PSSMCount + "\tSSCount: " + SSCount);
    }


}
