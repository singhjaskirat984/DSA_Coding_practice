import java.util.*;

public class P4_Count_Digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count=0;

        while(n>0){
            int rem = n%10;
            n=n/10;
            count++;
        }

        System.out.println(count);
    }
}