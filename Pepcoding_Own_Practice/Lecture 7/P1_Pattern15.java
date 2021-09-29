import java.util.*;

public class P1_Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n/2;
        int nst = 1;
        int oval = 1;

        for(int i=1; i<=n; i++){

            int val = oval;

            //space
            for(int j=1; j<=nsp; j++){
                System.out.print("\t");
            }

            //star
            for(int j=1; j<=nst; j++){
                System.out.print(val + "\t");
                if(j <= nst / 2){
                    val++;
                }else{
                    val--;
                }
            }

            System.out.println();

            if(i<=n/2){
                oval++;
                nst += 2;
                nsp--;
            }else{
                oval--;
                nst -= 2;
                nsp++;
            }
        }
    }
}
