package feature.kskip;

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
public class Kskip {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        if(args.length == 0 || args[0].equals("-help"))
        {
            System.out.println("Usage: java -jar k-skip.jar -i inputFile.fasta -o outputFile -k k_value -f isFusion -m method");
            System.exit(0);
        }
        if(args.length != 10)
        {
            System.out.println("\r\nThe number of parameter is not enough  !!!\r\n");
            System.out.println("Usage: java -jar k-skip.jar -i inputFile.fasta -o outputFile -k k_value -f isFusion -m method");
            System.exit(0);
        }
        String inputFile = args[1];
        String outputFile = args[3];
        int instanceNum = 0;

        int k = 0;
        try {
            k = Integer.parseInt(args[5]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("\r\nThe parameter of -k is not a integer !!\r\n");
            System.out.println("Usage: java -jar k-skip.jar -i inputFile.fasta -o outputFile -k k_value -f isFusion -m method");
            System.exit(0);
        }
        if(k < 0 || k > 2)
        {
            System.out.println("\r\nThe parameter of -k is not available !! k={0, 1, 2}\r\n");
            System.out.println("Usage: java -jar k-skip.jar -i inputFile.fasta -o outputFile -k k_value -f isFusion -m method");
            System.exit(0);
        }
        int method = 0;
        try {
            method = Integer.parseInt(args[9]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("\r\nThe parameter of -k is not a integer !!\r\n");
            System.out.println("Usage: java -jar k-skip.jar -i inputFile.fasta -o outputFile -k k_value -f isFusion -m method");
            System.exit(0);
        }
        if(method < 0 || method > 1)
        {
            System.out.println("\r\nThe parameter of -k is not available !! method={0, 1}\r\n");
            System.out.println("Usage: java -jar k-skip.jar -i inputFile.fasta -o outputFile -k k_value -f isFusion -m method");
            System.exit(0);
        }

        ArrayList<String> proteinList = new ArrayList<String>();
        CheckProtein check = new CheckProtein();
        check.setInstenceNum(instanceNum);
        check.setData(proteinList);
        instanceNum = check.checkIsRight(inputFile);

        String[] allPermutation = new String[400];
        GetPermutation permutation = new GetPermutation();
        permutation.setAllPerm(allPermutation);
        permutation.getPerRun(2);

        double sum0[] = new double[instanceNum];
        int count0[][] = new int[instanceNum][400];
        double sum1[] = new double[instanceNum];
        int count1[][] = new int[instanceNum][400];
        double sum2[] = new double[instanceNum];
        int count2[][] = new int[instanceNum][400];
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputFile), true), "utf-8"));
        for(int i = 0; i < proteinList.size(); ++ i)
        {
            sum0[i] = calc(proteinList.get(i), 0, allPermutation, i, count0);
            sum1[i] = calc(proteinList.get(i), 1, allPermutation, i, count1);
            sum2[i] = calc(proteinList.get(i), 2, allPermutation, i, count2);
        }

        int isFusion = 0;
        try {
            isFusion = Integer.parseInt(args[7]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("\r\nThe parameter of -f is not a integer !!\r\n");
            System.out.println("Usage: java -jar k-skip.jar -i inputFile.fasta -o outputFile -k k_value -f isFusion -m method");
            System.exit(0);
        }
        if(isFusion < 0 || isFusion > 1)
        {
            System.out.println("\r\nThe parameter of -f is not available !! f={0, 1}\r\n");
            System.out.println("Usage: java -jar k-skip.jar -i inputFile.fasta -o outputFile -k k_value -f isFusion -m method");
            System.exit(0);
        }
        if(isFusion == 0)
        {
            if(method == 0)
            {
                switch (k) {
                    case 0:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count0[i][j] + ",");
                            }
                            bufferedWriter.write(count0[i][399] + "\r\n");
                        }
                    }
                    break;
                    case 1:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count1[i][j] + ",");
                            }
                            bufferedWriter.write(count1[i][399] + "\r\n");
                        }
                    }

                    break;
                    case 2:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count2[i][j] + ",");
                            }
                            bufferedWriter.write(count2[i][399] + "\r\n");
                        }
                    }

                    break;

                    default:
                        break;
                }
            }
            else
            {
                switch (k) {
                    case 0:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count0[i][j]/sum0[i] + ",");
                            }
                            bufferedWriter.write(count0[i][399]/sum0[i] + "\r\n");
                        }
                    }
                    break;
                    case 1:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count1[i][j]/sum1[i] + ",");
                            }
                            bufferedWriter.write(count1[i][399]/sum1[i] + "\r\n");
                        }
                    }

                    break;
                    case 2:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count2[i][j]/sum2[i] + ",");
                            }
                            bufferedWriter.write(count2[i][399]/sum2[i] + "\r\n");
                        }
                    }

                    break;

                    default:
                        break;
                }
            }
        }
        else
        {
            if(method == 0)
            {
                switch (k) {
                    case 0:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count0[i][j] + ",");
                            }
                            bufferedWriter.write(count0[i][399] + "\r\n");
                        }
                    }
                    break;
                    case 1:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j <= 399; ++ j)
                            {
                                bufferedWriter.write(count0[i][j] + ",");
                            }
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count1[i][j] + ",");
                            }
                            bufferedWriter.write(count1[i][399] + "\r\n");
                        }
                    }

                    break;
                    case 2:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j <= 399; ++ j)
                            {
                                bufferedWriter.write(count0[i][j] + ",");
                            }
                            for(int j = 0; j <= 399; ++ j)
                            {
                                bufferedWriter.write(count1[i][j] + ",");
                            }
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count2[i][j] + ",");
                            }
                            bufferedWriter.write(count2[i][399] + "\r\n");
                        }
                    }

                    break;

                    default:
                        break;
                }
            }
            else
            {
                switch (k) {
                    case 0:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count0[i][j]/sum0[i] + ",");
                            }
                            bufferedWriter.write(count0[i][399]/sum0[i] + "\r\n");
                        }
                    }
                    break;
                    case 1:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j <= 399; ++ j)
                            {
                                bufferedWriter.write(count0[i][j]/sum0[i] + ",");

                            }
                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count1[i][j]/sum1[i] + ",");
                            }
                            bufferedWriter.write(count1[i][399]/sum1[i] + "\r\n");
                        }
                    }

                    break;
                    case 2:
                    {
                        for(int i = 0; i < instanceNum; ++ i)
                        {
                            for(int j = 0; j <= 399; ++ j)
                            {
                                bufferedWriter.write(count0[i][j]/sum0[i] + ",");

                            }
                            for(int j = 0; j <= 399; ++ j)
                            {
                                bufferedWriter.write(count1[i][j]/sum1[i] + ",");
                            }

                            for(int j = 0; j < 399; ++ j)
                            {
                                bufferedWriter.write(count2[i][j]/sum2[i] + ",");
                            }
                            bufferedWriter.write(count2[i][399]/sum2[i] + "\r\n");
                        }
                    }

                    break;

                    default:
                        break;
                }
            }
        }


        bufferedWriter.flush();
        bufferedWriter.close();

        System.out.println("OK !!!");
    }
    public static double calc(String sequence, int k, String allPerm[], int insNum, int count[][])
    {
        double sum = 0.0;
        int start = 0, end = start + k + 1;
        for(; end < sequence.length(); ++ start, ++ end)
        {
            for(int tempStart = start; tempStart < end; ++ tempStart)
            {
                for(int tempEnd = tempStart + 1; tempEnd <= end; tempEnd ++)
                {
                    //System.out.println(sequence.charAt(tempStart) + "" + sequence.charAt(tempEnd));
                    for(int j = 0; j < allPerm.length; ++ j)
                    {
                        if(sequence.charAt(tempStart) == allPerm[j].charAt(0) && sequence.charAt(tempEnd) == allPerm[j].charAt(1))
                        {
                            count[insNum][j] ++;
                            sum = sum + 1.0;
                            break;
                        }
                    }
                }
            }
        }
        return sum;
    }
}
