import java.util.*;

public class P3_String_Compressions{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char c1 = s.charAt(0);
        char c2 = s.charAt(0);
        int count=0;
        System.out.print(c1 + "\t");
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==c1){
                count++;
            }
            if(ch != c1){
                System.out.print(ch + "\t");
                c1 = ch;
                count=0;
            }
        }

        System.out.println();
        System.out.print(c2 + "\t");

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==c2){
                count++;
            }else{
                System.out.print(ch);
                System.out.print(count + "\t");
                c2 = ch;
                count=0;
            }
        }
    }
}