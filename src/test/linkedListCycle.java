package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
//此题的cycle是尾部最后一位node 往回连
//这里不能用hashmap 因为<listnode,int> 在进行判断时 
//int不唯一 在这个单向链表中 值不唯一 只是指针head不同 所以要用set来表示唯一的head node
public class linkedListCycle {
	public boolean hasCycle(ListNode head) {
        Set<ListNode> a = new HashSet<ListNode>();
        while(head != null) {
        	if(a.contains(head)) {
        		return true;
        	}else {
        		a.add(head.next);
        		head = head.next;
        	}
        }
        
        return false;
    }
/**	if (head == null) { 
        return false;
    }
    ListNode slow = head;
    ListNode fast = head;
    while (slow != null && fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            return true;
        }
    }
    return false;
 */
	//第二种解法 两个指针 一快 一慢，如果存在cycle，两指针必定相遇
}

