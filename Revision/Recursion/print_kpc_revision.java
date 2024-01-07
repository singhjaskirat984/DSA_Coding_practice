package Recursion;
import java.util.*;

public class print_kpc_revision {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printKPCRevision(str, "");
        scn.close();
    }

    public static void printKPCRevision(String str, String ans) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }

        String[] arr = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
        char ch = str.charAt(0);
        int c = ch - '0';
        String s = arr[c];

        for(int i=0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            printKPCRevision(str.substring(1), ans+c1);
        }
    }
}
