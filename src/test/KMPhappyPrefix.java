package test;

public class KMPhappyPrefix {
	public static String longestPrefix(String s) {
		int[] a = new int[s.length()];
		int i = 1;
		int j = 0;
		while(i<s.length()) {
			if(s.charAt(i) == s.charAt(j)) {
				a[i] = ++j;
				i++;
			}else if(j>0){
				j = a[j-1];
			}else{
				a[i] = 0;
				i++;
			}
		}
		return s.substring(0,a[s.length()-1]);
	}
}
