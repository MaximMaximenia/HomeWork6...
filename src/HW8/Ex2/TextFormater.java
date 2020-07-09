package HW8.Ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;

public class TextFormater  {

    public TextFormater() {
    }

    public int wordValueInStr(String str) {
        String[] words;
        int count = 0;
        words = str.split(" ");
        for (String word : words) {
            count++;

        }
    return count;
    }

    public boolean polindromChek (String str) {
        String[] words;
        int count= 0;
        words = str.split(" ");
        for (String word : words) {
        StringBuffer sb = new StringBuffer(word);
            sb.reverse();
            if( word.equalsIgnoreCase(String.valueOf(sb))&&word.length()!=1){
                count++;
            }}
            if(count>0) {
                return true;
            }
            else{
                return false;}



    }}
