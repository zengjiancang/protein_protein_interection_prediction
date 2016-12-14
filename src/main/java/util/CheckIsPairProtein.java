package util;

import java.io.*;

/**
 * Created by zjc on 2016/11/21.
 */
public class CheckIsPairProtein {
    public static void checkIsPairProteins(String inputDir) throws IOException{
        File checkedDir = new File(inputDir);
        File files[] = checkedDir.listFiles();
        File outputDir = new File(inputDir + "_new");
        if(!outputDir.exists()){
            outputDir.mkdir();
        }
        int th = 1;
        for(File file: files){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputDir + "\\" + th + ".fasta"), false), "utf-8"));
            String line = bufferedReader.readLine();
            int count = 0;
            while(line != null){
                if(line.startsWith(">")){
                    count ++;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
            if(count == 2){
                bufferedWriter.flush();
                th ++;
            }
            bufferedWriter.close();
            bufferedReader.close();
        }
    }
}
