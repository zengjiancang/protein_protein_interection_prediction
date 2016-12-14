package feature.pseacc;

import java.io.*;

/**
 * Created by zjc on 2016/11/23.
 */
public class PseACC {

    public static void pseACCFeature(String inputDirPath, String outputDirPath) throws IOException
    {
        File dirName = new File(inputDirPath);
        File files[] = dirName.listFiles();
        File out = new File(outputDirPath);
        if(!out.exists()){
            out.mkdir();
        }
        for(int i = 0; i < files.length; ++ i)
        {
            File file = files[i];
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputDirPath + "\\" + file.getName()), true), "utf-8"));
            String lineString = bufferedReader.readLine();

            while(lineString != null)
            {
                StringBuilder feature = new StringBuilder();
                for(int j = 0; j < lineString.length(); j ++)
                {
                    if(lineString.charAt(j) == ':')
                    {
                        ++j;
                        while(lineString.charAt(j) != ' ')
                        {
//                            bufferedWriter.write(lineString.charAt(j));
                            feature.append(lineString.charAt(j));
                            ++ j;
                        }
//                        bufferedWriter.write(",");
                        feature.append(",");
                    }
                }
                bufferedWriter.write(feature.substring(0, feature.length() - 1));
                bufferedWriter.newLine();
                lineString = bufferedReader.readLine();
            }
            bufferedReader.close();
            bufferedWriter.flush();
            bufferedWriter.close();
        }

    }
}
