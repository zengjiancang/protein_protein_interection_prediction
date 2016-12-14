package runtoolcommand;

import java.io.*;

/**
 * Created by zjc on 2016/11/22.
 */
public class KSkipCommand {

    public static void getKSkipBat(String inputDirPath, String outputDirPath, int k, int isFusion, int method, String name) throws IOException {
        outputDirPath = outputDirPath + "\\" + k + "_" + isFusion + "_" + method;
        System.out.println(outputDirPath);
        File outputDir = new File(outputDirPath);
        if(!outputDir.exists()){
            outputDir.mkdirs();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\batFiles\\kskip_" + name + k + isFusion + method + ".bat"), false), "utf-8"));
        File inputDir = new File(inputDirPath);
        int fileNum = inputDir.listFiles().length;
        for(int i = 1; i <= fileNum; ++ i){
            String command = "java -jar k-skip.jar -i " +  inputDirPath + "\\" + i + ".fasta -o " + outputDirPath + "\\" + i + ".txt -k " + k + " -f " + isFusion + " -m " + method;
            bufferedWriter.write(command);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public void kSkipRun(int isFusion, int method, String InputDir, String outputDir) throws Exception
    {
        File dir = new File(InputDir);
        File[] files = dir.listFiles();
        for(int i = 0; i < files.length; ++ i)
        {
            File file = new File(files[i].getAbsolutePath());
            if(!file.getName().contains("fasta"))
            {
                continue;
            }
            System.out.println(file.getName());
            String result = outputDir + "\\" + file.getName().replaceAll(".fasta", ".txt");

            //String result = file.getAbsolutePath().replace(file.getName(), outputDir + file.getName().replaceAll(".fasta", ".txt"));
            System.out.println(result);
            String command = "java -jar k-skip.jar -i " +  file.getAbsolutePath() + " -o " + result + " -k 1 -f " + isFusion + " -m " + method;
            System.out.println(command);
            Process p = Runtime.getRuntime().exec(command);
            p.waitFor();
        }
    }
}
