package day_4_29;

import java.util.Scanner;

public class B_JungMin_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String get = sc.nextLine();
        String[] sa = get.split(" ");

        int n = 0;
        for (String s : sa) {
            n += Integer.parseInt(s);
        }
        System.out.print(n);
    }
}
