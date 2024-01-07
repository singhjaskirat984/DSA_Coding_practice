package Recursion;
import java.util.*;

public class replace_all_pi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ReplaceAllPi(str, "");
        scn.close();
    }

    public static void ReplaceAllPi(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch1 = str.charAt(0);

        if (ch1 == 'p' && str.length() > 1) {
            char ch2 = str.charAt(1);
            if (ch2 == 'i') {
                ReplaceAllPi(str.substring(2), ans + "3.14");
            }else{
                ReplaceAllPi(str.substring(1), ans + ch1);
            }
        } else {
            ReplaceAllPi(str.substring(1), ans + ch1);
        }
    }
}
