import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        String[] strArr = str.split(" ");
        int min = Integer.MIN_VALUE;

        for(String s : strArr) {
            int length = s.length();
            if(length > min) {
                min = length;
                answer = s;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
