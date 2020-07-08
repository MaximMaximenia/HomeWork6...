package HW7;

public class AditionalEX {
    public static void main(String[] args) {
        String text = "Text.Text,text,text.text_ert";
        int x = text.length();
        int y = text.replaceAll("[,._]", "").length();
      System.out.println("Количество знаков препинания : " + (x - y));
        System.out.println();
        String text2 = "London is the capital of Great Britain";
        String[]wrd;
        wrd = text2.split(" ");
StringBuilder wrd2 = new StringBuilder();
for(String word : wrd){
    wrd2.append(word.charAt(word.length()-1));
}
        System.out.println(wrd2);









    }


    }

