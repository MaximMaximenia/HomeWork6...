package HW8.Ex3;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextCheker {
    public static void main(String[] args) {
        String text = "";
        String blackList = "";
        System.out.println();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\HW8\\Ex3\\CenText.txt"));
             BufferedReader br1 = new BufferedReader(new FileReader("src\\HW8\\Ex3\\BlackList.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                text += line;
            }
            String line1;
            while ((line1 = br1.readLine()) != null) {
                blackList += line1;
            }

            List<String> sentences = new ArrayList<>(Arrays.asList(text.toLowerCase().split("\\.")));
            List<String> blackWords = new ArrayList<>(Arrays.asList(blackList.toLowerCase().split(",")));
            List<Integer> blackSentencesNum = new ArrayList<>();
            List<String> blackSentences=new ArrayList<>();
            for (int i = 0; i < sentences.size(); i++){
                String[] wordsInSentences = sentences.get(i).replaceAll("[,\"]","").split(" ");
                for (int j = 0; j < wordsInSentences.length; j++){
                    for (int k = 0; k < blackWords.size(); k++){
                        if (wordsInSentences[j].equals(blackWords.get(k))){
                            blackSentencesNum.add(i + 1);
                            blackSentences.add(i+1+". "+sentences.get(i));
                        }
                    }
                }
            }
            if(!blackSentencesNum.isEmpty()){
                System.out.println("Вы должны отфармотировать " + blackSentencesNum.size() + " предложения.\n");

                System.out.print("Номер предложений не прошедших цензуру: ");
                for (Integer i : blackSentencesNum){
                    System.out.print(i + ";");
                }
                System.out.println();
                System.out.println();
                for (String oneBlackSntncs : blackSentences){
                    oneBlackSntncs = oneBlackSntncs.substring(0,4).toUpperCase()+oneBlackSntncs.substring(4);
                    System.err.println(oneBlackSntncs+".\n");
                }
                 {

                }
            }else{
                System.out.println("ПОЗДРАВЛЯЮ ТЕКСТ ПРОШЕЛ ЦЕНЗУРУ.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


