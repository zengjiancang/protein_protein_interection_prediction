package runtoolcommand;

import java.io.*;

/**
 * Created by zjc on 2016/11/23.
 */
public class PseACCCommand {

    public static void getPseACCShell(String inputDirPath, String outputDirPath, String name, int fileNum) throws IOException
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\batFiles\\pseacc_" + name + ".sh"), false), "utf-8"));
        for(int i = 1; i <= fileNum; ++ i)
        {
            String command = "./pseb -i " + inputDirPath + "/" + i + ".fasta -o " + outputDirPath + "/" + i +".txt -t 1\r\n";
            bufferedWriter.write(command);
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
