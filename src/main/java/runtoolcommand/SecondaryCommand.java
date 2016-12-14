package runtoolcommand;

import java.io.*;

/**
 * Created by zjc on 2016/11/26.
 */
public class SecondaryCommand {
    public static void getSecondaryShell(String inputDirPath, String name, int fileNum) throws IOException
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\batFiles\\secondary_" + name + ".sh"), false), "utf-8"));
        for(int i = 1; i <= fileNum; ++ i)
        {
            String command = "../../runpsipredplus " + inputDirPath + "/" + i + "_1.fasta";
            bufferedWriter.write(command);
            bufferedWriter.newLine();
            command = "../../runpsipredplus " + inputDirPath + "/" + i + "_2.fasta";
            bufferedWriter.write(command);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
