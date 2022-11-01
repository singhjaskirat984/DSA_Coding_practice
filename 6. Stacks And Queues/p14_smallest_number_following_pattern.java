import java.util.*;

public class p14_smallest_number_following_pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        smallestNumberFollowingPattern(str);
    }

    public static void smallestNumberFollowingPattern(String str){
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'd'){
                st.push(num);
                num++;
            }else if(ch == 'i'){
                st.push(num);
                num++;
                while(st.size()!=0){
                    int popped = st.pop();
                    System.out.print(popped);
                }
            }
        } 

        st.push(num); // for last number
        while (st.size() > 0) {
          System.out.print(st.pop());
        }
    }
}
