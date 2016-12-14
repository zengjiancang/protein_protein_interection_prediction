package util;

import java.io.*;
import java.net.URL;

/**
 * Created by zjc on 2016/11/21.
 */
public class GetNegatomeData {

    public static String negatomeDir = "D:\\ZJC_WORKSPACE\\protein_protein_interection_prediction\\data\\negative\\Negatome";

    public static void parserProteinId(String id1, String id2, String fileName){
        File dir = new File(negatomeDir);
        if(!dir.exists()){
            dir.mkdir();
        }
        String urlString = "http://www.uniprot.org/uniprot/" + id1 +".fasta";
        try{
            URL proteinUrl = new URL(urlString);
            InputStream inputStream = proteinUrl.openStream();
            BufferedReader proteinReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            BufferedWriter proteinWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(negatomeDir + "\\" + fileName + ".fasta"), false), "utf-8"));
            String line = proteinReader.readLine();
            while(line != null){
                proteinWriter.write(line);
                proteinWriter.newLine();
                line = proteinReader.readLine();
            }
            proteinReader.close();

            int random = (int)(Math.random() * 1000 +1);
            Thread.currentThread().sleep(random);

            urlString = "http://www.uniprot.org/uniprot/" + id2 +".fasta";
            proteinUrl = new URL(urlString);
            inputStream = proteinUrl.openStream();
            proteinReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            line = proteinReader.readLine();
            while(line != null){
                proteinWriter.write(line);
                proteinWriter.newLine();
                line = proteinReader.readLine();
            }
            proteinReader.close();
            proteinWriter.flush();
            proteinWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void getNegatomeData(String proteinIdFilePath){
        File proteinIdFile = new File(proteinIdFilePath);
        try{
            BufferedReader proteinIdReader = new BufferedReader(new InputStreamReader(new FileInputStream(proteinIdFile), "utf-8"));
            String idPair = proteinIdReader.readLine();
            int count = 2849;
            while(idPair != null){
                String id1 = idPair.split("\t")[0];
                String id2 = idPair.split("\t")[1];
                System.out.println(id1 + "\t" + id2);
                parserProteinId(id1, id2, count + "");
                idPair = proteinIdReader.readLine();
                count ++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
