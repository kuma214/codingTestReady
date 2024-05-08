package day_5_08;

import java.util.*;

public class B_10814 {
    public static void main(String[] args) {

        //1. 회원수를 받는다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //2. 회원의 리스트를 받는다.
        //ArrayList<String>[] list = new ArrayList[n];

        String[][] list = new String[n][2];

        for(int i = 0; i < n; i++){
            //list[i]= new ArrayList<String>();
//            list[i].add(sc.next());
//            list[i].add(sc.next());
            list[i][0] = sc.next();
            list[i][1] = sc.next();
        }

        //3. 회원의 순서를 정리한다. 아래는 우선 순위
        // 1-나이데로
        // 2-가입한 순서

        Arrays.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });



        for(int i = 0; i < n; i++){
            System.out.println(list[i][0]+" "+list[i][1]);
        }

    }
}
