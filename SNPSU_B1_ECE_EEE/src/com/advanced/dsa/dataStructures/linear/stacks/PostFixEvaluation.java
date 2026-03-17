package com.advanced.dsa.dataStructures.linear.stacks;
import java.util.Stack;
public class PostFixEvaluation {
    static int evaluate(String exp){
        Stack<Integer> stack = new Stack<>();
        for (char c : exp.toCharArray()){
            if (Character.isDigit(c)){
                stack.push(c - '0'); // Store the integer value
            }else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c){
                    case '+' -> stack.push(a+b);
                    case '-' -> stack.push(a-b);
                    case '*' -> stack.push(a*b);
                    case '/' -> stack.push(a/b);
                }
            }
        }
        return stack.pop(); // The ans is the top of the stack
    }
    public static void main(String[] args) {
        String exp1 = "23*54*+9-";
        System.out.println(evaluate(exp1));
        String exp2 = "45*23*+";
        // 23*6* => 6 6 * 36
        System.out.println(evaluate(exp2));
        System.out.println(evaluate("23*6*"));
    }
}
