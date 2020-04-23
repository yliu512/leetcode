package test;

public class lengthOfLastWord {
	public int lengthOfLastWord(String s) {
		int right = s.length()-1;
		int left = 0;
		int res=0;
		while(right>=0 && s.charAt(right)==' ') {
			right--;
		}
		while(left<=right && s.charAt(left)==' ') {
			left++;
		}
		for(int i=left;i<=right;i++) {
			if(s.charAt(i) == ' ') {
				res = 0;
			}else {
				res++;
			}
		}
		return res;
    }
}
