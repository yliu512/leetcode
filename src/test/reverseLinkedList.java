package test;

public class reverseLinkedList {
	public ListNode reverseList(ListNode head) {
        return reverse(head);
    }
	public ListNode reverse(ListNode head) {
		if(head == null || head.next == null  ) {
			return head;
		}
		ListNode second = head.next;
		ListNode last = reverse(second);
		head.next.next = head;
		head.next = null;
		return last;
		
	}
/**	1-2-3-4-5-null
	首先递归到5，返回后 last指向5，此时head指向4，
	head.next.next = head; 也就是 5指向4
	head.next = null; 也就是4指向空
	返回这个指向5的last
	
	第二层递归：
	head指向3，head.next.next = head; 也就是 4指向3
	head.next = null; 也就是3指向空
	返回这个指向5的last
*/	
}
