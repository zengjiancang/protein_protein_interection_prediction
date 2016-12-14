package runtoolcommand;

import java.io.*;

/**
 * Created by zjc on 2016/11/23.
 */
public class F188Command {
    public static void get188Shell(String inputDirPath, String outputDirPath, String name, int fileNum) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\batFiles\\188_" + name + ".sh"), false), "utf-8"));
        for(int i = 1; i <= fileNum; ++ i){
            String command = "java -jar get188.jar " +  inputDirPath + "/" + i + ".fasta " + outputDirPath + "/" + i + ".txt 0";
            bufferedWriter.write(command);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
