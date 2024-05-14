package day_5_14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public boolean checker(int n){
        if(n == 0){
            return true;
        }
        if(n%5 == 0){
            return checker(n/10);
        }else {
            return false;
        }
    }

    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = l; i < r+1; i++){
            if(checker(i)){
                result.add(i);
            }
        }
        if(result.isEmpty()){
            int[] answer = {-1};
            return answer;
        }else {
            int[] answer = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
            return answer;
        }
    }
}

public class P_list2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        //System.out.println(Arrays.toString(s.solution(10, 20)));
        System.out.println(Arrays.toString(s.solution(5, 555)));
    }
}
