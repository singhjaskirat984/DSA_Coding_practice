package Recursion;
import java.util.*;

public class count_remove_replace_hi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        int count = countHi(str, 0);
        System.out.println(count);
        removeHi(str, "");
        replaceHiWithBye(str, "");

        scn.close();
    }

    public static int countHi(String str, int count) {
        if(str.length()==0) {
            return count;
        }

        char ch1 = str.charAt(0);
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        if(ch1=='h' && str.length()>1) {
            char ch2 = str.charAt(1);
            if(ch2=='i') {
                c1 = countHi(str.substring(2), count=count+1);
            }else {
                c2 = countHi(str.substring(1), count);
            } 
        }else{
            c3 = countHi(str.substring(1), count);
        }

        return c1 + c2 + c3;
    }

    public static void removeHi(String str, String ans) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }

        char ch1 = str.charAt(0);

        if(ch1=='h' && str.length()>1) {
            char ch2 = str.charAt(1);
            if(ch2=='i') {
                removeHi(str.substring(2), ans);
            }else {
                removeHi(str.substring(1), ans+ch1);
            }
        }else{
            removeHi(str.substring(1), ans+ch1);
        }
    }

    public static void replaceHiWithBye(String str, String ans) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }

        char ch1 = str.charAt(0);

        if(ch1=='h' && str.length()>1) {
            char ch2 = str.charAt(1);
            if ((ch2=='i')) {
                replaceHiWithBye(str.substring(2), ans+"bye");
            }else{
                replaceHiWithBye(str.substring(1), ans+ch1);
            }
        }else{
            replaceHiWithBye(str.substring(1), ans+ch1);
        }
    }


}
