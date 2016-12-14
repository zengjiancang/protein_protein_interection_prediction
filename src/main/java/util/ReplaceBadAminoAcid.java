package util;

import java.util.Random;

/**
 * Created by zjc on 2016/11/25.
 */
public class ReplaceBadAminoAcid {
    public static String replaceAminoAcid(String readLine){
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
        return readLine;
    }
}
