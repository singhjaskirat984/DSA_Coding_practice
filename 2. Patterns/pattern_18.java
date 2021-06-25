/*
Pattern 18

*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	

*/

import java.util.*;

public class pattern_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		 
		int nst = n;
		int nsp = 0;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= nsp; j++){
				System.out.print("\t");
			}
	
			for(int j = 1; j <= nst; j++){
				if(i > 1 && i <= n / 2 && j > 1 && j < nst){
					System.out.print("\t");
				} else {
					System.out.print("*\t");
				} 
			}
	
			if(i <= n / 2){
				nst -= 2;
				nsp++;
			} else {
				nst += 2;
				nsp--;
			}
	
			System.out.println();
		}
	}
}


// My approach 3/5 test cases failed

// public class pattern_18 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
// 		int stars = 3;
// 		int spaces = 2;
//         for(int i=1; i<=n; i++){
// 			if(i==1){
// 				for(int j=1; j<=n; j++){
// 					System.out.print("*\t");
// 				}
// 			}else if(i<=n/2+1 && i!=n){
// 				for(int j=1; j<=n; j++){
// 					if(i==j || i+j==n+1){
// 						System.out.print("*\t");
// 					}else{
// 						System.out.print("\t");
// 					}
// 				}
// 			}else{
// 				for(int j=1; j<=spaces; j++){
// 					System.out.print("\t");
// 				}

// 				for(int j=1; j<=stars; j++){
// 					System.out.print("*\t");
// 				}

// 				stars+=2;
// 				spaces--;
// 			}
// 			System.out.println();	
// 		}      
//     }
// }
