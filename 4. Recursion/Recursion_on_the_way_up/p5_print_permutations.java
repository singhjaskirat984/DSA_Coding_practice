package Recursion_on_the_way_up;
import java.util.*;

public class p5_print_permutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            printPermutations(str.substring(0, i) + str.substring(i+1), asf + ch);
        }
    }
}
