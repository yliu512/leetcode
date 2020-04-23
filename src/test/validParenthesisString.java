package test;

import java.util.ArrayDeque;
import java.util.Stack;

public class validParenthesisString {
	public boolean checkValidString(String s) {
		int low = 0;
        int high = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                low++;
                high++;
            } else if (s.charAt(i) == ')') {
                if (low > 0) {
                    low--;
                }
                high--;
            } else {
                if (low > 0) {
                    low--;
                }
                high++;
            }
            if (high < 0) {
                return false;
            }
        }
        return low == 0;
        
    }

/** high is tracking maximum number of open braces possible '('.
if it encounters a *, it considers it as '('
low is tracking minimum number of open braces.
If it encounters a *, it considers it as ')'
In the end, if high is negative, that means there were too many ')'
If low < 0, it means there are more ')' than '(', which is invalid
**/
	public boolean checkValidString2(String s) {
	    Stack<Integer> stack = new Stack<>();
	     ArrayDeque<Integer> wild = new ArrayDeque<>();
	     for(int i = 0; i < s.length(); i++) {
	         if(s.charAt(i) == '(') {
	             stack.push(i);
	         }
	         else if(s.charAt(i) == ')') {
	             if(stack.size() > 0) {
	                 stack.pop();
	             }
	             else if(wild.size() > 0) {
	                 wild.pollFirst();
	             }
	             else {
	                 return false;
	             }
	         }
	         else {
	             wild.addLast(i);
	         }
	     }
	     while(stack.size() > 0) {
	         if(wild.size() == 0 || wild.pollLast() < stack.pop()) {
	             return false;
	         }
	     }
	     return true;
	     
	 }
}