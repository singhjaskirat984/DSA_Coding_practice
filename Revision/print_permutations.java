import java.util.*;

public class print_permutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        printPermutations(str, str, "");

        scn.close();
    }

    public static void printPermutations(String str, String og, String ans) {
        if (ans.length() == og.length()) {
            if (ans.compareTo(og) > 0) {
                System.out.println(ans);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String str1 = str.substring(0, i);
            String str2 = str.substring(i + 1);

            printPermutations(str1 + str2, og, ans + ch);
        }
    }
}
