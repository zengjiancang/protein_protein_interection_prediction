package util;

import java.io.*;

/**
 * Created by zjc on 2016/11/23.
 */
public class DealForPseACC {

    public static void getPseACCFormat(String intputDir, String label, int isNegative) throws IOException
    {
        File dirName = new File(intputDir);
        File files[] = dirName.listFiles();
        File outputDir = new File(intputDir + "_pseacc");
        if(!outputDir.exists()){
            outputDir.mkdir();
        }
        for(int i = 0; i < files.length; i ++)
        {
            File file = files[i];
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputDir + "\\" + file.getName()), false), "utf-8"));
            String lineString = bufferedReader.readLine();
            if(isNegative == 1){
                while(lineString != null)
                {
                    if(lineString.startsWith(">"))
                    {
                        bufferedWriter.write(">" + lineString.substring(4, 10) + "|" + label + "\r\n");
                        lineString = bufferedReader.readLine();
                        continue;
                    }
                    bufferedWriter.write(ReplaceBadAminoAcid.replaceAminoAcid(lineString) + "\r\n");
                    lineString = bufferedReader.readLine();
                }
            }else{
                while(lineString != null){
                    if(lineString.startsWith(">")){
                        String proteinID = lineString.substring(lineString.length() - 6);
                        bufferedWriter.write(">" + proteinID + "|" + label + "\r\n");
                        lineString = bufferedReader.readLine();
                        continue;
                    }
                    bufferedWriter.write(ReplaceBadAminoAcid.replaceAminoAcid(lineString) + "\r\n");
                    lineString = bufferedReader.readLine();
                }
            }

            bufferedReader.close();
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}
