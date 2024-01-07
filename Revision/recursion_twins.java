import java.util.*;

public class recursion_twins {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        recursionTwins(0, str, 0);

        // System.out.println(count);

        scn.close();
    }

    public static void recursionTwins(int i, String str, int count) {
        if(i==str.length()) {
            System.out.println(count);
            return;
        }

        if(i+2<str.length() && str.charAt(i)==str.charAt(i+2)) {
            count = count + 1;
            recursionTwins(i+1, str, count);
        }else {
            recursionTwins(i+1, str, count);
        }

        // return count;
    }
}

