import java.util.*;

public class P2_Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = (2*n)-3; //instead of n+2 use 2n-3
        
    
        for(int i=1; i<=n; i++){

            int val=1;

            //stars
            for(int j=1; j<=stars; j++){
                System.out.print(val + "\t");
                val++;
            }

            //space
            for(int j=1; j<=spaces; j++){
                System.out.print("\t");
            }

            if(i==n){
                stars--;
                val--;
            }

            //star
            for(int j=1; j<=stars; j++){
                val--;
                System.out.print(val + "\t");
            }

            System.out.println();

            stars++;
            spaces -= 2;
        }
    }
}
