package util;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zjc on 2016/11/21.
 */
public class GetPositiveData {
    public static void getPosProteinSequence(String ppiPath) throws IOException{

        String homeDir = "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\positive\\";
        File ppiFile = new File(ppiPath);
        BufferedReader ppiDataReader = new BufferedReader(new InputStreamReader(new FileInputStream(ppiFile), "utf-8"));
        String outputPath = homeDir + ppiFile.getName().split("\\.")[0];
        File outputDir = new File(outputPath);
        outputDir.deleteOnExit();
        outputDir.mkdir();
        File fastaSequence = new File("D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\src\\main\\resources\\fasta20161101.seq");

        String ppiLine = ppiDataReader.readLine();
        ppiLine = ppiDataReader.readLine(); //过滤用于描述作用的第一行
        Pattern pattern = Pattern.compile("DIP-[0-9]*N");
        int fileNum = 1;
        while(ppiLine != null){
            Matcher matcher = pattern.matcher(ppiLine);
            String protein1 = "";
            if(matcher.find()){
                protein1 = matcher.group();
            }
            String protein2 = "";
            if(matcher.find()){
                protein2 = matcher.group();
            }
            if(protein1.equals(protein2)){
                System.out.println(ppiFile.getName() + " same: " + protein1 + "\t" + protein2);
                ppiLine = ppiDataReader.readLine();
                continue;
            }
            String outputFile =outputDir + "\\" + fileNum + ".fasta";
            BufferedWriter sequenceWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputFile), false), "utf-8"));
            fileNum ++;
            BufferedReader sequenceReader = new BufferedReader(new InputStreamReader(new FileInputStream(fastaSequence), "utf-8"));
            String sequenceLine = sequenceReader.readLine();
            int doneNum = 0;
            while(sequenceLine != null && doneNum != 2){
                if(sequenceLine.contains(protein1)){
                    doneNum ++;
                    sequenceWriter.write(sequenceLine);
                    sequenceWriter.newLine();
                    sequenceWriter.write(sequenceReader.readLine());
                    sequenceWriter.newLine();
                }
                if(sequenceLine.contains(protein2)){
                    doneNum ++;
                    sequenceWriter.write(sequenceLine);
                    sequenceWriter.newLine();
                    sequenceWriter.write(sequenceReader.readLine());
                    sequenceWriter.newLine();
                }
                sequenceLine = sequenceReader.readLine();
            }
            sequenceWriter.flush();
            sequenceWriter.close();
            sequenceReader.close();
            ppiLine = ppiDataReader.readLine();
        }
        ppiDataReader.close();
    }
}
