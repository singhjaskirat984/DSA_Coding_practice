/*
Gcd And Lcm
*/

// naive approach
// import java.util.*;

// public class gcd_and_lcm {

//     public static int gcd(int n1, int n2) {
//         int ans = 1;
//         // instead of i<=n1 && i<=n2 we can find largest of n1 and n2 first and then
//         // implement this loop till
//         // largest(n1,n2)
//         for (int i = 1; i <= n1 && i <= n2; i++) {
//             if (n1 % i == 0 && n2 % i == 0) {
//                 ans = i;
//             }
//         }
//         return ans;
//     }

//     public static int lcm(int n1, int n2) {
//         int ans = 1;
//         ans = (n1 > n2) ? n1 : n2;
//         while(true){
//             if(ans%n1==0 && ans%n2==0){
//                 return(ans);
//             }
//             ++ans;
//         }
//     }

//     public static void main(String[] args) {
//         int n1 = 81, n2 = 153;
//         int ans = 1;
//         int ans2 = 1;
//         ans = gcd(n1, n2);
//         System.out.println(ans);
//         ans2 = lcm(n1, n2);
//         System.out.println(ans2);
//     }

// }

// fast approach using recursion or euclidean algortithm
import java.util.*;

public class gcd_and_lcm {

    public static int gcd(int n1, int n2) {
        int rem = n1 % n2;
        if(rem == 0){
            System.out.println(n2);
            return n2;
        }
        gcd(n2,rem);
        return n2;
    }

    public static void lcm(int n1, int n2,int hcf) {
        int ans = (n1*n2)/hcf;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n1 = 81, n2 = 153;
        int hcf = gcd(n1, n2);
        lcm(n1,n2,hcf);
    }

}
