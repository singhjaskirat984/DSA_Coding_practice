import java.util.*;

// mine of reversal what i thougt it to be
// public class P6_Reverse_Of_A_Number {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int copy = n;
//         int power = 1;
//         int ans = 0;

//         //count power
//         while(copy>10){
//             copy = copy/10;
//             power = power*10;
//         }

//         //reversal
//         while(n>0){
//         int rem = n%10;
//         ans = ans + (power * rem);
//         power = power/10;
//         n = n/10;
//         }

//         System.out.print(ans);
//     }
// }

// public class P6_Reverse_Of_A_Number {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int copy = n;
//         int k = scn.nextInt();
//         int multiplier = 1;

//         //count the power
//             while(copy>10){
//                 copy = copy/10;
//                 multiplier = multiplier*10;
//             }

//         for(int i=1; i<=k; i++){

//             //extract rightmost and add it to the first place or leftmost
//             int rem = n%10;
//             int q = n/10;
//             rem = rem*multiplier;
//             q = q+rem;
            
//             copy = q;

//             n = q;
//         }

//         System.out.println(n);
//     }
// }



// as given on pepcoding website
public class P6_Reverse_Of_A_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n>0){
            int rem=n%10;
            System.out.println(rem);
            n=n/10;
        }
    }
}
