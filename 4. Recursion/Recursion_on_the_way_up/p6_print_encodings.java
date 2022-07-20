package Recursion_on_the_way_up;
import java.util.*;

import javax.management.monitor.StringMonitor;

public class p6_print_encodings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        if(str.charAt(0) != '0'){
            printEncodings(str, "");
        }
    }

    public static void printEncodings(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }else if(str.length() == 1){
            if(str.charAt(0) == '0'){
                return;
            }else{
                String ch0 = str.substring(0, 1);
                String remStr = str.substring(1);
                String code0 = (char) ('a' + (Integer.parseInt(ch0) - 1)) + "";
                // 97 + ch0=1 - 1 = 97(int) -> (a)char + "" -> (a)String -> got (a) as String in code0
                printEncodings(remStr, ans + code0); 
            }
        }else{
            if(str.charAt(0) == '0'){
                return;
            }else{
                String ch0 = str.substring(0, 1);
                String remStr = str.substring(1);
                String code0 = (char) ('a' + (Integer.parseInt(ch0) - 1)) + "";
                // 97 + ch0=1 - 1 = 97(int) -> (a)char + "" -> (a)String -> got (a) as String in code0
                printEncodings(remStr, ans + code0); 

                String ch01 = str.substring(0, 2);
                String remStr01 = str.substring(2);
                String code01 = (char)('a' + (Integer.parseInt(ch01) - 1)) + "";
                if(Integer.parseInt(ch01) <= 26){
                    printEncodings(remStr01, ans + code01);
                }
            }
        }
    }
}
