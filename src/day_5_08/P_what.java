package day_5_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public String solution(String code) {
        int mode = 0;
        List<String> rat = new ArrayList<>();
        String[] arr = code.split("");

        for(int idx=0;idx<code.length();idx++){
            if(mode == 0){
                if(Objects.equals(arr[idx], "1")){
                    mode = 1;
                }else{
                    if(idx %2 == 0){
                        rat.add(arr[idx]);
                    }
                }
            }else{
                if (Objects.equals(arr[idx], "1")) {
                    mode = 0;
                }else{
                    if(idx %2 != 0){
                        rat.add(arr[idx]);
                    }
                }
            }
        }
        if(String.join("", rat).isEmpty()){
            return "EMPTY";
        }else{
            return String.join("", rat);
        }

    }
}

public class P_what {
    public static void main(String[] args) {
        System.out.println("-----------");
        Solution s = new Solution();
        System.out.println(s.solution("abc1abc1abc"));
    }
}
