package DSA_JAVA_Concepts.Linear_DS.Stacks;

import java.util.Stack;

public class Parentheses {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                st.push(')');
            }else if(s.charAt(i)=='{'){
                st.push('}');
            }else if(s.charAt(i)=='['){
                st.push(']');
            }else if(st.isEmpty() || st.pop()!=s.charAt(i)){
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Parentheses obj=new Parentheses();
        System.out.println(obj.isValid("()[]{}"));
        System.out.println(obj.isValid("()[]{"));
        System.out.println(obj.isValid("()[]{}()"));
        System.out.println(obj.isValid("()[]{}()[]{}"));
        }
}