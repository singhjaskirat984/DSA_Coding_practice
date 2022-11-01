import java.util.*;

public class p12_celebrity_problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        findCelebrity(arr);
    }

    public static void findCelebrity(int[][] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            st.push(i);
        }

        while(st.size()>1){
            int val1 = st.pop();
            int val2 = st.pop();
            // if val2 knows val1
            if(arr[val2][val1]==1){
                // val2 can never be celebrity val2 remain popped val1 pushed back
                st.push(val1);
            }else if(arr[val2][val1]==0){ //if val2 does not know val1
                // then val2 can be celebrity and val1 can never be celebrity
                st.push(val2);
            }
        }

        int potential = st.pop();
        boolean flag = true;
        for(int i=0; i<arr.length; i++){
            // not checking i==potential, i,potential example 2,2 cell
            if(i!=potential){
                // for potential to be celeb its col should ba all 1 and its row should be 0 
                // we use reverse condition here we check for reverses and if that happens we break
                // and print "nope"
                if(arr[i][potential]==0 || arr[potential][i]==1){
                    flag = false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println(potential);
        }else{
            System.out.println("none");
        }
    }
}
