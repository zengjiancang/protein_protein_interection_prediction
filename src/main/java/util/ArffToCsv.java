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
public class ArffToCsv {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(args[1]), true), "utf-8"));

        int num = 0;

        //Integer.parseInt(args[2]);
        String lineCount = bufferedReader.readLine();
        while( !lineCount.contains("data") )
        {
            num ++;
            lineCount = bufferedReader.readLine();
        }
        num ++;
        num -= 3;
        bufferedReader.close();

        bufferedWriter.write("class, ");
        for(int i = 1; i < num; ++ i)
        {
            bufferedWriter.write("fea" + i + ", ");
        }
        bufferedWriter.write("fea" + num + "\r\n");

        int count = 1;

        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
        String stringline = bufferedReader2.readLine();
        while(count < num + 3)
        {
            stringline = bufferedReader2.readLine();
            count ++;
        }

        stringline = bufferedReader2.readLine();
        while(stringline != null)
        {
            String str[] = stringline.split(",");
            bufferedWriter.write(str[str.length - 1] + ", ");
            for(int i = 0; i < str.length - 2; ++ i)
            {
                bufferedWriter.write(str[i] + ", ");
            }
            bufferedWriter.write(str[str.length - 2] + "\r\n");
            stringline = bufferedReader2.readLine();
        }

        bufferedReader2.close();
        bufferedWriter.flush();
        bufferedWriter.close();

        System.out.println("OK!");

    }
}
