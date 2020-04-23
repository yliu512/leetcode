package test;

public class middleOfTheLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode a = head;
		int len = 0;
		while(a!=null) {
			a = a.next;
			len++;
		}
		
		len = len/2;
		for(int i=0;i<len;i++) {
			head = head.next;
		}
		return head;
    }
}
