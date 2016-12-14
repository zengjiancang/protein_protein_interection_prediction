package runtoolcommand;

import java.io.*;

/**
 * Created by zjc on 2016/11/26.
 */
public class PSSMCommand {
    public static void getPSSMShell(String inputDirPath, String outputDirPath, String name, int fileNum) throws IOException
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\batFiles\\pssm_" + name + ".sh"), false), "utf-8"));
        for(int i = 1; i <= fileNum; ++ i)
        {
            String command = "./psiblast -query " + inputDirPath + "/" + i + "_1.fasta -db swissprot -out " + outputDirPath + i + "_1.out -evalue 0.001 -matrix BLOSUM62 -num_threads 2 -num_iterations 3 -out_ascii_pssm " + outputDirPath + i + "_1.pssm";
            bufferedWriter.write(command);
            bufferedWriter.newLine();
            command = "./psiblast -query " + inputDirPath + "/" + i + "_2.fasta -db swissprot -out " + outputDirPath + i + "_2.out -evalue 0.001 -matrix BLOSUM62 -num_threads 2 -num_iterations 3 -out_ascii_pssm " + outputDirPath + i + "_2.pssm";
            bufferedWriter.write(command);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
