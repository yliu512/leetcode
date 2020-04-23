package test;

public class convertBinaryNumber {
	 public int getDecimalValue(ListNode head) {
		 String s = "";
		 int sum = 0;
	     while(head!=null) {
	    	 s = head.val+s;
	    	 head = head.next;
	     }
	     System.out.println(s);
	     for(int i=0; i<s.length();i++) {
	    	 int n = s.charAt(i)-'0';
	    	 sum+=n*Math.pow(2, i);
	     }
	     return sum;
	 }
}
