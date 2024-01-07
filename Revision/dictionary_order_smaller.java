import java.util.*;

public class dictionary_order_smaller {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        dictionaryOrderSmalller(str, "", str);
    }

    public static void dictionaryOrderSmalller(String str, String ans, String og) {

        if(ans.length() == og.length()) {
            if(ans.compareTo(og)<0) {
                System.out.println(ans);
            }
            return;
        }

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            String str1 = str.substring(0, i);
            String str2 = str.substring(i+1);

            dictionaryOrderSmalller(str1+str2, ans+ch+"", og);
        }
    }
}
