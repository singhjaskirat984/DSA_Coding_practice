import java.util.*;

// public class P5_Print_Digits_Of_Number {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int copy = n;
//         int power=1;
//         int reversed=0;
//         // var max = a>b ? (a>c ? a:c) : (b>c ? b:c);

//         // //count the digits of the number
//         // while(copy>0){
//         //     count++;
//         //     copy = copy/10;
//         // }

//         // //count the power
//         // for(int i=0;i<count;i++){
//         //     power = power*10;
//         // }

//         //combine the above two to make
//         while(copy>10){
//             copy=copy/10;
//             power = power*10;
//         }

//         //reversed number
//         while(n>0){
//             int rem = n%10;
//             reversed = reversed + (power*rem);
//             power=power/10;
//             n=n/10;
//         }

//         System.out.println("reversed number" + reversed);

//         //print the digits
//         while(reversed>0){
//             int rem = reversed%10;
//             System.out.println(rem);
//             reversed = reversed/10;
//         }
//     }
// }


public class P5_Print_Digits_Of_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int copy = n;
        int noOfZeros=1;

        //count power
        while(copy>10){
            copy=copy/10;
            noOfZeros = noOfZeros*10;
        }

        while(noOfZeros>=1){
            int q = n/noOfZeros;
            n = n%noOfZeros;
            System.out.println(q);
            noOfZeros = noOfZeros/10;
        }
    }
}