package codingproblems.stack;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str="({[]})";
        System.out.println(isBalacned(str));
    }
    public static boolean isBalacned(String str){
        Stack<Character> stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()) return false;

                char top=stack.pop();
                if((ch==')' && top!='(') || (ch==']' && top!='[' || ch=='{' && ch!='}')){
                    return false;
                }
            }
        }
        return true;
    }
}
