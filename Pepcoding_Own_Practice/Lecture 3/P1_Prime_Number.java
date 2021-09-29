import java.util.*;

public class P1_Prime_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        

        for(int j=1; j<=t; j++){

            int n = scn.nextInt();
            boolean isPrime = true;

            for(int i=2; i*i<=n; i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
    
            if(isPrime == true){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }

        }
    }
}
