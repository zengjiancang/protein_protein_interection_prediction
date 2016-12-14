package feature.ngram;

import feature.util.CheckProtein;
import feature.util.GetPermutation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * Created by zjc on 2016/11/22.
 */
public class Ngram {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        if(args.length == 0 || args[0].equals("-help"))
        {
            System.out.println("Usage: java -jar n-gram.jar -i inputFile.fasta -o outputFile -n n_value -f fusion -m method");
            System.exit(0);
        }
        if(args.length != 10)
        {
            System.out.println("\r\nThe number of parameter is not enough  !!!\r\n");
            System.out.println("Usage: java -jar n-gram.jar -i inputFile.fasta -o outputFile -n n_value -f fusion -m method");
            System.exit(0);
        }
        String filePath = args[1];
        String outputFile = args[3];

        int length20 = 1;
        int length400 = 2;
        int length8000 = 3;
        int instanceNum = 0;


        int n = 0;
        try {
            n = Integer.parseInt(args[5]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("\r\nThe parameter of -n is not a integer !!\r\n");
            System.out.println("Usage: java -jar n-gram.jar -i inputFile.fasta -o outputFile -n n_value -f fusion -m method");
            System.exit(0);
        }
        if(n <= 0 || n > 3)
        {
            System.out.println("\r\nThe parameter of -n is not available !! n={1, 2, 3}\r\n");
            System.exit(0);
        }

        int isFusion = 1;
        try {
            isFusion = Integer.parseInt(args[7]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("\r\nThe parameter of -f is not a integer !!\r\n");
            System.out.println("Usage: java -jar n-gram.jar -i inputFile.fasta -o outputFile -n n_value -f fusion -m method");
            System.exit(0);
        }
        if(isFusion < 0 || isFusion > 1)
        {
            System.out.println("\r\nThe parameter of -f is not available !! f={0, 1}\r\n");
            System.exit(0);
        }

        int method = 1;
        try {
            method = Integer.parseInt(args[9]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("\r\nThe parameter of -m is not a integer !!\r\n");
            System.out.println("Usage: java -jar n-gram.jar -i inputFile.fasta -o outputFile -n n_value -f fusion -m method");
            System.exit(0);
        }
        if(method < 0 || method > 1)
        {
            System.out.println("\r\nThe parameter of -f is not available !! m={0, 1}\r\n");
            System.exit(0);
        }
        String targePerm20[] = new String[20];
        String targePerm400[] = new String[400];
        String targePerm8000[] = new String[8000];

        GetPermutation getPerm = new GetPermutation();
        getPerm.setAllPerm(targePerm20);
        getPerm.getPerRun(1);
        getPerm.setAllPerm(targePerm400);
        getPerm.getPerRun(2);
        getPerm.setAllPerm(targePerm8000);
        getPerm.getPerRun(3);


        ArrayList<String> proteinString = new ArrayList<String>();
        CheckProtein check = new CheckProtein();
        check.setData(proteinString);
        check.setInstenceNum(instanceNum);
        instanceNum = check.checkIsRight(filePath);

        ArrayList<Integer> proteinLength = new ArrayList<Integer>();
        for(int i = 0; i < instanceNum; ++ i){
            proteinLength.add(proteinString.get(i).length());
        }



        ArrayList<String> subSeq20 = new ArrayList<String>();
        ArrayList<String> subSeq400 = new ArrayList<String>();
        ArrayList<String> subSeq8000 = new ArrayList<String>();

        int count20[][] = new int[instanceNum][20];
        int count400[][] = new int[instanceNum][400];
        int count8000[][] = new int[instanceNum][8000];


        int sum20 = 0;
        int sum400 = 0;
        int sum8000 = 0;

        boolean[][] flag20 = new boolean[20][instanceNum];
        boolean[][] flag400 = new boolean[400][instanceNum];
        boolean[][] flag8000 = new boolean[8000][instanceNum];

        SequenceDivide divide = new SequenceDivide();





        for(int i = 0; i < instanceNum; ++ i)
        {
            if(!subSeq20.isEmpty())
            {
                subSeq20.clear();
            }
            divide.setSubSeq(subSeq20);
            divide.setSum(sum20);
            sum20 = divide.divideRun(proteinString.get(i), length20);
            String string = proteinString.get(i);
            for(int j = 0; j < sum20; ++ j)
            {
                for(int k = 0; k < 20; ++ k)
                {
                    String temp1 = subSeq20.get(j), temp2 = targePerm20[k];
                    if(subSeq20.get(j).equals(targePerm20[k]))
                    {
                        count20[i][k] ++;
                        flag20[k][i] = true;
                        break;
                    }
                }
            }
            sum20 = 0;
        }





        divide.setSubSeq(subSeq400);
        for(int i = 0; i < instanceNum; ++ i)
        {
            if(!subSeq400.isEmpty())
            {
                subSeq400.clear();
            }
            divide.setSum(sum400);
            sum400 = divide.divideRun(proteinString.get(i), length400);
            for(int j = 0; j < sum400; ++ j)
            {
                for(int k = 0; k < 400; ++ k)
                {
                    if(subSeq400.get(j).equals(targePerm400[k]))
                    {
                        count400[i][k] ++;
                        flag400[k][i] = true;
                        break;
                    }
                }
            }
            sum400 = 0;
        }

        divide.setSubSeq(subSeq8000);
        for(int i = 0; i < instanceNum; ++ i)
        {
            if(!subSeq8000.isEmpty())
            {
                subSeq8000.clear();
            }
            divide.setSum(sum8000);
            sum8000 = divide.divideRun(proteinString.get(i), length8000);
            for(int j = 0; j < sum8000; ++ j)
            {
                for(int k = 0; k < 8000; ++ k)
                {
                    if(subSeq8000.get(j).equals(targePerm8000[k]))
                    {
                        count8000[i][k] ++;
                        flag8000[k][i] = true;
                        break;
                    }
                }
            }
            sum8000 = 0;
        }



        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputFile), true), "utf-8"));

        if(method == 0)
        {
            switch (isFusion) {
                case 0:
                {
                    switch (n) {
                        case 1:
                        {

                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 19; j ++)
                                {

                                    bufferedWriter.write(count20[i][j]  + ",");
                                }

                                bufferedWriter.write(count20[i][19]  + "\r\n");
                            }

                        }
                        break;
                        case 2:
                        {

                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 399; j ++)
                                {

                                    bufferedWriter.write(count400[i][j] + ",");
                                }

                                bufferedWriter.write(count400[i][399]  + "\r\n");
                            }

                        }
                        break;
                        case 3:
                        {

                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 7999; j ++)
                                {

                                    bufferedWriter.write(count8000[i][j]  + ",");
                                }

                                bufferedWriter.write(count8000[i][7999] + "\r\n");
                            }

                        }
                        break;
                        default:
                            break;
                    }
                }
                break;
                case 1:
                {
                    switch (n) {
                        case 1:
                        {

                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 19; j ++)
                                {

                                    bufferedWriter.write(count20[i][j] + ",");
                                }

                                bufferedWriter.write(count20[i][19]  + "\r\n");
                            }

                        }
                        break;
                        case 2:
                        {

                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 20; j ++)
                                {

                                    bufferedWriter.write(count20[i][j] + ",");
                                }
                                //bufferedWriter.write("hehehehehehehehehehehehe");
                                for(int j = 0; j < 399; j ++)
                                {

                                    bufferedWriter.write(count400[i][j] + ",");
                                }

                                bufferedWriter.write(count400[i][399]  + "\r\n");
                            }

                        }
                        break;
                        case 3:
                        {

                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 20; j ++)
                                {

                                    bufferedWriter.write(count20[i][j] + ",");
                                }
                                for(int j = 0; j < 400; j ++)
                                {

                                    bufferedWriter.write(count400[i][j] + ",");
                                }
                                for(int j = 0; j < 7999; j ++)
                                {

                                    bufferedWriter.write(count8000[i][j] + ",");
                                }

                                bufferedWriter.write(count8000[i][7999] + "\r\n");
                            }

                        }
                        break;
                        default:
                            break;
                    }
                }
                break;

                default:
                    break;
            }

        }
        else
        {
            switch (isFusion) {
                case 0:
                {
                    switch (n) {
                        case 1:
                        {
                            double temp = 0.0;
                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 19; j ++)
                                {
//						temp = countOccur(flag20, j, instanceNum);
//						bufferedWriter.write(count20[i][j] * temp + ",");
                                    bufferedWriter.write(count20[i][j] * 1.0 / proteinLength.get(i) + ",");
                                }
//					temp = countOccur(flag20, 19, instanceNum);
//					bufferedWriter.write(count20[i][19] * temp + "\r\n");
                                bufferedWriter.write(count20[i][19] * 1.0 / proteinLength.get(i) + "\r\n");
                            }

                        }
                        break;
                        case 2:
                        {
                            double temp = 0.0;
                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 399; j ++)
                                {
//						temp = countOccur(flag400, j, instanceNum);
//						bufferedWriter.write(count400[i][j] * temp + ",");
                                    bufferedWriter.write(count400[i][j] * 1.0 / proteinLength.get(i) + ",");
                                }
//					temp = countOccur(flag400, 399, instanceNum);
//					bufferedWriter.write(count400[i][399] * temp + "\r\n");
                                bufferedWriter.write(count400[i][399] * 1.0 / proteinLength.get(i) + "\r\n");
                            }

                        }
                        break;
                        case 3:
                        {
                            double temp = 0.0;
                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 7999; j ++)
                                {
//						temp = countOccur(flag8000, i, instanceNum);
//						bufferedWriter.write(count8000[i][j] * temp + ",");
                                    bufferedWriter.write(count8000[i][j] * 1.0 / proteinLength.get(i) + ",");
                                }
//					temp = countOccur(flag8000, 7999, instanceNum);
//					bufferedWriter.write(count8000[i][7999] * temp + "\r\n");
                                bufferedWriter.write(count8000[i][7999] * 1.0 / proteinLength.get(i) + "\r\n");
                            }

                        }
                        break;
                        default:
                            break;
                    }
                }
                break;
                case 1:
                {
                    switch (n) {
                        case 1:
                        {
                            double temp = 0.0;
                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 19; j ++)
                                {
//						temp = countOccur(flag20, j, instanceNum);
//						bufferedWriter.write(count20[i][j] * temp + ",");
                                    bufferedWriter.write(count20[i][j] * 1.0 / proteinLength.get(i) + ",");
                                }
//					temp = countOccur(flag20, 19, instanceNum);
//					bufferedWriter.write(count20[i][19] * temp + "\r\n");
                                bufferedWriter.write(count20[i][19] * 1.0 / proteinLength.get(i) + "\r\n");
                            }

                        }
                        break;
                        case 2:
                        {
                            double temp = 0.0;
                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 20; j ++)
                                {
//						temp = countOccur(flag20, j, instanceNum);
//						bufferedWriter.write(count20[i][j] * temp + ",");
                                    bufferedWriter.write(count20[i][j] * 1.0 / proteinLength.get(i) + ",");
                                }
                                //bufferedWriter.write("hehehehehehehehehehehehe");
                                for(int j = 0; j < 399; j ++)
                                {
//						temp = countOccur(flag400, j, instanceNum);
//						bufferedWriter.write(count400[i][j] * temp + ",");
                                    bufferedWriter.write(count400[i][j] * 1.0 / proteinLength.get(i) + ",");
                                }
//					temp = countOccur(flag400, 399, instanceNum);
//					bufferedWriter.write(count400[i][399] * temp + "\r\n");
                                bufferedWriter.write(count400[i][399] * 1.0 / proteinLength.get(i) + "\r\n");
                            }

                        }
                        break;
                        case 3:
                        {
                            double temp = 0.0;
                            for(int i = 0; i < instanceNum; i ++)
                            {
                                for(int j = 0; j < 20; j ++)
                                {
//						temp = countOccur(flag20, j, instanceNum);
//						bufferedWriter.write(count20[i][j] * temp + ",");
                                    bufferedWriter.write(count20[i][j] * 1.0 / proteinLength.get(i) + ",");
                                }
                                for(int j = 0; j < 400; j ++)
                                {
//						temp = countOccur(flag400, j, instanceNum);
//						bufferedWriter.write(count400[i][j] * temp + ",");
                                    bufferedWriter.write(count400[i][j] * 1.0 / proteinLength.get(i) + ",");
                                }
                                for(int j = 0; j < 7999; j ++)
                                {
//						temp = countOccur(flag8000, j, instanceNum);
//						bufferedWriter.write(count8000[i][j] * temp + ",");
                                    bufferedWriter.write(count8000[i][j] * 1.0 / proteinLength.get(i) + ",");
                                }
//					temp = countOccur(flag8000, 7999, instanceNum);
//					bufferedWriter.write(count8000[i][7999] * temp + "\r\n");
                                bufferedWriter.write(count8000[i][7999] * 1.0 / proteinLength.get(i) + "\r\n");
                            }

                        }
                        break;
                        default:
                            break;
                    }
                }
                break;

                default:
                    break;
            }

        }

        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("OK!!");
    }

    public static double countOccur(boolean[][] flag, int row, int instanceNum)
    {
        double sum = 0.0;
        for(int i = 0; i < instanceNum; ++ i)
        {
            if(flag[row][i])
            {
                sum ++;
            }
        }
        return sum/instanceNum;
    }

}
