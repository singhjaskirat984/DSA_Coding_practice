import java.util.*;

public class p11_prefix_evaluation_and_conversions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        Stack<String> valStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();
        Stack<String> postfixStack = new Stack<>();

        for(int i=exp.length()-1; i>=0; i--){
            char ch = exp.charAt(i);

            if(Character.isDigit(ch)){
                valStack.push(ch + "");
                infixStack.push(ch + "");
                postfixStack.push(ch + "");
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                String v1Val = valStack.pop();
                String v2Val = valStack.pop();
                String v1Infix = infixStack.pop();
                String v2Infix = infixStack.pop();
                String v1Postfix = postfixStack.pop();
                String v2Postfix = postfixStack.pop();
                
                String valResult = operation(v1Val, v2Val, ch, "val");
                String infixResult = operation(v1Infix, v2Infix, ch, "infix");
                String postfixResult = operation(v1Postfix, v2Postfix, ch, "postfix");

                valStack.push(valResult);
                infixStack.push(infixResult);
                postfixStack.push(postfixResult);
            }
        }

        System.out.println(valStack.peek());
        System.out.println(infixStack.peek());
        System.out.println(postfixStack.peek());
    }

    public static String operation(String v1, String v2, char opt, String valInPost){
        if(valInPost == "val"){
            int v1Int = Integer.parseInt(v1);
            int v2Int = Integer.parseInt(v2);
            if(opt == '+'){
                return v1Int + v2Int + "";
            }else if(opt == '-'){
                return v1Int - v2Int + "";
            }else if(opt == '*'){
                return v1Int * v2Int + "";
            }else{
                return v1Int / v2Int + "";
            }
        }else if(valInPost == "infix"){
            return "(" + v1 + opt + v2 + ")";
        }else{
            return v1 + v2 + opt;
        }
    }
}
