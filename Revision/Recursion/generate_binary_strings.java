package Recursion;
import java.util.*;

public class generate_binary_strings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        generateBinaryStrings(str, "");
        scn.close();
    }

    public static void generateBinaryStrings(String str, String ans) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }

        if(str.charAt(0)=='?') {
            generateBinaryStrings(str.substring(1), ans+"0");
            generateBinaryStrings(str.substring(1), ans+"1");
        }else {
            generateBinaryStrings(str.substring(1), ans + str.charAt(0));
        }
    }
}
