import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String result = "";
        for(char x : str.toCharArray()) {
            if(Character.isUpperCase(x)) {
                result+=Character.toLowerCase(x);
            } else {
                result+=Character.toUpperCase(x);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
