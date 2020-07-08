package HW8.Ex1;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src\\HW8\\Wrds.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src\\HW8\\WrdsPolindroms.txt"))) {
            String s;

            while ((s = br.readLine()) != null) {
                StringBuffer sb = new StringBuffer(s);
                sb.reverse();
                if (s.equalsIgnoreCase(String.valueOf(sb))&&s.length()!=1){
                    bw.write(s+"\n");
                }

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
