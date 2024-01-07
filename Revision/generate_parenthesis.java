import java.util.*;

public class generate_parenthesis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        generateParenthesis(n, n, "");
    }

    public static void generateParenthesis(int open, int close, String str) {
        if(open==0 && close==0) {
            System.out.println(str);
            return;
        }

        if(open!=0) {
            generateParenthesis(open-1, close, str+"(");
        }

        if(open<close) {
            generateParenthesis(open, close-1, str+")");
        }
    }
}
