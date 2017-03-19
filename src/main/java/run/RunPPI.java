package run;

import data.AminoAcidsReorder;
import data.ProteinRecombine;
import feature.Ztest;
import feature.featurefusion.FeatureFusion;
import feature.mrmd.MRMD;
import feature.pseacc.PseACC;
import feature.pssm.PSSM;
import feature.secondary.Secondary;
import runtoolcommand.*;
import sampling.kmeans.KMeans;
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
//        AminoAcidsReorder.getAminoAcidsReorder("D:\\zjcDATA\\data\\positive\\Hsapi20160731_new", "D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", 1000000);
//        ProteinRecombine.getProteinRecombine("D:\\zjcDATA\\data\\positive", "D:\\zjcDATA\\data\\negative\\ProteinRecombine", 10000);

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

//        NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine", 1, 0, 0, "ProteinRecombine");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine", 1, 0, 1, "ProteinRecombine");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine", 2, 0, 0, "ProteinRecombine");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine", 2, 0, 1, "ProteinRecombine");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine", 2, 1, 0, "ProteinRecombine");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine", 2, 1, 1, "ProteinRecombine");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine", 3, 0, 0, "ProteinRecombine");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine", 3, 0, 1, "ProteinRecombine");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine", 3, 1, 0, "ProteinRecombine");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine", 3, 1, 1, "ProteinRecombine");


//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder", 1, 0, 0, "AminoAcidsReorder");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder", 1, 0, 1, "AminoAcidsReorder");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder", 2, 0, 0, "AminoAcidsReorder");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder", 2, 0, 1, "AminoAcidsReorder");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder", 2, 1, 0, "AminoAcidsReorder");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder", 2, 1, 1, "AminoAcidsReorder");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder", 3, 0, 0, "AminoAcidsReorder");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder", 3, 0, 1, "AminoAcidsReorder");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder", 3, 1, 0, "AminoAcidsReorder");
//          NGramCommand.getNGramBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder", 3, 1, 1, "AminoAcidsReorder");

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

//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine", 1, 0, 0, "ProteinRecombine");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine", 1, 0, 1, "ProteinRecombine");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine", 2, 0, 0, "ProteinRecombine");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine", 2, 0, 1, "ProteinRecombine");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine", 2, 1, 0, "ProteinRecombine");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine", 2, 1, 1, "ProteinRecombine");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine", 0, 0, 0, "ProteinRecombine");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine", 0, 0, 1, "ProteinRecombine");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine", 1, 1, 0, "ProteinRecombine");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine", 1, 1, 1, "ProteinRecombine");


//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder", 1, 0, 0, "AminoAcidsReorder");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder", 1, 0, 1, "AminoAcidsReorder");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder", 2, 0, 0, "AminoAcidsReorder");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder", 2, 0, 1, "AminoAcidsReorder");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder", 2, 1, 0, "AminoAcidsReorder");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder", 2, 1, 1, "AminoAcidsReorder");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder", 0, 0, 0, "AminoAcidsReorder");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder", 0, 0, 1, "AminoAcidsReorder");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder", 1, 1, 0, "AminoAcidsReorder");
//        KSkipCommand.getKSkipBat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder", 1, 1, 1, "AminoAcidsReorder");

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

//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/AminoAcidsReorder", "/home/zjc/PPI/188featureExtract/feature/AminoAcidsReorder", "AminoAcidsReorder", 7222);
//        F188Command.get188Shell("/home/zjc/PPI/188featureExtract/ProteinRecombine", "/home/zjc/PPI/188featureExtract/feature/ProteinRecombine", "ProteinRecombine", 10000);
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
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\negative\\ProteinRecombine", "-1", 1);
//        DealForPseACC.getPseACCFormat("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder", "-1", 1);
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
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/AminoAcidsReorder_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/AminoAcidsReorder", "AminoAcidsReorder", 7222);
//        PseACCCommand.getPseACCShell("/home/zjc/PPI/pseb-linux-3.0/prebin/ProteinRecombine_pseacc", "/home/zjc/PPI/pseb-linux-3.0/prebin/feature/ProteinRecombine", "ProteinRecombine", 10000);
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
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\pseacc\\AminoAcidsReorder");
//        PseACC.pseACCFeature("D:\\zjcDATA\\data\\feature\\pseacc1\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\pseacc\\ProteinRecombine");


        //把成对的蛋白质序列分拆成一个文件一条  pseacc替换过的

//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\negative\\AminoAcidsReorder_pseacc");
//        SplitForTwoFastaFile.splitFile("D:\\zjcDATA\\data\\negative\\ProteinRecombine_pseacc");
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
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/AminoAcidsReorder_single", "AminoAcidsReorder", 7222);
//        SecondaryCommand.getSecondaryShell("/home/liuchong/zengjiancang/psipred/BLAST+/single_replace/ProteinRecombine_single", "ProteinRecombine", 10000);
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
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/AminoAcidsReorder_single", "/home/zjc/PPI/secondary/pssm/AminoAcidsReorder/", "AminoAcidsReorder", 7222);
//        PSSMCommand.getPSSMShell("/home/zjc/PPI/secondary/single_replace/ProteinRecombine_single", "/home/zjc/PPI/secondary/pssm/ProteinRecombine/", "ProteinRecombine", 10000);
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
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Celeg20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Celeg20160731");
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Dmela20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Dmela20160731");
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Ecoli20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Ecoli20160731");
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Hpylo20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Hpylo20160731");
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Hsapi20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Hsapi20160731");
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Mmusc20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Mmusc20160731");
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Negatome", "D:\\zjcDATA\\data\\feature\\pssm\\Negatome");
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Rnorv20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Rnorv20160731");
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\Scere20160731", "D:\\zjcDATA\\data\\feature\\pssm\\Scere20160731");
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\pssm\\AminoAcidsReorder");
//        PSSM.getPSSMFeature("D:\\zjcDATA\\data\\feature\\pssm1\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\pssm\\ProteinRecombine");

        //二级结构计算特征
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\secondary\\AminoAcidsReorder");
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\secondary\\ProteinRecombine");
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\Celeg20160731", "D:\\zjcDATA\\data\\feature\\secondary\\Celeg20160731");
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\Dmela20160731", "D:\\zjcDATA\\data\\feature\\secondary\\Dmela20160731");
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\Ecoli20160731", "D:\\zjcDATA\\data\\feature\\secondary\\Ecoli20160731");
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\Hpylo20160731", "D:\\zjcDATA\\data\\feature\\secondary\\Hpylo20160731");
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\Hsapi20160731", "D:\\zjcDATA\\data\\feature\\secondary\\Hsapi20160731");
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\Mmusc20160731", "D:\\zjcDATA\\data\\feature\\secondary\\Mmusc20160731");
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\Negatome", "D:\\zjcDATA\\data\\feature\\secondary\\Negatome");
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\Rnorv20160731", "D:\\zjcDATA\\data\\feature\\secondary\\Rnorv20160731");
//        Secondary.getSecondaryFeature("D:\\zjcDATA\\data\\feature\\secondary1\\Scere20160731", "D:\\zjcDATA\\data\\feature\\secondary\\Scere20160731");

        //检查得分矩阵和二级结构的错误
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\pssm\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\pssm_right\\ProteinRecombine", 10000, "pssm_ProteinRecombine_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\pssm\\Celeg20160731", "D:\\zjcDATA\\data\\feature\\pssm_right\\Celeg20160731", 3886, "pssm_Celeg20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\pssm\\Dmela20160731", "D:\\zjcDATA\\data\\feature\\pssm_right\\Dmela20160731", 22127, "pssm_Dmela20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\pssm\\Ecoli20160731", "D:\\zjcDATA\\data\\feature\\pssm_right\\Ecoli20160731", 11626, "pssm_Ecoli20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\pssm\\Hpylo20160731", "D:\\zjcDATA\\data\\feature\\pssm_right\\Hpylo20160731", 1365, "pssm_Hpylo20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\pssm\\Hsapi20160731", "D:\\zjcDATA\\data\\feature\\pssm_right\\Hsapi20160731", 7222, "pssm_Hsapi20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\pssm\\Mmusc20160731", "D:\\zjcDATA\\data\\feature\\pssm_right\\Mmusc20160731", 2427, "pssm_Mmusc20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\pssm\\Negatome", "D:\\zjcDATA\\data\\feature\\pssm_right\\Negatome", 6314, "pssm_Negatome_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\pssm\\Rnorv20160731", "D:\\zjcDATA\\data\\feature\\pssm_right\\Rnorv20160731", 553, "pssm_Rnorv20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\pssm\\Scere20160731", "D:\\zjcDATA\\data\\feature\\pssm_right\\Scere20160731", 22596, "pssm_Scere20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\ProteinRecombine", "D:\\zjcDATA\\data\\feature\\secondary_right\\ProteinRecombine", 10000, "secondary_ProteinRecombine_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\AminoAcidsReorder", "D:\\zjcDATA\\data\\feature\\secondary_right\\AminoAcidsReorder", 7222, "secondary_AminoAcidsReorder_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\Celeg20160731", "D:\\zjcDATA\\data\\feature\\secondary_right\\Celeg20160731", 3886, "secondary_Celeg20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\Dmela20160731", "D:\\zjcDATA\\data\\feature\\secondary_right\\Dmela20160731", 22127, "secondary_Dmela20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\Ecoli20160731", "D:\\zjcDATA\\data\\feature\\secondary_right\\Ecoli20160731", 11626, "secondary_Ecoli20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\Hpylo20160731", "D:\\zjcDATA\\data\\feature\\secondary_right\\Hpylo20160731", 1365, "secondary_Hpylo20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\Hsapi20160731", "D:\\zjcDATA\\data\\feature\\secondary_right\\Hsapi20160731", 7222, "secondary_Hsapi20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\Mmusc20160731", "D:\\zjcDATA\\data\\feature\\secondary_right\\Mmusc20160731", 2427, "secondary_Mmusc20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\Negatome", "D:\\zjcDATA\\data\\feature\\secondary_right\\Negatome", 6314, "secondary_Negatome_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\Rnorv20160731", "D:\\zjcDATA\\data\\feature\\secondary_right\\Rnorv20160731", 553, "secondary_Rnorv20160731_wrong");
//        CheckWrongFasta.getWrongFile("D:\\zjcDATA\\data\\feature\\secondary\\Scere20160731", "D:\\zjcDATA\\data\\feature\\secondary_right\\Scere20160731", 22596, "secondary_Scere20160731_wrong");

        //特征融合
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\AminoAcidsReorder", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\AminoAcidsReorder");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\ProteinRecombine", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\ProteinRecombine");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\ProteinRecombine", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\ProteinRecombine");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\AminoAcidsReorder", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\AminoAcidsReorder");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\ProteinRecombine", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\ProteinRecombine");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\AminoAcidsReorder", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\AminoAcidsReorder");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\3_1_1");

//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\3_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\2_1_1");

//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\ProteinRecombine", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\ProteinRecombine");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\AminoAcidsReorder", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\AminoAcidsReorder");

//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\ProteinRecombine", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\ProteinRecombine");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\AminoAcidsReorder", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\AminoAcidsReorder");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\ProteinRecombine\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\ProteinRecombine\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\ProteinRecombine\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\ProteinRecombine\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\ProteinRecombine\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\ProteinRecombine\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\ProteinRecombine\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\ProteinRecombine\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\ProteinRecombine\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\ProteinRecombine\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\ProteinRecombine\\2_1_1");

//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\AminoAcidsReorder\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\AminoAcidsReorder\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\AminoAcidsReorder\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\AminoAcidsReorder\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\AminoAcidsReorder\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\AminoAcidsReorder\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\AminoAcidsReorder\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\AminoAcidsReorder\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\AminoAcidsReorder\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\AminoAcidsReorder\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\AminoAcidsReorder\\2_1_1");

//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\ProteinRecombine\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\ProteinRecombine\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\ProteinRecombine\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\ProteinRecombine\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\ProteinRecombine\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\ProteinRecombine\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\ProteinRecombine\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\ProteinRecombine\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\ProteinRecombine\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\ProteinRecombine\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\ProteinRecombine\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\AminoAcidsReorder\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\AminoAcidsReorder\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\AminoAcidsReorder\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\AminoAcidsReorder\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\AminoAcidsReorder\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\AminoAcidsReorder\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\AminoAcidsReorder\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\AminoAcidsReorder\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\AminoAcidsReorder\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\AminoAcidsReorder\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\AminoAcidsReorder\\3_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\ProteinRecombine", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\ProteinRecombine");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\AminoAcidsReorder", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\AminoAcidsReorder");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\ProteinRecombine", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\ProteinRecombine");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\AminoAcidsReorder", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\AminoAcidsReorder");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\AminoAcidsReorder", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\AminoAcidsReorder");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\ProteinRecombine", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\ProteinRecombine");







//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\Celeg20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Celeg20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\Dmela20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Dmela20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\Ecoli20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Ecoli20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\Hpylo20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Hpylo20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\Hsapi20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Hsapi20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\Mmusc20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Mmusc20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\Negatome", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Negatome");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\Rnorv20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Rnorv20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\188\\Scere20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Scere20160731");
//


//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_1_1");
//


//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\1_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\1_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_1_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_0_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_0_1");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_1_0");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_1_1");
//


//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\Celeg20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Celeg20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\Dmela20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Dmela20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\Ecoli20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Ecoli20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\Hpylo20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Hpylo20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\Hsapi20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Hsapi20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\Mmusc20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Mmusc20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\Negatome", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Negatome");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\Rnorv20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Rnorv20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pseacc\\Scere20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Scere20160731");
//

//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Celeg20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Celeg20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Dmela20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Dmela20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Ecoli20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Ecoli20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Hpylo20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Hpylo20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Hsapi20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Hsapi20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Mmusc20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Mmusc20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Negatome", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Negatome");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Rnorv20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Rnorv20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Scere20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Scere20160731");


//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Celeg20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Celeg20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Dmela20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Dmela20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Ecoli20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Ecoli20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Hpylo20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Hpylo20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Hsapi20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Hsapi20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Mmusc20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Mmusc20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Negatome", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Negatome");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Rnorv20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Rnorv20160731");
//        FeatureFusion.runFeatureFusionByHarmonicMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Scere20160731", "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Scere20160731");
//
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\Celeg20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Celeg20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\Dmela20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Dmela20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\Ecoli20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Ecoli20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\Hpylo20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Hpylo20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\Hsapi20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Hsapi20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\Mmusc20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Mmusc20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\Negatome", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Negatome");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\Rnorv20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Rnorv20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\188\\Scere20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Scere20160731");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Celeg20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Dmela20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hpylo20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Hsapi20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Mmusc20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Rnorv20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Scere20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Negatome\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\0_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\0_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\0_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\0_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\1_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\1_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\kskip\\Ecoli20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Celeg20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Dmela20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Ecoli20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hpylo20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Hsapi20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Mmusc20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Rnorv20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Scere20160731\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\1_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\1_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\1_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\1_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\2_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\2_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\2_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\2_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_1_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\3_0_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_0_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\3_0_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_0_1");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\3_1_0", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_1_0");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\ngram\\Negatome\\3_1_1", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_1_1");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\Celeg20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Celeg20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\Dmela20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Dmela20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\Ecoli20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Ecoli20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\Hpylo20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Hpylo20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\Hsapi20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Hsapi20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\Mmusc20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Mmusc20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\Negatome", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Negatome");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\Rnorv20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Rnorv20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pseacc\\Scere20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Scere20160731");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Celeg20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Celeg20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Dmela20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Dmela20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Ecoli20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Ecoli20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Hpylo20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Hpylo20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Hsapi20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Hsapi20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Mmusc20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Mmusc20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Negatome", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Negatome");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Rnorv20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Rnorv20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\pssm_right\\Scere20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Scere20160731");
//
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Celeg20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Celeg20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Dmela20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Dmela20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Ecoli20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Ecoli20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Hpylo20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Hpylo20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Hsapi20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Hsapi20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Mmusc20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Mmusc20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Negatome", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Negatome");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Rnorv20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Rnorv20160731");
//        FeatureFusion.runFeatureFusionByArithmeticMean("D:\\zjcDATA\\data\\feature\\secondary_right\\Scere20160731", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Scere20160731");

        //多个特征文件合并成一个文件
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\error.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\error.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Hsapi20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Hsapi20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\error.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\error.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\AminoAcidsReorder",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\AminoAcidsReorder.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Celeg20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Celeg20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Dmela20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Dmela20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Ecoli20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Ecoli20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Hpylo20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Hpylo20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Hsapi20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Hsapi20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Mmusc20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Mmusc20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Rnorv20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Rnorv20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Scere20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Scere20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Negatome",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Negatome.txt");

//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\Negatome\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\Negatome\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Negatome\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Negatome\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Celeg20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Celeg20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Dmela20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Dmela20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Ecoli20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Ecoli20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Hpylo20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Hpylo20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Hsapi20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Hsapi20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Mmusc20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Mmusc20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Rnorv20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Rnorv20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Scere20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Scere20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Negatome",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pseacc\\Negatome.txt");
//
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Celeg20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Celeg20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Dmela20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Dmela20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Ecoli20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Ecoli20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Hpylo20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Hpylo20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Hsapi20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Hsapi20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Mmusc20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Mmusc20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Rnorv20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Rnorv20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Scere20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Scere20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Negatome",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\Negatome.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Celeg20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Celeg20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Dmela20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Dmela20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Ecoli20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Ecoli20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Hpylo20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Hpylo20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Hsapi20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Hsapi20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Mmusc20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Mmusc20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Rnorv20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Rnorv20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Scere20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Scere20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Negatome",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\Negatome.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Celeg20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Celeg20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Dmela20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Dmela20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Ecoli20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Ecoli20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Hpylo20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Hpylo20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Hsapi20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Hsapi20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Mmusc20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Mmusc20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Rnorv20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Rnorv20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Scere20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Scere20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Negatome",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\188\\Negatome.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_1.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_0",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_0.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_1",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_1.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Celeg20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Celeg20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Dmela20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Dmela20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Ecoli20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Ecoli20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Hpylo20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Hpylo20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Hsapi20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Hsapi20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Mmusc20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Mmusc20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Rnorv20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Rnorv20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Scere20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Scere20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Negatome",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pseacc\\Negatome.txt");
//
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Celeg20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Celeg20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Dmela20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Dmela20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Ecoli20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Ecoli20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Hpylo20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Hpylo20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Hsapi20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Hsapi20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Mmusc20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Mmusc20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Rnorv20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Rnorv20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Scere20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Scere20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Negatome",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\pssm_right\\Negatome.txt");
//
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Celeg20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Celeg20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Celeg20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Celeg20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Dmela20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Dmela20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Dmela20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Dmela20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Ecoli20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Ecoli20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Ecoli20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Ecoli20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hpylo20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hpylo20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Hpylo20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Hpylo20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Hsapi20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Hsapi20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Hsapi20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Hsapi20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Mmusc20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Mmusc20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Mmusc20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Mmusc20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Rnorv20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Rnorv20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Rnorv20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Rnorv20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Scere20160731_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Scere20160731_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Scere20160731",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Scere20160731.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_Negatome_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_Negatome_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Negatome",
//                "D:\\zjcDATA\\data\\featurefusion\\harmonicMean\\secondary_right\\Negatome.txt");

//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\ProteinRecombine",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\188\\ProteinRecombine_188.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\0_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\ProteinRecombine_0_0_1_skip.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\1_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\ProteinRecombine_1_0_1_skip.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\1_1_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\ProteinRecombine_1_1_1_skip.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\2_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\ProteinRecombine_2_0_1_skip.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\2_1_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\kskip\\ProteinRecombine\\ProteinRecombine_2_1_1_skip.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\1_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\ProteinRecombine_1_0_1_ngram.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\2_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\ProteinRecombine_2_0_1_ngram.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\2_1_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\ProteinRecombine_2_1_1_ngram.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\3_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\ProteinRecombine_3_0_1_ngram.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\3_1_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\ngram\\ProteinRecombine\\ProteinRecombine_3_1_1_ngram.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\ProteinRecombine",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\pssm\\ProteinRecombine_pssm.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\pssm_ProteinRecombine_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_ProteinRecombine_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\ProteinRecombine",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\secondary\\ProteinRecombine_secondary.txt");

//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\AminoAcidsReorder",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\188\\AminoAcidsReorder_188.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\0_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\AminoAcidsReorder_0_0_1_skip.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\1_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\AminoAcidsReorder_1_0_1_skip.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\1_1_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\AminoAcidsReorder_1_1_1_skip.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\2_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\AminoAcidsReorder_2_0_1_skip.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\2_1_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\kskip\\AminoAcidsReorder\\AminoAcidsReorder_2_1_1_skip.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\1_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\AminoAcidsReorder_1_0_1_ngram.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\2_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\AminoAcidsReorder_2_0_1_ngram.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\2_1_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\AminoAcidsReorder_2_1_1_ngram.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\3_0_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\AminoAcidsReorder_3_0_1_ngram.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\3_1_1",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\ngram\\AminoAcidsReorder\\AminoAcidsReorder_3_1_1_ngram.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\pssm_right\\AminoAcidsReorder",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\pssm\\AminoAcidsReorder_pssm.txt");
//        ToOneFile.collectToOneFile("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\secondary_AminoAcidsReorder_wrong.txt",
//                "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\secondary_right\\AminoAcidsReorder",
//                "E:\\zjcDATA\\featurefusion\\arithmeticMean\\secondary\\AminoAcidsReorder_secondary.txt");


        //kmeans抽样
//        for(int i = 50; i <= 500; i += 50){
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\188\\Celeg20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\188\\Celeg20160731\\Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Celeg20160731\\0_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Celeg20160731\\0_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Celeg20160731\\1_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Celeg20160731\\1_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Celeg20160731\\1_1_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Celeg20160731\\1_1_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Celeg20160731\\2_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Celeg20160731\\2_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Celeg20160731\\2_1_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Celeg20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Celeg20160731\\2_1_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Celeg20160731\\1_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Celeg20160731\\1_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Celeg20160731\\2_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Celeg20160731\\2_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Celeg20160731\\2_1_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Celeg20160731\\2_1_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Celeg20160731\\3_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Celeg20160731\\3_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Celeg20160731\\3_1_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Celeg20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Celeg20160731\\3_1_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\pseacc\\Celeg20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pseacc\\Celeg20160731\\Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\pssm\\Celeg20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pssm\\Celeg20160731\\Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\arithmeticMean\\secondary\\Celeg20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\secondary\\Celeg20160731\\Celeg20160731.txt", 272);
//
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\188\\Celeg20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\188\\Celeg20160731\\Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Celeg20160731\\0_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Celeg20160731\\0_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Celeg20160731\\1_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Celeg20160731\\1_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Celeg20160731\\1_1_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Celeg20160731\\1_1_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Celeg20160731\\2_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Celeg20160731\\2_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Celeg20160731\\2_1_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Celeg20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Celeg20160731\\2_1_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Celeg20160731\\1_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Celeg20160731\\1_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Celeg20160731\\2_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Celeg20160731\\2_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Celeg20160731\\2_1_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Celeg20160731\\2_1_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Celeg20160731\\3_0_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Celeg20160731\\3_0_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Celeg20160731\\3_1_0_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Celeg20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Celeg20160731\\3_1_1_Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\pseacc\\Celeg20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pseacc\\Celeg20160731\\Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\pssm\\Celeg20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pssm\\Celeg20160731\\Celeg20160731.txt", 272);
//            KMeans.runKMeans(i, 2717, "E:\\zjcData\\featurefusion\\harmonicMean\\secondary\\Celeg20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\secondary\\Celeg20160731\\Celeg20160731.txt", 272);
//        }
//
//
//        for(int i = 50; i <= 300; i += 50){
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\188\\Hpylo20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\188\\Hpylo20160731\\Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hpylo20160731\\0_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hpylo20160731\\0_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hpylo20160731\\1_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hpylo20160731\\1_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hpylo20160731\\1_1_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hpylo20160731\\1_1_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hpylo20160731\\2_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hpylo20160731\\2_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hpylo20160731\\2_1_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hpylo20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hpylo20160731\\2_1_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hpylo20160731\\1_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hpylo20160731\\1_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hpylo20160731\\2_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hpylo20160731\\2_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hpylo20160731\\2_1_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hpylo20160731\\2_1_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hpylo20160731\\3_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hpylo20160731\\3_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hpylo20160731\\3_1_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hpylo20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hpylo20160731\\3_1_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\pseacc\\Hpylo20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pseacc\\Hpylo20160731\\Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\pssm\\Hpylo20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pssm\\Hpylo20160731\\Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\arithmeticMean\\secondary\\Hpylo20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\secondary\\Hpylo20160731\\Hpylo20160731.txt", 68);
//
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\188\\Hpylo20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\188\\Hpylo20160731\\Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hpylo20160731\\0_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hpylo20160731\\0_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hpylo20160731\\1_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hpylo20160731\\1_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hpylo20160731\\1_1_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hpylo20160731\\1_1_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hpylo20160731\\2_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hpylo20160731\\2_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hpylo20160731\\2_1_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hpylo20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hpylo20160731\\2_1_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hpylo20160731\\1_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hpylo20160731\\1_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hpylo20160731\\2_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hpylo20160731\\2_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hpylo20160731\\2_1_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hpylo20160731\\2_1_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hpylo20160731\\3_0_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hpylo20160731\\3_0_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hpylo20160731\\3_1_0_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hpylo20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hpylo20160731\\3_1_1_Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\pseacc\\Hpylo20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pseacc\\Hpylo20160731\\Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\pssm\\Hpylo20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pssm\\Hpylo20160731\\Hpylo20160731.txt", 68);
//            KMeans.runKMeans(i, 675, "E:\\zjcData\\featurefusion\\harmonicMean\\secondary\\Hpylo20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\secondary\\Hpylo20160731\\Hpylo20160731.txt", 68);
//        }
//
//        for(int i = 500; i < 689; i += 100){
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\188\\Hsapi20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\188\\Hsapi20160731\\Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hsapi20160731\\0_0_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hsapi20160731\\0_0_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hsapi20160731\\1_0_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hsapi20160731\\1_0_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hsapi20160731\\1_1_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hsapi20160731\\1_1_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hsapi20160731\\2_0_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hsapi20160731\\2_0_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hsapi20160731\\2_1_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Hsapi20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Hsapi20160731\\2_1_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hsapi20160731\\1_0_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hsapi20160731\\1_0_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hsapi20160731\\2_0_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hsapi20160731\\2_0_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hsapi20160731\\2_1_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hsapi20160731\\2_1_1_Hsapi20160731.txt", 690);
////            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hsapi20160731\\3_0_0_Hsapi20160731.txt", 690);
////            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hsapi20160731\\3_0_1_Hsapi20160731.txt", 690);
////            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hsapi20160731\\3_1_0_Hsapi20160731.txt", 690);
////            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Hsapi20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Hsapi20160731\\3_1_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\pseacc\\Hsapi20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pseacc\\Hsapi20160731\\Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\pssm\\Hsapi20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pssm\\Hsapi20160731\\Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\arithmeticMean\\secondary\\Hsapi20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\secondary\\Hsapi20160731\\Hsapi20160731.txt", 690);
//
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\188\\Hsapi20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\188\\Hsapi20160731\\Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hsapi20160731\\0_0_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hsapi20160731\\0_0_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hsapi20160731\\1_0_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hsapi20160731\\1_0_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hsapi20160731\\1_1_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hsapi20160731\\1_1_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hsapi20160731\\2_0_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hsapi20160731\\2_0_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hsapi20160731\\2_1_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Hsapi20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Hsapi20160731\\2_1_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hsapi20160731\\1_0_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hsapi20160731\\1_0_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hsapi20160731\\2_0_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hsapi20160731\\2_0_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hsapi20160731\\2_1_0_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hsapi20160731\\2_1_1_Hsapi20160731.txt", 690);
////            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hsapi20160731\\3_0_0_Hsapi20160731.txt", 690);
////            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hsapi20160731\\3_0_1_Hsapi20160731.txt", 690);
////            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hsapi20160731\\3_1_0_Hsapi20160731.txt", 690);
////            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Hsapi20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Hsapi20160731\\3_1_1_Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\pseacc\\Hsapi20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pseacc\\Hsapi20160731\\Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\pssm\\Hsapi20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pssm\\Hsapi20160731\\Hsapi20160731.txt", 690);
//            KMeans.runKMeans(i, 6893, "E:\\zjcData\\featurefusion\\harmonicMean\\secondary\\Hsapi20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\secondary\\Hsapi20160731\\Hsapi20160731.txt", 690);
//        }
//
//        for(int i = 50; i <= 500; i += 50){
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\188\\Mmusc20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\188\\Mmusc20160731\\Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Mmusc20160731\\0_0_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Mmusc20160731\\0_0_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Mmusc20160731\\1_0_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Mmusc20160731\\1_0_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Mmusc20160731\\1_1_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Mmusc20160731\\1_1_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Mmusc20160731\\2_0_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Mmusc20160731\\2_0_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Mmusc20160731\\2_1_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Mmusc20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Mmusc20160731\\2_1_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Mmusc20160731\\1_0_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Mmusc20160731\\1_0_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Mmusc20160731\\2_0_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Mmusc20160731\\2_0_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Mmusc20160731\\2_1_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Mmusc20160731\\2_1_1_Mmusc20160731.txt", 238);
////            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Mmusc20160731\\3_0_0_Mmusc20160731.txt", 238);
////            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Mmusc20160731\\3_0_1_Mmusc20160731.txt", 238);
////            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Mmusc20160731\\3_1_0_Mmusc20160731.txt", 238);
////            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Mmusc20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Mmusc20160731\\3_1_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\pseacc\\Mmusc20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pseacc\\Mmusc20160731\\Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\pssm\\Mmusc20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pssm\\Mmusc20160731\\Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\arithmeticMean\\secondary\\Mmusc20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\secondary\\Mmusc20160731\\Mmusc20160731.txt", 238);
//
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\188\\Mmusc20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\188\\Mmusc20160731\\Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Mmusc20160731\\0_0_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Mmusc20160731\\0_0_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Mmusc20160731\\1_0_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Mmusc20160731\\1_0_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Mmusc20160731\\1_1_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Mmusc20160731\\1_1_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Mmusc20160731\\2_0_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Mmusc20160731\\2_0_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Mmusc20160731\\2_1_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Mmusc20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Mmusc20160731\\2_1_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Mmusc20160731\\1_0_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Mmusc20160731\\1_0_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Mmusc20160731\\2_0_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Mmusc20160731\\2_0_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Mmusc20160731\\2_1_0_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Mmusc20160731\\2_1_1_Mmusc20160731.txt", 238);
////            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Mmusc20160731\\3_0_0_Mmusc20160731.txt", 238);
////            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Mmusc20160731\\3_0_1_Mmusc20160731.txt", 238);
////            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Mmusc20160731\\3_1_0_Mmusc20160731.txt", 238);
////            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Mmusc20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Mmusc20160731\\3_1_1_Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\pseacc\\Mmusc20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pseacc\\Mmusc20160731\\Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\pssm\\Mmusc20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pssm\\Mmusc20160731\\Mmusc20160731.txt", 238);
//            KMeans.runKMeans(i, 2376, "E:\\zjcData\\featurefusion\\harmonicMean\\secondary\\Mmusc20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\secondary\\Mmusc20160731\\Mmusc20160731.txt", 238);
//        }
//
//        for(int i = 50; i < 527; i += 50){
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\188\\Rnorv20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\188\\Rnorv20160731\\Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Rnorv20160731\\0_0_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Rnorv20160731\\0_0_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Rnorv20160731\\1_0_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Rnorv20160731\\1_0_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Rnorv20160731\\1_1_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Rnorv20160731\\1_1_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Rnorv20160731\\2_0_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Rnorv20160731\\2_0_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Rnorv20160731\\2_1_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Rnorv20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Rnorv20160731\\2_1_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Rnorv20160731\\1_0_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Rnorv20160731\\1_0_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Rnorv20160731\\2_0_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Rnorv20160731\\2_0_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Rnorv20160731\\2_1_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Rnorv20160731\\2_1_1_Rnorv20160731.txt", 53);
////            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Rnorv20160731\\3_0_0_Rnorv20160731.txt", 53);
////            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Rnorv20160731\\3_0_1_Rnorv20160731.txt", 53);
////            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Rnorv20160731\\3_1_0_Rnorv20160731.txt", 53);
////            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Rnorv20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Rnorv20160731\\3_1_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\pseacc\\Rnorv20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pseacc\\Rnorv20160731\\Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\pssm\\Rnorv20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pssm\\Rnorv20160731\\Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\arithmeticMean\\secondary\\Rnorv20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\secondary\\Rnorv20160731\\Rnorv20160731.txt", 53);
//
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\188\\Rnorv20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\188\\Rnorv20160731\\Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Rnorv20160731\\0_0_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Rnorv20160731\\0_0_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Rnorv20160731\\1_0_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Rnorv20160731\\1_0_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Rnorv20160731\\1_1_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Rnorv20160731\\1_1_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Rnorv20160731\\2_0_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Rnorv20160731\\2_0_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Rnorv20160731\\2_1_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Rnorv20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Rnorv20160731\\2_1_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Rnorv20160731\\1_0_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Rnorv20160731\\1_0_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Rnorv20160731\\2_0_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Rnorv20160731\\2_0_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Rnorv20160731\\2_1_0_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Rnorv20160731\\2_1_1_Rnorv20160731.txt", 53);
////            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Rnorv20160731\\3_0_0_Rnorv20160731.txt", 53);
////            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Rnorv20160731\\3_0_1_Rnorv20160731.txt", 53);
////            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Rnorv20160731\\3_1_0_Rnorv20160731.txt", 53);
////            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Rnorv20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Rnorv20160731\\3_1_1_Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\pseacc\\Rnorv20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pseacc\\Rnorv20160731\\Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\pssm\\Rnorv20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pssm\\Rnorv20160731\\Rnorv20160731.txt", 53);
//            KMeans.runKMeans(i, 527, "E:\\zjcData\\featurefusion\\harmonicMean\\secondary\\Rnorv20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\secondary\\Rnorv20160731\\Rnorv20160731.txt", 53);
//        }
//
//        for(int i = 100; i <= 500; i += 100){
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\188\\Ecoli20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\188\\Ecoli20160731\\Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Ecoli20160731\\0_0_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Ecoli20160731\\0_0_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Ecoli20160731\\1_0_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Ecoli20160731\\1_0_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Ecoli20160731\\1_1_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Ecoli20160731\\1_1_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Ecoli20160731\\2_0_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Ecoli20160731\\2_0_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Ecoli20160731\\2_1_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Ecoli20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Ecoli20160731\\2_1_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Ecoli20160731\\1_0_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Ecoli20160731\\1_0_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Ecoli20160731\\2_0_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Ecoli20160731\\2_0_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Ecoli20160731\\2_1_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Ecoli20160731\\2_1_1_Ecoli20160731.txt", 1162);
////            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Ecoli20160731\\3_0_0_Ecoli20160731.txt", 1162);
////            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Ecoli20160731\\3_0_1_Ecoli20160731.txt", 1162);
////            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Ecoli20160731\\3_1_0_Ecoli20160731.txt", 1162);
////            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Ecoli20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Ecoli20160731\\3_1_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\pseacc\\Ecoli20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pseacc\\Ecoli20160731\\Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\pssm\\Ecoli20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pssm\\Ecoli20160731\\Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\arithmeticMean\\secondary\\Ecoli20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\secondary\\Ecoli20160731\\Ecoli20160731.txt", 1162);
//
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\188\\Ecoli20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\188\\Ecoli20160731\\Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Ecoli20160731\\0_0_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Ecoli20160731\\0_0_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Ecoli20160731\\1_0_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Ecoli20160731\\1_0_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Ecoli20160731\\1_1_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Ecoli20160731\\1_1_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Ecoli20160731\\2_0_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Ecoli20160731\\2_0_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Ecoli20160731\\2_1_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Ecoli20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Ecoli20160731\\2_1_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Ecoli20160731\\1_0_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Ecoli20160731\\1_0_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Ecoli20160731\\2_0_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Ecoli20160731\\2_0_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Ecoli20160731\\2_1_0_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Ecoli20160731\\2_1_1_Ecoli20160731.txt", 1162);
////            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Ecoli20160731\\3_0_0_Ecoli20160731.txt", 1162);
////            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Ecoli20160731\\3_0_1_Ecoli20160731.txt", 1162);
////            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Ecoli20160731\\3_1_0_Ecoli20160731.txt", 1162);
////            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Ecoli20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Ecoli20160731\\3_1_1_Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\pseacc\\Ecoli20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pseacc\\Ecoli20160731\\Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\pssm\\Ecoli20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pssm\\Ecoli20160731\\Ecoli20160731.txt", 1162);
//            KMeans.runKMeans(i, 11608, "E:\\zjcData\\featurefusion\\harmonicMean\\secondary\\Ecoli20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\secondary\\Ecoli20160731\\Ecoli20160731.txt", 1162);
//        }
//
//        for(int i = 1000; i <= 1000; i += 1000){
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\188\\Dmela20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\188\\Dmela20160731\\Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Dmela20160731\\0_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Dmela20160731\\0_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Dmela20160731\\1_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Dmela20160731\\1_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Dmela20160731\\1_1_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Dmela20160731\\1_1_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Dmela20160731\\2_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Dmela20160731\\2_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Dmela20160731\\2_1_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Dmela20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Dmela20160731\\2_1_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Dmela20160731\\1_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Dmela20160731\\1_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Dmela20160731\\2_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Dmela20160731\\2_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Dmela20160731\\2_1_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Dmela20160731\\2_1_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14923, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Dmela20160731\\3_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14923, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Dmela20160731\\3_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14923, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Dmela20160731\\3_1_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14923, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Dmela20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Dmela20160731\\3_1_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\pseacc\\Dmela20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pseacc\\Dmela20160731\\Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\pssm\\Dmela20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pssm\\Dmela20160731\\Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\arithmeticMean\\secondary\\Dmela20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\secondary\\Dmela20160731\\Dmela20160731.txt", 1494);
//
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\188\\Dmela20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\188\\Dmela20160731\\Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Dmela20160731\\0_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Dmela20160731\\0_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Dmela20160731\\1_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Dmela20160731\\1_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Dmela20160731\\1_1_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Dmela20160731\\1_1_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Dmela20160731\\2_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Dmela20160731\\2_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Dmela20160731\\2_1_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Dmela20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Dmela20160731\\2_1_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Dmela20160731\\1_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Dmela20160731\\1_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Dmela20160731\\2_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Dmela20160731\\2_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Dmela20160731\\2_1_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Dmela20160731\\2_1_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14923, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Dmela20160731\\3_0_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14923, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Dmela20160731\\3_0_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14923, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Dmela20160731\\3_1_0_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14923, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Dmela20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Dmela20160731\\3_1_1_Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\pseacc\\Dmela20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pseacc\\Dmela20160731\\Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\pssm\\Dmela20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pssm\\Dmela20160731\\Dmela20160731.txt", 1494);
//            KMeans.runKMeans(i, 14922, "E:\\zjcData\\featurefusion\\harmonicMean\\secondary\\Dmela20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\secondary\\Dmela20160731\\Dmela20160731.txt", 1494);
//        }

//        for(int i = 1000; i <= 1000; i += 1000){
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\188\\Scere20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\188\\Scere20160731\\Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Scere20160731\\0_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Scere20160731\\0_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Scere20160731\\1_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Scere20160731\\1_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Scere20160731\\1_1_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Scere20160731\\1_1_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Scere20160731\\2_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Scere20160731\\2_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Scere20160731\\2_1_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\kskip\\Scere20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\kskip\\Scere20160731\\2_1_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Scere20160731\\1_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Scere20160731\\1_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Scere20160731\\2_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Scere20160731\\2_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Scere20160731\\2_1_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Scere20160731\\2_1_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Scere20160731\\3_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Scere20160731\\3_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Scere20160731\\3_1_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\ngram\\Scere20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\ngram\\Scere20160731\\3_1_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\pseacc\\Scere20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pseacc\\Scere20160731\\Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\pssm\\Scere20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\pssm\\Scere20160731\\Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\arithmeticMean\\secondary\\Scere20160731.txt", "D:\\zjcDATA\\data\\kmeans\\arithmeticMean\\secondary\\Scere20160731\\Scere20160731.txt", 2259);
//
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\188\\Scere20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\188\\Scere20160731\\Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Scere20160731\\0_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\0_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Scere20160731\\0_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Scere20160731\\1_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Scere20160731\\1_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Scere20160731\\1_1_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\1_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Scere20160731\\1_1_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Scere20160731\\2_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Scere20160731\\2_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Scere20160731\\2_1_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\kskip\\Scere20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\kskip\\Scere20160731\\2_1_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Scere20160731\\1_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\1_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Scere20160731\\1_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Scere20160731\\2_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Scere20160731\\2_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Scere20160731\\2_1_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\2_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Scere20160731\\2_1_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Scere20160731\\3_0_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_0_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Scere20160731\\3_0_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_0.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Scere20160731\\3_1_0_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\ngram\\Scere20160731\\3_1_1.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\ngram\\Scere20160731\\3_1_1_Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\pseacc\\Scere20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pseacc\\Scere20160731\\Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\pssm\\Scere20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\pssm\\Scere20160731\\Scere20160731.txt", 2259);
//            KMeans.runKMeans(i, 22561, "E:\\zjcData\\featurefusion\\harmonicMean\\secondary\\Scere20160731.txt", "D:\\zjcDATA\\data\\kmeans\\harmonicMean\\secondary\\Scere20160731\\Scere20160731.txt", 2259);
//        }


        //构造arff文件
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_0_0_1_skip.txt", "D:\\zjcDATA\\data\\reorderNew\\Hsapi_0_0_1_ksip.txt", "D:\\zjcDATA\\data\\reorderNew", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_1_0_1_ngram.txt", "D:\\zjcDATA\\data\\reorderNew\\Hsapi_1_0_1_ngram.txt", "D:\\zjcDATA\\data\\reorderNew", 6237, 20);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_1_0_1_skip.txt", "D:\\zjcDATA\\data\\reorderNew\\Hsapi_1_0_1_kskip.txt", "D:\\zjcDATA\\data\\reorderNew", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_1_1_1_skip.txt", "D:\\zjcDATA\\data\\reorderNew\\Hsapi_1_1_1_kskip.txt", "D:\\zjcDATA\\data\\reorderNew", 6237, 800);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_2_0_1_ngram.txt", "D:\\zjcDATA\\data\\reorderNew\\Hsapi_2_0_1_ngram.txt", "D:\\zjcDATA\\data\\reorderNew", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_2_0_1_skip.txt", "D:\\zjcDATA\\data\\reorderNew\\Hsapi_2_0_1_kskip.txt", "D:\\zjcDATA\\data\\reorderNew", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_2_1_1_ngram.txt", "D:\\zjcDATA\\data\\reorderNew\\Hsapi_2_1_1_ngram.txt", "D:\\zjcDATA\\data\\reorderNew", 6237, 420);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_2_1_1_skip.txt", "D:\\zjcDATA\\data\\reorderNew\\Hsapi_2_1_1_kskip.txt", "D:\\zjcDATA\\data\\reorderNew", 6237, 1200);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_188.txt", "D:\\zjcDATA\\data\\reorderNew\\Hsapi20160731_188.txt", "D:\\zjcDATA\\data\\reorderNew", 6237, 189);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_secondary.txt", "D:\\zjcDATA\\data\\reorderNew\\Hsapi20160731_secondary.txt", "D:\\zjcDATA\\data\\reorderNew", 6237, 12);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\AminoAcidsReorder.txt", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188\\Hsapi20160731.txt", "D:\\zjcDATA\\data\\featurefusion\\arithmeticMean\\188", 6237, 189);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_188.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\188.txt", "E:\\zjcDATA\\arff", 6237, 189);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_188.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\188.txt", "E:\\zjcDATA\\arff", 6237, 189);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_188.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\188.txt", "E:\\zjcDATA\\arff", 6237, 189);

//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_pssm.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\pssm.txt", "E:\\zjcDATA\\arff", 6237, 40);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_pssm.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\pssm.txt", "E:\\zjcDATA\\arff", 6237, 40);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_pssm.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\pssm.txt", "E:\\zjcDATA\\arff", 6237, 40);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_secondary.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\secondary.txt", "E:\\zjcDATA\\arff", 6237, 12);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_secondary.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\secondary.txt", "E:\\zjcDATA\\arff", 6237, 12);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_secondary.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\secondary.txt", "E:\\zjcDATA\\arff", 6237, 12);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_0_0_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\0_0_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_0_0_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\0_0_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_0_0_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\0_0_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 400);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_1_0_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\1_0_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_1_0_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\1_0_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_1_0_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\1_0_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 400);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_2_0_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_0_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_2_0_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_0_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_2_0_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_0_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 400);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_2_1_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_1_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 1200);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_2_1_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_1_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 1200);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_2_1_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_1_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 1200);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_1_1_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\1_1_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 800);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_1_1_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\1_1_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 800);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_1_1_1_kskip.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\1_1_1_kskip.txt", "E:\\zjcDATA\\arff", 6237, 800);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_1_0_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\1_0_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 20);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_1_0_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\1_0_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 20);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_1_0_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\1_0_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 20);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_2_0_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_0_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_2_0_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_0_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 400);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_2_0_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_0_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 400);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_2_1_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_1_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 420);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_2_1_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_1_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 420);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_2_1_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\2_1_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 420);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_3_0_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\3_0_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 8000);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_3_0_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\3_0_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 8000);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_3_0_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\3_0_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 8000);
//
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\Negatome_3_1_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\3_1_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 8420);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\AminoAcidsReorder_3_1_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\3_1_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 8420);
//        GetArffFiles.constructArffFile("D:\\zjcDATA\\data\\negativeData\\ProteinRecombine_3_1_1_ngram.txt", "D:\\zjcDATA\\data\\positiveAfterKmeans\\3_1_1_ngram.txt", "E:\\zjcDATA\\arff", 6237, 8420);

//        FeatureCombination.runFeatureCombination("D:\\zjcDATA\\data\\conbination\\Negatome_combination.arff", 1861, 5, "E:\\zjcData\\arff\\Negatome_2_1_1_kskip.arff", "E:\\zjcData\\arff\\Negatome_2_1_1_ngram.arff", "E:\\zjcData\\arff\\Negatome_188.arff", "E:\\zjcData\\arff\\Negatome_pssm.arff", "E:\\zjcData\\arff\\Negatome_secondary.arff");
//        FeatureCombination.runFeatureCombination("D:\\zjcDATA\\data\\conbination\\ProteinRecombine_combination.arff", 1861, 5, "E:\\zjcData\\arff\\ProteinRecombine_2_1_1_kskip.arff", "E:\\zjcData\\arff\\ProteinRecombine_2_1_1_ngram.arff", "E:\\zjcData\\arff\\ProteinRecombine_188.arff", "E:\\zjcData\\arff\\ProteinRecombine_pssm.arff", "E:\\zjcData\\arff\\ProteinRecombine_secondary.arff");
//        FeatureCombination.runFeatureCombination("D:\\zjcDATA\\data\\conbination\\AminoAcidsReorder_combination.arff", 1821, 4, "D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_2_1_1_skip.arff", "D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_2_1_1_ngram.arff", "D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_188.arff", "D:\\zjcDATA\\data\\reorderNew\\AminoAcidsReorder_secondary.arff");
        //z test特征选择

//        Ztest.calcZtest("D:\\zjcDATA\\data\\conbination\\Negatome_combination.arff", "D:\\zjcDATA\\data\\conbination\\Negatome_ztest.txt", 6237, 1861);
//        Ztest.calcZtest("D:\\zjcDATA\\data\\conbination\\AminoAcidsReorder_combination.arff", "D:\\zjcDATA\\data\\conbination\\AminoAcidsReorder_ztest.txt", 6237, 1821);
//        Ztest.calcZtest("D:\\zjcDATA\\data\\conbination\\ProteinRecombine_combination.arff", "D:\\zjcDATA\\data\\conbination\\ProteinRecombine_ztest.txt", 6237, 1861);


        //mrmd
        MRMD mrmd = new MRMD();
        mrmd.runMRMD("D:\\zjcDATA\\data\\conbination\\Negatome_combination.arff", "D:\\zjcDATA\\data\\conbination\\Negatome_mrmd.txt", 12474, 1861);
        mrmd.runMRMD("D:\\zjcDATA\\data\\conbination\\AminoAcidsReorder_combination.arff", "D:\\zjcDATA\\data\\conbination\\AminoAcidsReorder_mrmd.txt", 12474, 1861);
        mrmd.runMRMD("D:\\zjcDATA\\data\\conbination\\ProteinRecombine_combination.arff", "D:\\zjcDATA\\data\\conbination\\ProteinRecombine_mrmd.txt", 12474, 1861);

//        mrmd.runMRMD("E:\\zjcData\\arff\\Negatome_secondary.arff", 12474, 12);

        FeatureSelect fs = new FeatureSelect();
//        fs.getMRMDFeature("E:\\zjcData\\mrmd\\mrmd.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\mrmd1200.arff", 1200);
//        fs.getMRMDFeature("E:\\zjcData\\mrmd\\mrmd.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\mrmd1000.arff", 1000);
//        fs.getMRMDFeature("E:\\zjcData\\mrmd\\mrmd.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\mrmd800.arff", 800);
//        fs.getMRMDFeature("E:\\zjcData\\mrmd\\mrmd.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\mrmd600.arff", 600);
//        fs.getMRMDFeature("E:\\zjcData\\mrmd\\mrmd.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\mrmd400.arff", 400);
//        fs.getMRMDFeature("E:\\zjcData\\mrmd\\mrmd.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\mrmd200.arff", 200);
//
//        fs.getInforGainFeature("E:\\zjcData\\mrmd\\inforGain.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\inforGain1200.arff", 1200);
//        fs.getInforGainFeature("E:\\zjcData\\mrmd\\inforGain.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\inforGain1000.arff", 1000);
//        fs.getInforGainFeature("E:\\zjcData\\mrmd\\inforGain.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\inforGain800.arff", 800);
//        fs.getInforGainFeature("E:\\zjcData\\mrmd\\inforGain.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\inforGain600.arff", 600);
//        fs.getInforGainFeature("E:\\zjcData\\mrmd\\inforGain.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\inforGain400.arff", 400);
//        fs.getInforGainFeature("E:\\zjcData\\mrmd\\inforGain.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\inforGain200.arff", 200);
//
//        fs.getZtestFeature("E:\\zjcData\\mrmd\\ztest.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\ztest1200.arff", 1200);
//        fs.getZtestFeature("E:\\zjcData\\mrmd\\ztest.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\ztest1000.arff", 1000);
//        fs.getZtestFeature("E:\\zjcData\\mrmd\\ztest.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\ztest800.arff", 800);
//        fs.getZtestFeature("E:\\zjcData\\mrmd\\ztest.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\ztest600.arff", 600);
//        fs.getZtestFeature("E:\\zjcData\\mrmd\\ztest.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\ztest400.arff", 400);
//        fs.getZtestFeature("E:\\zjcData\\mrmd\\ztest.txt", "E:\\zjcData\\arff\\combination.arff", "E:\\zjcData\\featureSelect\\ztest200.arff", 200);

//        CountFeatureDistribution.countMRMD("E:\\zjcData\\mrmd\\mrmd.txt", 800);
//        CountFeatureDistribution.countMRMD("E:\\zjcData\\mrmd\\mrmd.txt", 1000);
//        CountFeatureDistribution.countZtest("E:\\zjcData\\mrmd\\ztest.txt", 200);
//        CountFeatureDistribution.countZtest("E:\\zjcData\\mrmd\\ztest.txt", 400);
//        CountFeatureDistribution.countZtest("E:\\zjcData\\mrmd\\ztest.txt", 600);
//        CountFeatureDistribution.countZtest("E:\\zjcData\\mrmd\\ztest.txt", 800);
//        CountFeatureDistribution.countZtest("E:\\zjcData\\mrmd\\ztest.txt", 1000);
//        CountFeatureDistribution.countZtest("E:\\zjcData\\mrmd\\ztest.txt", 1200);
//        CountFeatureDistribution.countZtest("E:\\zjcData\\mrmd\\ztest.txt", 1460);
//        CountFeatureDistribution.countInforGain("E:\\zjcData\\mrmd\\inforGain.txt", 200);
//        CountFeatureDistribution.countInforGain("E:\\zjcData\\mrmd\\inforGain.txt", 400);
//        CountFeatureDistribution.countInforGain("E:\\zjcData\\mrmd\\inforGain.txt", 600);
//        CountFeatureDistribution.countInforGain("E:\\zjcData\\mrmd\\inforGain.txt", 800);
//        CountFeatureDistribution.countInforGain("E:\\zjcData\\mrmd\\inforGain.txt", 1000);
//        CountFeatureDistribution.countInforGain("E:\\zjcData\\mrmd\\inforGain.txt", 1200);

    }
}
