import java.util.*;

public class P6_Rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int copy = n;
        int k = scn.nextInt();
        int multiplier = 1;

        //count the power
            while(copy>10){
                copy = copy/10;
                multiplier = multiplier*10;
            }

        for(int i=1; i<=k; i++){

            //extract rightmost and add it to the first place or leftmost
            int rem = n%10;
            int q = n/10;
            rem = rem*multiplier;
            q = q+rem;
            
            copy = q;

            n = q;
        }

        System.out.println(n);

    }
}
