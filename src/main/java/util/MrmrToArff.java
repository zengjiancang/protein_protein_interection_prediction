package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by zjc on 2016/11/22.
 */
public class MrmrToArff {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        int feaNum = Integer.parseInt(args[4]);
        int classNum = Integer.parseInt(args[6]);
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("temp.txt"), true), "utf-8"));
        String string = bufferedReader.readLine();
        while(!string.contains("mRMR features"))
        {
            string = bufferedReader.readLine();
        }
        string = bufferedReader.readLine();
        string = bufferedReader.readLine();

        while(string.length() != 0)
        {
            String str[] = string.split("   | 	 ");
            int len = str.length;

            if(len <= 2)
            {
                string = bufferedReader.readLine();
                continue;
            }

            bufferedWriter.write(str[1]);
            bufferedWriter.newLine();
            string = bufferedReader.readLine();
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

        File file2 = new File(args[1]);
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2), "utf-8"));
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(args[2]), true), "utf-8"));
        bufferedWriter2.write("@relation test");
        bufferedWriter2.newLine();
        for (int i = 1; i <= feaNum; i++)
        {
            bufferedWriter2.write("@attribute feature"+i+" real");
            bufferedWriter2.newLine();
        }
        StringBuffer cString = new StringBuffer();
        cString.append("@attribute class {");
        for(int i = 0; i < classNum; ++ i)
        {
            cString.append(args[7 + i] + ", ");
        }
        bufferedWriter2.write(cString.substring(0, cString.length() - 2) + "}");
        bufferedWriter2.newLine();
        bufferedWriter2.write("@data");
        bufferedWriter2.newLine();

        String string2 = bufferedReader2.readLine();
        string2 = bufferedReader2.readLine();
        File file3 = new File("temp.txt");
        while(string2 != null)
        {
            String str2[] = string2.split(",");
            BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new FileInputStream(file3), "utf-8"));
            String string3 = bufferedReader3.readLine();
            for(int i = 1; i <= feaNum; ++ i)
            {
                bufferedWriter2.write(str2[Integer.parseInt(string3)] + ", ");
                string3 = bufferedReader3.readLine();
            }
            bufferedWriter2.write(str2[0] + "\r\n");
            string2 = bufferedReader2.readLine();
            bufferedReader3.close();
        }
        bufferedReader2.close();
        bufferedWriter2.flush();
        bufferedWriter2.close();
        file3.delete();
        System.out.println("OK!");
    }
}
