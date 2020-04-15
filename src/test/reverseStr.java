package test;

public class reverseStr {
	public void reverseString(char[] s) {
        re(s,0,s.length-1);
    }
	public void re(char[] s,int start, int end) {
		if(start>end) {
			return;
		}
		char tmp = s[start];
		s[start++] = s[end];
		s[end--] = tmp;
		re(s,start,end);
	}
}
