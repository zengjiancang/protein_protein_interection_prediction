package run;

import feature.pseacc.PseACC;
import feature.pssm.PSSM;
import runtoolcommand.*;
import util.*;

import java.io.IOException;

import static util.DealForPseACC.*;

/**
 * Created by zjc on 2016/11/21.
 */
public class RunPPI {
    public static void main(String args[]) throws IOException{
        //获取正例序列
//        GetPositiveData.getPosProteinSequence("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\Celeg20160731.txt");
//        GetPositiveData.getPosProteinSequence("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\Dmela20160731.txt");
//        GetPositiveData.getPosProteinSequence("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\Ecoli20160731.txt");
//        GetPositiveData.getPosProteinSequence("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\Hpylo20160731.txt");
//        GetPositiveData.getPosProteinSequence("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\Mmusc20160731.txt");
//        GetPositiveData.getPosProteinSequence("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\Rnorv20160731.txt");
//        GetPositiveData.getPosProteinSequence("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\Scere20160731.txt");
//        GetPositiveData.getPosProteinSequence("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\Hsapi20160731.txt");


        //获取反例序列
//        GetNegatomeData.getNegatomeData("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\negatome.txt");

        //检查是否是一对都存在
//        CheckIsPairProtein.checkIsPairProteins("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome");
//        CheckIsPairProtein.checkIsPairProteins("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731");
//        CheckIsPairProtein.checkIsPairProteins("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731");
//        CheckIsPairProtein.checkIsPairProteins("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731");
//        CheckIsPairProtein.checkIsPairProteins("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731");
//        CheckIsPairProtein.checkIsPairProteins("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731");
//        CheckIsPairProtein.checkIsPairProteins("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731");
//        CheckIsPairProtein.checkIsPairProteins("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731");
//        CheckIsPairProtein.checkIsPairProteins("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731");

//        //获取Ngram的bat执行文件
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Negatome", 1, 0, 0, "Negatome");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Negatome", 1, 0, 1, "Negatome");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Negatome", 2, 0, 0, "Negatome");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Negatome", 2, 0, 1, "Negatome");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Negatome", 2, 1, 0, "Negatome");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Negatome", 2, 1, 1, "Negatome");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Negatome", 3, 0, 0, "Negatome");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Negatome", 3, 0, 1, "Negatome");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Negatome", 3, 1, 0, "Negatome");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Negatome", 3, 1, 1, "Negatome");

//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Celeg20160731", 1, 0, 0, "Celeg20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Celeg20160731", 1, 0, 1, "Celeg20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Celeg20160731", 2, 0, 0, "Celeg20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Celeg20160731", 2, 0, 1, "Celeg20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Celeg20160731", 2, 1, 0, "Celeg20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Celeg20160731", 2, 1, 1, "Celeg20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Celeg20160731", 3, 0, 0, "Celeg20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Celeg20160731", 3, 0, 1, "Celeg20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Celeg20160731", 3, 1, 0, "Celeg20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Celeg20160731", 3, 1, 1, "Celeg20160731");
//
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Dmela20160731", 1, 0, 0, "Dmela20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Dmela20160731", 1, 0, 1, "Dmela20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Dmela20160731", 2, 0, 0, "Dmela20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Dmela20160731", 2, 0, 1, "Dmela20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Dmela20160731", 2, 1, 0, "Dmela20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Dmela20160731", 2, 1, 1, "Dmela20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Dmela20160731", 3, 0, 0, "Dmela20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Dmela20160731", 3, 0, 1, "Dmela20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Dmela20160731", 3, 1, 0, "Dmela20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Dmela20160731", 3, 1, 1, "Dmela20160731");
//
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Ecoli20160731", 1, 0, 0, "Ecoli20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Ecoli20160731", 1, 0, 1, "Ecoli20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Ecoli20160731", 2, 0, 0, "Ecoli20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Ecoli20160731", 2, 0, 1, "Ecoli20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Ecoli20160731", 2, 1, 0, "Ecoli20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Ecoli20160731", 2, 1, 1, "Ecoli20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Ecoli20160731", 3, 0, 0, "Ecoli20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Ecoli20160731", 3, 0, 1, "Ecoli20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Ecoli20160731", 3, 1, 0, "Ecoli20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Ecoli20160731", 3, 1, 1, "Ecoli20160731");
//
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hpylo20160731", 1, 0, 0, "Hpylo20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hpylo20160731", 1, 0, 1, "Hpylo20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hpylo20160731", 2, 0, 0, "Hpylo20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hpylo20160731", 2, 0, 1, "Hpylo20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hpylo20160731", 2, 1, 0, "Hpylo20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hpylo20160731", 2, 1, 1, "Hpylo20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hpylo20160731", 3, 0, 0, "Hpylo20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hpylo20160731", 3, 0, 1, "Hpylo20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hpylo20160731", 3, 1, 0, "Hpylo20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hpylo20160731", 3, 1, 1, "Hpylo20160731");
//
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hsapi20160731", 1, 0, 0, "Hsapi20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hsapi20160731", 1, 0, 1, "Hsapi20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hsapi20160731", 2, 0, 0, "Hsapi20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hsapi20160731", 2, 0, 1, "Hsapi20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hsapi20160731", 2, 1, 0, "Hsapi20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hsapi20160731", 2, 1, 1, "Hsapi20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hsapi20160731", 3, 0, 0, "Hsapi20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hsapi20160731", 3, 0, 1, "Hsapi20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hsapi20160731", 3, 1, 0, "Hsapi20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Hsapi20160731", 3, 1, 1, "Hsapi20160731");
//
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Mmusc20160731", 1, 0, 0, "Mmusc20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Mmusc20160731", 1, 0, 1, "Mmusc20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Mmusc20160731", 2, 0, 0, "Mmusc20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Mmusc20160731", 2, 0, 1, "Mmusc20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Mmusc20160731", 2, 1, 0, "Mmusc20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Mmusc20160731", 2, 1, 1, "Mmusc20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Mmusc20160731", 3, 0, 0, "Mmusc20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Mmusc20160731", 3, 0, 1, "Mmusc20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Mmusc20160731", 3, 1, 0, "Mmusc20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Mmusc20160731", 3, 1, 1, "Mmusc20160731");
//
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Rnorv20160731", 1, 0, 0, "Rnorv20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Rnorv20160731", 1, 0, 1, "Rnorv20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Rnorv20160731", 2, 0, 0, "Rnorv20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Rnorv20160731", 2, 0, 1, "Rnorv20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Rnorv20160731", 2, 1, 0, "Rnorv20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Rnorv20160731", 2, 1, 1, "Rnorv20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Rnorv20160731", 3, 0, 0, "Rnorv20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Rnorv20160731", 3, 0, 1, "Rnorv20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Rnorv20160731", 3, 1, 0, "Rnorv20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Rnorv20160731", 3, 1, 1, "Rnorv20160731");
//
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Scere20160731", 1, 0, 0, "Scere20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Scere20160731", 1, 0, 1, "Scere20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Scere20160731", 2, 0, 0, "Scere20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Scere20160731", 2, 0, 1, "Scere20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Scere20160731", 2, 1, 0, "Scere20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Scere20160731", 2, 1, 1, "Scere20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Scere20160731", 3, 0, 0, "Scere20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Scere20160731", 3, 0, 1, "Scere20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Scere20160731", 3, 1, 0, "Scere20160731");
//        NGramCommand.getNGramBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\ngram\\Scere20160731", 3, 1, 1, "Scere20160731");
//
//        //获取Kskip的bat执行文件
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Negatome", 1, 0, 0, "Negatome");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Negatome", 1, 0, 1, "Negatome");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Negatome", 2, 0, 0, "Negatome");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Negatome", 2, 0, 1, "Negatome");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Negatome", 2, 1, 0, "Negatome");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Negatome", 2, 1, 1, "Negatome");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Negatome", 0, 0, 0, "Negatome");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Negatome", 0, 0, 1, "Negatome");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Negatome", 1, 1, 0, "Negatome");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Negatome", 1, 1, 1, "Negatome");
//
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Celeg20160731", 1, 0, 0, "Celeg20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Celeg20160731", 1, 0, 1, "Celeg20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Celeg20160731", 2, 0, 0, "Celeg20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Celeg20160731", 2, 0, 1, "Celeg20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Celeg20160731", 2, 1, 0, "Celeg20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Celeg20160731", 2, 1, 1, "Celeg20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Celeg20160731", 0, 0, 0, "Celeg20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Celeg20160731", 0, 0, 1, "Celeg20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Celeg20160731", 1, 1, 0, "Celeg20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Celeg20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Celeg20160731", 1, 1, 1, "Celeg20160731");
//
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Dmela20160731", 1, 0, 0, "Dmela20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Dmela20160731", 1, 0, 1, "Dmela20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Dmela20160731", 2, 0, 0, "Dmela20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Dmela20160731", 2, 0, 1, "Dmela20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Dmela20160731", 2, 1, 0, "Dmela20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Dmela20160731", 2, 1, 1, "Dmela20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Dmela20160731", 0, 0, 0, "Dmela20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Dmela20160731", 0, 0, 1, "Dmela20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Dmela20160731", 1, 1, 0, "Dmela20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Dmela20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Dmela20160731", 1, 1, 1, "Dmela20160731");
//
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Ecoli20160731", 1, 0, 0, "Ecoli20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Ecoli20160731", 1, 0, 1, "Ecoli20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Ecoli20160731", 2, 0, 0, "Ecoli20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Ecoli20160731", 2, 0, 1, "Ecoli20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Ecoli20160731", 2, 1, 0, "Ecoli20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Ecoli20160731", 2, 1, 1, "Ecoli20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Ecoli20160731", 0, 0, 0, "Ecoli20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Ecoli20160731", 0, 0, 1, "Ecoli20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Ecoli20160731", 1, 1, 0, "Ecoli20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Ecoli20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Ecoli20160731", 1, 1, 1, "Ecoli20160731");
//
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hpylo20160731", 1, 0, 0, "Hpylo20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hpylo20160731", 1, 0, 1, "Hpylo20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hpylo20160731", 2, 0, 0, "Hpylo20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hpylo20160731", 2, 0, 1, "Hpylo20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hpylo20160731", 2, 1, 0, "Hpylo20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hpylo20160731", 2, 1, 1, "Hpylo20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hpylo20160731", 0, 0, 0, "Hpylo20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hpylo20160731", 0, 0, 1, "Hpylo20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hpylo20160731", 1, 1, 0, "Hpylo20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hpylo20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hpylo20160731", 1, 1, 1, "Hpylo20160731");
//
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hsapi20160731", 1, 0, 0, "Hsapi20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hsapi20160731", 1, 0, 1, "Hsapi20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hsapi20160731", 2, 0, 0, "Hsapi20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hsapi20160731", 2, 0, 1, "Hsapi20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hsapi20160731", 2, 1, 0, "Hsapi20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hsapi20160731", 2, 1, 1, "Hsapi20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hsapi20160731", 0, 0, 0, "Hsapi20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hsapi20160731", 0, 0, 1, "Hsapi20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hsapi20160731", 1, 1, 0, "Hsapi20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Hsapi20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Hsapi20160731", 1, 1, 1, "Hsapi20160731");
//
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Mmusc20160731", 1, 0, 0, "Mmusc20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Mmusc20160731", 1, 0, 1, "Mmusc20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Mmusc20160731", 2, 0, 0, "Mmusc20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Mmusc20160731", 2, 0, 1, "Mmusc20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Mmusc20160731", 2, 1, 0, "Mmusc20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Mmusc20160731", 2, 1, 1, "Mmusc20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Mmusc20160731", 0, 0, 0, "Mmusc20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Mmusc20160731", 0, 0, 1, "Mmusc20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Mmusc20160731", 1, 1, 0, "Mmusc20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Mmusc20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Mmusc20160731", 1, 1, 1, "Mmusc20160731");
//
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Rnorv20160731", 1, 0, 0, "Rnorv20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Rnorv20160731", 1, 0, 1, "Rnorv20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Rnorv20160731", 2, 0, 0, "Rnorv20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Rnorv20160731", 2, 0, 1, "Rnorv20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Rnorv20160731", 2, 1, 0, "Rnorv20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Rnorv20160731", 2, 1, 1, "Rnorv20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Rnorv20160731", 0, 0, 0, "Rnorv20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Rnorv20160731", 0, 0, 1, "Rnorv20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Rnorv20160731", 1, 1, 0, "Rnorv20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Rnorv20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Rnorv20160731", 1, 1, 1, "Rnorv20160731");
//
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Scere20160731", 1, 0, 0, "Scere20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Scere20160731", 1, 0, 1, "Scere20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Scere20160731", 2, 0, 0, "Scere20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Scere20160731", 2, 0, 1, "Scere20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Scere20160731", 2, 1, 0, "Scere20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Scere20160731", 2, 1, 1, "Scere20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Scere20160731", 0, 0, 0, "Scere20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Scere20160731", 0, 0, 1, "Scere20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Scere20160731", 1, 1, 0, "Scere20160731");
//        KSkipCommand.getKSkipBat("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\Scere20160731_new", "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\feature\\kskip\\Scere20160731", 1, 1, 1, "Scere20160731");

        //获取188的执行文件
//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/Negatome_new", "/home/zjc/PPI/188featureExtract/feature/Negatome", "Negatome", 6314);
//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/positive/Celeg20160731_new", "/home/zjc/PPI/188featureExtract/feature/Celeg20160731", "Celeg20160731", 3886);
//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/positive/Dmela20160731_new", "/home/zjc/PPI/188featureExtract/feature/Dmela20160731", "Dmela20160731", 22127);
//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/positive/Ecoli20160731_new", "/home/zjc/PPI/188featureExtract/feature/Ecoli20160731", "Ecoli20160731", 11626);
//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/positive/Hpylo20160731_new", "/home/zjc/PPI/188featureExtract/feature/Hpylo20160731", "Hpylo20160731", 1365);
//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/positive/Hsapi20160731_new", "/home/zjc/PPI/188featureExtract/feature/Hsapi20160731", "Hsapi20160731", 7222);
//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/positive/Mmusc20160731_new", "/home/zjc/PPI/188featureExtract/feature/Mmusc20160731", "Mmusc20160731", 2427);
//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/positive/Rnorv20160731_new", "/home/zjc/PPI/188featureExtract/feature/Rnorv20160731", "Rnorv20160731", 553);
//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/positive/Scere20160731_new", "/home/zjc/PPI/188featureExtract/feature/Scere20160731", "Scere20160731", 22596);

        //获取pseacc输入格式的数据
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\negative\\Negatome_new", "-1", 1);
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\positive\\Celeg20160731_new", "1", 0);
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\positive\\Dmela20160731_new", "1", 0);
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\positive\\Ecoli20160731_new", "1", 0);
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\positive\\Hpylo20160731_new", "1", 0);
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\positive\\Hsapi20160731_new", "1", 0);
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\positive\\Mmusc20160731_new", "1", 0);
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\positive\\Rnorv20160731_new", "1", 0);
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\positive\\Scere20160731_new", "1", 0);

        //获取pseacc的执行文件
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/Negatome_new_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/Negatome", "Negatome", 6314);
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/positive/Celeg20160731_new_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/Celeg20160731", "Celeg20160731", 3886);
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/positive/Dmela20160731_new_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/Dmela20160731", "Dmela20160731", 22127);
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/positive/Ecoli20160731_new_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/Ecoli20160731", "Ecoli20160731", 11626);
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/positive/Hpylo20160731_new_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/Hpylo20160731", "Hpylo20160731", 1365);
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/positive/Hsapi20160731_new_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/Hsapi20160731", "Hsapi20160731", 7222);
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/positive/Mmusc20160731_new_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/Mmusc20160731", "Mmusc20160731", 2427);
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/positive/Rnorv20160731_new_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/Rnorv20160731", "Rnorv20160731", 553);
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/positive/Scere20160731_new_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/Scere20160731", "Scere20160731", 22596);

        //从pseacc程序的结果获取paseacc特征
//
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\Celeg20160731", "D:\\zjcDATA\\data\\feature\\pseacc\\Celeg20160731");
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\Dmela20160731", "D:\\zjcDATA\\data\\feature\\pseacc\\Dmela20160731");
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\Ecoli20160731", "D:\\zjcDATA\\data\\feature\\pseacc\\Ecoli20160731");
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\Hpylo20160731", "D:\\zjcDATA\\data\\feature\\pseacc\\Hpylo20160731");
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\Hsapi20160731", "D:\\zjcDATA\\data\\feature\\pseacc\\Hsapi20160731");
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\Mmusc20160731", "D:\\zjcDATA\\data\\feature\\pseacc\\Mmusc20160731");
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\Rnorv20160731", "D:\\zjcDATA\\data\\feature\\pseacc\\Rnorv20160731");
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\Scere20160731", "D:\\zjcDATA\\data\\feature\\pseacc\\Scere20160731");
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\Negatome", "D:\\zjcDATA\\data\\feature\\pseacc\\Negatome");

        //把成对的蛋白质序列分拆成一个文件一条  pseacc替换过的

//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\negative\\Negatome_new_pseacc_replace");
//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\positive\\pseacc_replace\\Celeg20160731_new_pseacc");
//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\positive\\pseacc_replace\\Dmela20160731_new_pseacc");
//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\positive\\pseacc_replace\\Ecoli20160731_new_pseacc");
//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\positive\\pseacc_replace\\Hpylo20160731_new_pseacc");
//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\positive\\pseacc_replace\\Hsapi20160731_new_pseacc");
//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\positive\\pseacc_replace\\Mmusc20160731_new_pseacc");
//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\positive\\pseacc_replace\\Rnorv20160731_new_pseacc");
//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\positive\\pseacc_replace\\Scere20160731_new_pseacc");

        //跑二级结构的命令
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/Negatome_single", "Negatome", 6314);
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/Celeg20160731_single", "Celeg20160731", 3886);
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/Dmela20160731_single", "Dmela20160731", 22127);
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/Ecoli20160731_single", "Ecoli20160731", 11626);
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/Hpylo20160731_single", "Hpylo20160731", 1365);
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/Hsapi20160731_single", "Hsapi20160731", 7222);
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/Mmusc20160731_single", "Mmusc20160731", 2427);
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/Rnorv20160731_single", "Rnorv20160731", 553);
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/Scere20160731_single", "Scere20160731", 22596);

        //获取pssm矩阵的命令
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/Negatome_single", "/home/zjc/PPI/secondary/pssm/Negatome/", "Negatome", 6314);
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/Celeg20160731_single", "/home/zjc/PPI/secondary/pssm/Celeg20160731/", "Celeg20160731", 3886);
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/Dmela20160731_single", "/home/zjc/PPI/secondary/pssm/Dmela20160731/","Dmela20160731", 22127);
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/Ecoli20160731_single", "/home/zjc/PPI/secondary/pssm/Ecoli20160731/","Ecoli20160731", 11626);
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/Hpylo20160731_single", "/home/zjc/PPI/secondary/pssm/Hpylo20160731/","Hpylo20160731", 1365);
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/Hsapi20160731_single", "/home/zjc/PPI/secondary/pssm/Hsapi20160731/","Hsapi20160731", 7222);
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/Mmusc20160731_single", "/home/zjc/PPI/secondary/pssm/Mmusc20160731/","Mmusc20160731", 2427);
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/Rnorv20160731_single", "/home/zjc/PPI/secondary/pssm/Rnorv20160731/","Rnorv20160731", 553);
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/Scere20160731_single", "/home/zjc/PPI/secondary/pssm/Scere20160731/","Scere20160731", 22596);

        //从pssm矩阵计算pssm特征
        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Celeg20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Celeg20160731");
        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Dmela20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Dmela20160731");
        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Ecoli20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Ecoli20160731");
        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Hpylo20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Hpylo20160731");
        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Hsapi20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Hsapi20160731");
        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Mmusc20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Mmusc20160731");
        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Negatome", "D:\\zjcDATA\\data\\feature\\pssm\\Negatome");
        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Rnorv20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Rnorv20160731");
        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Scere20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Scere20160731");


















    }
}
