import java.util.*;


public class p9_infix_conversions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        Stack<String> prefixOpd = new Stack<>();
        Stack<String> postfixOpd = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch == '('){
                operators.push(ch);
            }else if(Character.isAlphabetic(ch)){
                prefixOpd.push(ch + "");
                postfixOpd.push(ch + "");
            }else if(ch == ')'){
                // pop
                while(operators.peek()!='('){
                    char opt = operators.pop();
                    String v2Pre = prefixOpd.pop();
                    String v1Pre = prefixOpd.pop();
                    String v2Post = postfixOpd.pop();
                    String v1Post = postfixOpd.pop();

                    String resultPre = operation(v1Pre, v2Pre, opt, "pre");
                    String resultPost = operation(v1Post, v2Post, opt, "post");

                    prefixOpd.push(resultPre);
                    postfixOpd.push(resultPost);
                }

                operators.pop();
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(operators.size()>0 && operators.peek()!='(' && precedence(ch)<=precedence(operators.peek())){
                    char opt = operators.pop();
                    String v2Pre = prefixOpd.pop();
                    String v1Pre = prefixOpd.pop();
                    String v2Post = postfixOpd.pop();
                    String v1Post = postfixOpd.pop();

                    String resultPre = operation(v1Pre, v2Pre, opt, "pre");
                    String resultPost = operation(v1Post, v2Post, opt, "post");

                    prefixOpd.push(resultPre);
                    postfixOpd.push(resultPost);
                }

                operators.push(ch);
            }
        }

        while(operators.size()!=0){
            char opt = operators.pop();
            String v2Pre = prefixOpd.pop();
            String v1Pre = prefixOpd.pop();
            String v2Post = postfixOpd.pop();
            String v1Post = postfixOpd.pop();
            String resultPre = operation(v1Pre, v2Pre, opt, "pre");
            String resultPost = operation(v1Post, v2Post, opt, "post");

            prefixOpd.push(resultPre);
            postfixOpd.push(resultPost);
        }

        // ans
        System.out.println(prefixOpd.peek());
        System.out.println(postfixOpd.peek());
    }

    public static int precedence(char operator){
        if(operator == '+'){
            return 1;
        }else if(operator == '-'){
            return 1;
        }else if(operator == '*'){
            return 2;
        }else{
            return 2;
        }
    }

    public static String operation(String v1, String v2, char operator, String preOrPost){
        if(preOrPost == "pre"){
            // System.out.println(operator + v1 + v2);
            return operator + v1 + v2;
        }else{
            // System.out.println(operator + v1 + v2);
            return v1 + v2 + operator;
        }
    } 


}
