package day_5_08;

/*
세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다.
그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
https://www.acmicpc.net/problem/1546
 */

import java.util.Scanner;

public class B_1546 {
    public static void main(String[] args) {

        //1. 최대 갯수를 받는다. 0~1000
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //2. 점수 리스트를 받는다.
        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = sc.nextInt();
        }

        //3. 제일 큰 점수를 찾는다.
        int max = 0;
        for(int i = 0; i < l.length; i++){
            if(max < l[i]) {
                max = l[i];
            }
        }

        //4. 새로운 평균을 구한다. 단 제일 큰 점수는 유지한다.
        double sum = 0;
        for(int i = 0; i < l.length; i++){
            sum += (double) l[i]/max*100;
        }

        double result = (double) sum / n;

        System.out.println(result);
    }
}
