package feature.ngram;

import java.util.ArrayList;

/**
 * Created by zjc on 2016/11/22.
 */
class SequenceDivide {

    private static ArrayList<String> subSeq;
    private static int sum;

    public void setSubSeq(ArrayList<String> subSeq)
    {
        this.subSeq = subSeq;
    }

    public void setSum(int sum)
    {
        this.sum = sum;
    }

    public int divideRun(String sequence, int length)
    {
        int start = 0, end = start + length;
        for(; end <= sequence.length(); ++ end, ++ start)
        {
            //String string = sequence.substring(start, end);
            subSeq.add(sequence.substring(start, end));
            sum ++;
        }
        return sum;
    }
}
