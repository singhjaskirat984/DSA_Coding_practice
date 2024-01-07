import java.util.*;

public class replace_all_0_with_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        replaceAll0with5(str, "");
        scn.close();
    }

    public static void replaceAll0with5(String str, String ans) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        if(ch == '0') {
            replaceAll0with5(str.substring(1), ans + "5");
        }else{
            replaceAll0with5(str.substring(1), ans + ch);
        }
    }
}
