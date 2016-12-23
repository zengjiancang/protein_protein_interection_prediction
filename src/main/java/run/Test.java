package run;

import util.ReplaceBadAminoAcid;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zjc on 2016/11/21.
 */
public class Test {
    public static void main(String args[]) throws IOException{
//        String s = "DIP-617N|refseq:NP_000607|uniprotkb:P01730\tDIP-6173333N|refseq:NP_000607|uniprotkb:P01730\t-\t-\t-\t-\tMI:0114(x-ray crystallography)|MI:0031(protein cross-linking with a bifunctional reagent)\t-\tpubmed:9168119|pubmed:DIP-17838S|pubmed:9168119|pubmed:DIP-17838S\ttaxid:9606(Homo sapiens)\ttaxid:9606(Homo sapiens)\tMI:0407(direct interaction)|MI:0407(direct interaction)\tMI:0465(dip)\tDIP-42E\tdip-quality-status:core\tdip:0004(small scale)|dip:0004(small scale)\t\t-";
//        Pattern pattern = Pattern.compile("DIP-[0-9]*N");
//        Matcher matcher = pattern.matcher(s);
//        while(matcher.find()){
//            System.out.println(matcher.group());
//        }
//        String s2 = ">dip:DIP-250N|refseq:NP_499284|uniprot:P41958";
//        System.out.println(ReplaceBadAminoAcid.replaceAminoAcid("XBZU"));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\test.pssm")), "utf-8"));
//        String inputLine = bufferedReader.readLine();
//        inputLine = bufferedReader.readLine();
//        inputLine = bufferedReader.readLine();
//        inputLine = bufferedReader.readLine();
//        int lineNum = 0;
//        String s = "   1 M C   0.999  0.001  0.000";
////        while(lineNum <= 0 && inputLine != null){
//            String str[] = s.trim().split("[ ]+");
//            for(int i = 0; i < str.length; i ++){
//                System.out.println(str[i]);
//            }
//            lineNum ++;
//            inputLine = bufferedReader.readLine();
////        }
//        bufferedReader.close();

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        System.out.println(a.size());
        a.clear();
        System.out.println(a.size());

    }
}
