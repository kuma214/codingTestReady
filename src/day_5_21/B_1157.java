package day_5_21;

import java.util.Arrays;
import java.util.Scanner;

public class B_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 단어를 받는다.
        String get = sc.next();

        // 2. 단어의 모든 알파벳을 대문자로 변환
        get = get.toUpperCase();
        get = get.replaceAll("[^A-Z]","");
        StringBuffer b = new StringBuffer(get);
        b.append("_");
        get = b.toString();

        // 3. 배열을 정렬
        String[] n = get.split("");
        Arrays.sort(n);

        // 4. 가장 많은 알파벳을 찾는다.
        int max = 0;
        int last = -1;
        String result = n[0];

        for(int i = 0; i < n.length-1; i++){
            if(!n[i].equals(n[i+1])){
                if(i-last > max){
                    max = i - last;
                    last = i;
                    result = n[i];
                } else if (i - last == max) {
                    last = i;
                    result = "?";
                }
            }
        }

        System.out.println(result);
    }
}
