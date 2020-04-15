package test;
import java.util.*;

public class removeN {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { 
			val = x; 
		}
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode a = head;
		ListNode b = head;
		for(int i=0; i<n;++i) {// 这里++i和i++是一样的 但是++i性能好
			a = a.next;
		}
		if(a == null) {
			return head.next;
		}
		while(a.next != null) {
			b = b.next;
			a = a.next;
		}
		b.next = b.next.next;
		return head;
    }
}
