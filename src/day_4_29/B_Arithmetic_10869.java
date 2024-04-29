package day_4_29;

import java.util.Scanner;

public class B_Arithmetic_10869 {
    /* 문제
    두 자연수 A와 B가 주어진다.
    이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

    입력 > 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
    ex) 7 3
    출력 > 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B,
     넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
    ex) 10
        4
        21
        2
        1
     */
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
