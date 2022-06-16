import java.util.Scanner;

public class Main {
    public int solution(String str, char t) {
        int answer = 0;
        // 무조건 대문자로 변환
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
//        System.out.println(str);
        // 1. 인덱스로 접근하는 경우
//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i)==t) {
//                answer++;
//            }
//        }

        // 2. 향상된 FOR문
        for(char x : str.toCharArray()) {
            if(x==t) answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); // 문자 1개를 가져옴
        System.out.println(T.solution(str, c));
    }
}
