package test;

public class mergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.val<=l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
/**	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		if(l1 == null) {
			return l2;
		}
		if(l2 == null) {
			return l1;
		}
		ListNode fakehead = new ListNode(1);
		ListNode res = fakehead;
		while(l1!=null && l2!=null) {
			if(l1.val <= l2.val) {
				res.next = l1;
                res = res.next;
				l1 = l1.next;
			}else {
				res.next = l2;
                res = res.next;
				l2 = l2.next;
			}
		}
		if(l1 !=null) {
			res.next = l1;
		}
		if(l2 !=null) {
			res.next = l2;
		}
		return fakehead.next;
	}
**/
}
