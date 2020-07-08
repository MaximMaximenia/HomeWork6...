package HW8.Ex2;

import java.io.*;

public class Ex2 {
    public static void main(String[] args)  {
        TextFormater tf = new TextFormater();
       try( BufferedReader br = new BufferedReader(new FileReader("src\\HW8\\Ex2\\Text.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\HW8\\Ex2\\OUTPUT.txt"))){
        String str;
        while ((str = br.readLine()) != null) {
           if(tf.wordValueInStr(str)>=3&&tf.wordValueInStr(str)<=5){
               bw.write(str+"\n");
           }
           if(tf.polindromChek(str)){
               bw.write(str+"\n");
           }

        }
    }
       catch (IOException ex){
           ex.getCause();
       }
}}


