package Recursion_on_the_way_up;
import java.util.*;

public class p2_print_kpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str, "");
    }

    static String[] kpcArray = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKPC(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        int parsedCh = Integer.parseInt(ch + "");
        String stringRetrievedFromKPCArray = kpcArray[parsedCh];
        String cuttedString = str.substring(1);
        for(int i=0; i<stringRetrievedFromKPCArray.length(); i++){
            char cho = stringRetrievedFromKPCArray.charAt(i);
            printKPC(cuttedString, ans + cho);
        }
    }
}
