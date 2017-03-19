package util;

import java.io.*;

/**
 * Created by zjc on 2017/3/5.
 */
public class FeatureCombination {
    public static void runFeatureCombination(String outputPath, int feaNums, int fileNums, String ... filePaths) throws IOException{
        File files[] = new File[fileNums];
        BufferedReader bufferedReaders[] = new BufferedReader[fileNums];
        for(int i = 0; i < fileNums; ++ i){
            files[i] = new File(filePaths[i]);
            bufferedReaders[i] = new BufferedReader(new InputStreamReader(new FileInputStream(files[i]), "utf-8"));
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath), false), "utf-8"));
        bufferedWriter.write("@relation PPI");
        bufferedWriter.newLine();
        for(int i = 1; i <= feaNums; ++ i){
            bufferedWriter.write("@attribute fea" + i + " numeric");
            bufferedWriter.newLine();
        }
        bufferedWriter.write("@attribute class {1, -1}\r\n@data\r\n");
        String lines[] = new String[fileNums];
        for(int i = 0; i < fileNums; ++ i){
            String line = bufferedReaders[i].readLine();
            while(!line.startsWith("@data")){
                line = bufferedReaders[i].readLine();
            }
            lines[i] = bufferedReaders[i].readLine();
        }
        boolean flag = true;
        for (int i = 0; i < fileNums; ++ i){
            if(lines[i] == null){
                flag = false;
                break;
            }
        }
        while(flag){
            StringBuilder lineString = new StringBuilder();
            for(String line: lines){
                if(line.endsWith("-1")){
                    lineString.append(line.substring(0, line.length() - 2));
                }else{
                    lineString.append(line.substring(0, line.length() - 1));
                }
            }
            if(lines[0].endsWith("-1")){
                lineString.append("-1");
            }else{
                lineString.append("1");
            }
            bufferedWriter.write(lineString.toString());
            bufferedWriter.newLine();
            for(int i = 0; i < fileNums; ++ i){
                lines[i] = bufferedReaders[i].readLine();
            }
            for (int i = 0; i < fileNums; ++ i){
                if(lines[i] == null){
                    flag = false;
                    break;
                }
            }
        }
        for(int i = 0; i < fileNums; ++ i){
            bufferedReaders[i].close();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
