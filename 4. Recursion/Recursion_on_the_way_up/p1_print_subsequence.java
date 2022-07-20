package Recursion_on_the_way_up;
import java.util.*;

public class p1_print_subsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str, "");
    }

    public static void printSS(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String cuttedString = str.substring(1);

        printSS(cuttedString, ans + ch);
        printSS(cuttedString, ans + "");
    }
}
