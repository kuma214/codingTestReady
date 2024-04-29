package day_4_29;

public class P_makeSolution_1 {
    public static void main(String[] args) {
        System.out.println(solution(5, "a"));
    }

    private static int solution(int n, String control) {
        String[] list = control.split("");
        for(int i = 0; i < list.length; i++){
            switch (list[i]){
                case "w": n += 1; break;
                case "s": n -= 1; break;
                case "d": n += 10; break;
                case "a": n -= 10; break;
                default: break;
            }
        }
        return n;
    }
}
