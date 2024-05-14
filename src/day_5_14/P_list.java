package day_5_14;

import java.util.Arrays;

class Solution1 {
    public int[] solution(int[] arr, int[] query) {
        for(int i = 0; i < query.length; i++){
            if(i%2 == 0){
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i],arr.length);
            }
        }
        int[] answer = arr;
        return answer;
    }
}

public class P_list {
    public static void main(String[] args) {

    }
}
