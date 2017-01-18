package data;

import java.io.*;
import java.util.Random;

/**
 * Created by zjc on 2016/12/23.
 */
public class AminoAcidsReorder {

    private static String reorder(StringBuilder inputString, int changeTimes){
        Random random = new Random();
        int m, n;
        char c;
        for(int j= 0; j < changeTimes; j ++)
        {
//            System.out.println("length: " + inputString.length());
            m = random.nextInt(inputString.length());
            n = random.nextInt(inputString.length());
            c = inputString.charAt(m);
            inputString.setCharAt(m, inputString.charAt(n));
            inputString.setCharAt(n, c);
        }
        return inputString.toString();
    }

    public static void getAminoAcidsReorder(String inputPath, String outputPath, int changeTimes) throws IOException
    {
        File inputDir = new File(inputPath);
        File inputFiles[] = inputDir.listFiles();
        File outputDir = new File(outputPath);
        if(!outputDir.exists()){
            outputDir.mkdirs();
        }

        for(File file: inputFiles)
        {
            System.out.println(file.getAbsolutePath());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputDir + "//" + file.getName().split("\\.")[0] + ".fasta"), false), "utf-8"));
            String lineString = bufferedReader.readLine();
            while(lineString != null)
            {
                if(lineString.length() == 0){
                    lineString = bufferedReader.readLine();
                    continue;
                }
                if(lineString.contains(">"))
                {
                    bufferedWriter.write(lineString);
                    bufferedWriter.newLine();
                    lineString = bufferedReader.readLine();
                    continue;
                }
                StringBuilder tempString = new StringBuilder();
                while((lineString != null) && (!lineString.contains(">")))
                {
                    tempString.append(lineString);
                    lineString = bufferedReader.readLine();
                }
//                System.out.println(tempString);
                bufferedWriter.write(reorder(tempString, changeTimes));
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.flush();
            bufferedWriter.close();

        }
    }
}
