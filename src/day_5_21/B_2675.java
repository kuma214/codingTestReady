package day_5_21;

import java.util.ArrayList;
import java.util.Scanner;

public class B_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        int R = 0;
        String S = "";
        ArrayList<String> resultL = new ArrayList<>();
        
        for(int i = 0; i < testCase; i++){
            R = sc.nextInt();
            S = sc.next();
            String[] n = S.split("");
            StringBuilder a = new StringBuilder();
            for(String u : n){
                for(int j = 0; j < R; j++){
                    a.append(u);
                }
            }
            resultL.add(a.toString());
        }
        for(int i = 0; i < testCase; i++){
            System.out.println(resultL.get(i));
        }
    }
}
