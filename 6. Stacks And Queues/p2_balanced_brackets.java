import java.util.*;

public class p2_balanced_brackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')'){
                boolean bl = handleClosedBrackets(st, '(');
                if(bl == false){
                    System.out.println(bl);
                    return;
                }
            }else if(ch == '}'){
                boolean bl = handleClosedBrackets(st, '{');
                if(bl == false){
                    System.out.println(bl);
                    return;
                }
            }else if(ch == ']'){
                boolean bl = handleClosedBrackets(st, '[');
                if(bl == false){
                    System.out.println(bl);
                    return;
                }
            }
        }  
        
        if(st.size()!=0){ // for checking extra opening brackets
            System.out.println(false);
            return;
        }else{ // if everything is balanced print true
            System.out.println(true);
            return;
        }
    }

    public static boolean handleClosedBrackets(Stack<Character> st, char corresopch){
        // extra closing brackets
        if(st.size()==0){
            return false;
        }else if(st.peek()!=corresopch){ // opening and closing bracket mismatch
            return false;
        }else{ // opening and closing bracket match
            st.pop();
            return true;
        }
    }
}
