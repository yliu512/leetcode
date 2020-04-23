package test;

public class partitionList {
	public ListNode partition(ListNode head, int x) {
		ListNode before_head = new ListNode(0);
		ListNode after_head = new ListNode(0);
		ListNode before = before_head;
		ListNode after = after_head;
		while(head !=null) {// two list and merge
			if(head.val >= x) {
				after.next = head;
				after = after.next;
			}else {
				before.next = head;
				before = before.next;
			}
			head = head.next;
		}
        after.next = null;
		before.next = after_head.next;
		return before_head.next;
    }
}
