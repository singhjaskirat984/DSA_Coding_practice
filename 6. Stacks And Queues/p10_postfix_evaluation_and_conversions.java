import java.util.*;


public class p10_postfix_evaluation_and_conversions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        Stack<String> valueStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();
        Stack<String> prefixStack = new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);

            if(Character.isDigit(ch)){
                valueStack.push(ch + "");
                infixStack.push(ch + "");
                prefixStack.push(ch + "");
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                String v2Int = valueStack.pop();
                String v1Int = valueStack.pop();
                String v2Infix = infixStack.pop();
                String v1Infix = infixStack.pop();
                String v2Prefix = prefixStack.pop();
                String v1Prefix = prefixStack.pop();
                String valResult = operation(v1Int, v2Int, ch, "val");
                String infixResult = operation(v1Infix, v2Infix, ch, "infix");
                String prefixResult = operation(v1Prefix, v2Prefix, ch, "prefix");
                valueStack.push(valResult);
                infixStack.push(infixResult);
                prefixStack.push(prefixResult);
            }
        }

        System.out.println(valueStack.peek());
        System.out.println(infixStack.peek());
        System.out.println(prefixStack.peek());
    }

    public static String operation(String v1, String v2, char opt, String valInPre){
        if(valInPre == "val"){
            int v1Int = Integer.parseInt(v1);
            int v2Int = Integer.parseInt(v2);
            if(opt == '+'){
                return v1Int + v2Int + "";
            }else if(opt == '-'){
                return v1Int - v2Int + "";
            }else if(opt == '*'){
                return v1Int * v2Int + "";
            }else{
                return v1Int/v2Int + "";
            }
        }else if(valInPre == "infix"){
            return "(" + v1 + opt + v2 + ")" ;
        }else {
            return opt + v1 + v2;
        }
    }
}
