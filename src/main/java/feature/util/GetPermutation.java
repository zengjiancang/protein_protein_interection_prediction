package feature.util;

/**
 * Created by zjc on 2016/11/22.
 */
public class GetPermutation {

    private static String[] allPermutation;

    public void setAllPerm(String allPermutation[])
    {
        this.allPermutation = allPermutation;
    }

    public void getPerm20(String letter)
    {
        for(int i = 0; i < letter.length(); ++ i)
        {
            allPermutation[i] = letter.charAt(i) + "";
        }
    }

    public void getPerm400(String letter)
    {
        int index = 0;
        for(int i = 0; i < letter.length(); ++ i)
        {
            for(int j = 0; j < letter.length(); ++ j)
            {
                allPermutation[index] = letter.charAt(i) + "" + letter.charAt(j);
                index ++;
            }
        }
    }

    public void getPerm8000(String letter)
    {
        int index = 0;
        for(int i = 0; i < letter.length(); ++ i)
        {
            for(int j = 0; j < letter.length(); ++ j)
            {
                for(int k = 0; k < letter.length(); ++ k)
                {
                    allPermutation[index] = letter.charAt(i) + ""  + letter.charAt(j) + ""  + letter.charAt(k);
                    index ++;
                }
            }
        }
    }

    public void getPerRun(int length)
    {
        String letter = "ACDEFGHIKLMNPQRSTVWY";

        switch (length) {
            case 1:
                getPerm20(letter);
                break;
            case 2:
                getPerm400(letter);
                break;
            case 3:
                getPerm8000(letter);
                break;
            default:
                break;
        }
        //return allPermutation;
    }
}
