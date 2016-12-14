package util;

import java.io.*;

/**
 * Created by zjc on 2016/12/10.
 */
public class CheckWrongFasta {
    public static void getWrongFile(String inputPath, String outputPath, int fileNum, String wrongFileName) throws IOException{

        BufferedWriter wrongWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\" + wrongFileName + ".txt"), false), "utf-8"));
        for(int i = 1; i <= fileNum; ++ i){

            File file1 = new File(inputPath + "\\" + i + "_1.txt");
            File file2 = new File(inputPath + "\\" + i + "_2.txt");
            if(!file1.exists() || !file2.exists()){
                wrongWriter.write(i + "");
                wrongWriter.newLine();
                continue;
            }
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "utf-8"));
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2), "utf-8"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputPath + "//" + i + ".txt"), false), "utf-8"));
            String line = bufferedReader1.readLine();
            while(line != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader1.readLine();
            }
            bufferedReader1.close();
            line = bufferedReader2.readLine();
            while(line != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader2.readLine();
            }
            bufferedReader2.close();
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        wrongWriter.flush();
        wrongWriter.close();
    }
}
