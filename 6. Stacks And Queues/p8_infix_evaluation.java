import java.util.*;

public class p8_infix_evaluation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators =  new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '('){
                operators.push(ch);
            }else if(Character.isDigit(ch)){
                operands.push(ch - '0');
            }else if(ch == ')'){
                while(operators.peek()!='('){
                    char opt = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int newOpd = operation(v1, v2, opt);
                    operands.push(newOpd);
                }

                operators.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                // ch is wanting higher priority operators to solve first
                while(operators.size()>0 && operators.peek()!='(' && precedence(ch) <= precedence(operators.peek())){
                    char opt = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int newOpd = operation(v1, v2, opt);
                    operands.push(newOpd);
                }

                // ch is pushing itself
                operators.push(ch);
            }
        }

        while(operators.size()!=0){
            char opt = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();
            int newOpd = operation(v1, v2, opt);
            operands.push(newOpd);
        }

        // ans
        System.out.println(operands.peek());        
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

    public static int operation(int v1, int v2, char operator){
        if(operator == '+'){
            return v1+v2;
        }else if(operator == '-'){
            return v1-v2;
        }else if(operator == '*'){
            return v1*v2;
        }else{
            return v1/v2;
        }
    }
}
