package test;

import java.util.Stack;
//利用stack先进后出的原则
public class palindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		ListNode a = head;
		Stack<Integer> s1 = new Stack<Integer>();
		while(a != null) {
			s1.push(a.val);
			a = a.next;
		}
		
		while(head !=null) {
			if(s1.peek() == head.val) {
				s1.pop();
				head = head.next;
			}else {
				return false;
			}
		}
		return true;
    }
}
