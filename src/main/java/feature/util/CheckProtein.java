package feature.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zjc on 2016/11/22.
 */

public class CheckProtein {

    private static ArrayList<String> baseList;
    private static ArrayList<String> dataList;
    private static int instanceNum;

    public void setInstenceNum(int instanceNum)
    {
        this.instanceNum = instanceNum;
    }

    public void setData(ArrayList<String> dataList)
    {
        this.dataList = dataList;
    }

    public void Check()
    {
        baseList = new ArrayList<String>();
        baseList.add("A");baseList.add("C");baseList.add("D");
        baseList.add("E");baseList.add("F");baseList.add("G");
        baseList.add("H");baseList.add("I");baseList.add("K");
        baseList.add("L");baseList.add("M");baseList.add("N");
        baseList.add("P");baseList.add("Q");baseList.add("R");
        baseList.add("S");baseList.add("T");baseList.add("V");
        baseList.add("W");baseList.add("Y");baseList.add(" ");
    }

    private boolean containBad(String seq) throws Exception
    {

        Check();

        for (int i = 0; i < seq.length(); i++)
        {
            //char c = seq.charAt(i);
            if (!baseList.contains(String.valueOf(seq.charAt(i))))
            {
                return true;
            }
        }
        return false;
    }

    public int checkIsRight(String filePath) throws Exception
    {
        char[] acid = new char[20];
        acid[0] = 'A';acid[1] = 'C';acid[2] = 'D';acid[3] = 'E';
        acid[4] = 'F';acid[5] = 'G';acid[6] = 'H';acid[7] = 'I';
        acid[8] = 'K';acid[9] = 'L';acid[10] = 'M';acid[11] = 'N';
        acid[12] = 'P';acid[13] = 'Q';acid[14] = 'R';acid[15] = 'S';
        acid[16] = 'T';acid[17] = 'V';acid[18] = 'W';acid[19] = 'Y';
        char[] acidB = new char[2];
        acidB[0] = 'N'; acidB[1] = 'D';

        char[] acidZ = new char[2];
        acidZ[0] = 'E'; acidZ[1] = 'Q';

        //标记是第几条蛋白质序列
        int lineNumber = 0;
        instanceNum = 0;
        //先检查是否有数据
        File file = new File(filePath);
        if(!file.exists())
        {
            System.out.println("The input file is not exist!!!");
            System.exit(0);
        }
        if (file.length() == 0)
        {
            System.out.println("The input file is empty!!!");
            System.exit(0);
        }

        //检查是不是蛋白质序列包含不合法序列
        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String readLine = bReader.readLine();
        lineNumber ++;
        while(readLine.length() == 0)
        {
            readLine = bReader.readLine();
            lineNumber ++;
        }
        if(!readLine.trim().startsWith(">"))
        {
            bReader.close();
            System.out.println("There has a error an line: " + lineNumber);
            System.exit(0);
        }
        readLine = bReader.readLine();
        lineNumber ++;
        String seqString = "";
        while(readLine != null)
        {

            if(readLine.contains("X"))
            {

                char[] tempChar = new char[readLine.length()];
                for(int i = 0; i < readLine.length(); ++ i)
                {
                    Random rand = new Random();
                    if(readLine.charAt(i) == 'X')
                    {
                        tempChar[i] = acid[rand.nextInt(20)];
                        continue;
                    }
                    tempChar[i] = readLine.charAt(i);
                }
                readLine = String.valueOf(tempChar);
            }

            if(readLine.contains("B"))
            {

                char[] tempChar = new char[readLine.length()];
                for(int i = 0; i < readLine.length(); ++ i)
                {
                    Random rand = new Random();
                    if(readLine.charAt(i) == 'B')
                    {
                        tempChar[i] = acidB[rand.nextInt(2)];
                        continue;
                    }
                    tempChar[i] = readLine.charAt(i);
                }
                readLine = String.valueOf(tempChar);
            }

            if(readLine.contains("Z"))
            {

                char[] tempChar = new char[readLine.length()];
                for(int i = 0; i < readLine.length(); ++ i)
                {
                    //int index = (int) (Math.random()*20);
                    if(readLine.charAt(i) == 'Z')
                    {
                        Random rand = new Random();
                        tempChar[i] = acidZ[rand.nextInt(2)];
                        continue;
                    }
                    tempChar[i] = readLine.charAt(i);
                }
                readLine = String.valueOf(tempChar);
            }

            if(readLine.contains("U"))
            {

                char[] tempChar = new char[readLine.length()];
                for(int i = 0; i < readLine.length(); ++ i)
                {
                    //int index = (int) (Math.random()*20);
                    if(readLine.charAt(i) == 'U')
                    {
                        tempChar[i] = 'C';
                        continue;
                    }
                    tempChar[i] = readLine.charAt(i);
                }
                readLine = String.valueOf(tempChar);
            }

            if(readLine.length() == 0 || readLine == null)
            {
                readLine = bReader.readLine();
                lineNumber ++;
                continue;
            }
            if(readLine.trim().startsWith(">"))
            {
                dataList.add(seqString);
                instanceNum ++;
                seqString = "";
                readLine = bReader.readLine();
                lineNumber ++;
            }
            else
            {
                if(containBad(readLine))
                {
                    bReader.close();
                    System.out.println("There has a error an line: " + lineNumber);
                    System.exit(0);
                }
                seqString += readLine.trim();
                readLine = bReader.readLine();
                lineNumber ++;
            }
        }

        dataList.add(seqString);
        instanceNum ++;

        bReader.close();
        return instanceNum;
    }
}
