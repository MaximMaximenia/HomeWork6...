package HW7.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {


        String s = "London is the capital of Great Britain";
        Scanner sc = new Scanner(System.in);
        String c;
        String x;
        String g;
        System.out.println("ВВЕДИТЕ ПЕРВЫЙ СИМВОЛ :");
        x = sc.nextLine();
        System.out.println("ВВЕДИТЕ ВТОРОЙ СИМВОЛ :");
        c = sc.nextLine();
       g = s.substring(s.indexOf(x),s.lastIndexOf(c) + 1);
        System.out.println(g);

    }
}

