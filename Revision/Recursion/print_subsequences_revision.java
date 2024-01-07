package Recursion;
import java.util.*;

public class print_subsequences_revision {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printSubsequencesRevison(str, "");
    }

    public static void printSubsequencesRevison(String str, String ans) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        printSubsequencesRevison(str.substring(1), ans);
        printSubsequencesRevison(str.substring(1), ans+ch);
    }
}
