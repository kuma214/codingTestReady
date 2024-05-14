package day_5_14;

import java.util.ArrayList;
import java.util.Scanner;

public class B_1316 {

    public static boolean check(String w){
        String[] s = makeShort(w).split("");
        boolean result = true;
        out:
        for(int i = 0; i < s.length; i++){
            for(int j = i+1; j < s.length; j++){
                if (s[i].equals(s[j])) {
                    result = false;
                    break out;
                }
            }
        }
        return result;
    }

    public static String makeShort(String n){
        String[] s = n.split("");
        ArrayList<String> newone = new ArrayList<>();
        newone.add(s[0]);
        for(int i = 0; i < s.length-1; i++){
            if(s[i].equals(s[i+1])){

            }else{
                newone.add(s[i+1]);
            }
        }
        String str = "";
        for(String k : newone){
            str += k;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;

        for(int i = 0; i < num; i++){
            String get = sc.next();
            if(check(get)){
                result++;
            }
        }

        System.out.println(result);

    }
}
