package day_4_29;

import java.util.Scanner;

public class P_HolJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
    }
}
