import java.util.*;

public class P3_Gcd_Lcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int temp1 = n1;
        int temp2 = n2;
        while(temp1%temp2 != 0){
            int rem = temp1%temp2;
            temp1 = temp2;
            temp2 = rem;
        }

        int GCD = temp2;
        int LCM = 0;

        LCM = (n1*n2)/GCD;

        System.out.println(GCD);
        System.out.println(LCM);
    }
}
