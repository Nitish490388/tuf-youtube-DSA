package String.Stack;

import java.util.Stack;

/**
 * validParenthesis
 * https://leetcode.com/problems/valid-parentheses/submissions/1425118840/
 * 
 * TC = SC = O(N)
 */
public class validParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> stc = new Stack<>();
        for(int i = 0; i< s.length(); i++) {
            
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{' ) {
                stc.push(s.charAt(i));
            }
            else {
                if(stc.empty()) return false;
                char ch = stc.peek();  
                stc.pop();

                if(ch=='(' && s.charAt(i)==')' ||
                ch=='[' && s.charAt(i)==']' ||
                ch=='{' && s.charAt(i)=='}') {

                } else return false;
            }
        }
        return stc.empty();
    }

    public static void main(String[] args) {
        
        System.out.println(isValid("{"));
    }
}