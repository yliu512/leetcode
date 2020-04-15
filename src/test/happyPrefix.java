package test;

public class happyPrefix {
	public static String longestPrefix(String s) {
		int slen = s.length();
		String happy = "";
        if(slen<2) {
        	return "";
        }
        StringBuilder prefix = new StringBuilder();
        StringBuilder suffix = new StringBuilder();
        for(int i=0; i<slen-1;i++) {
        	prefix.append(s.charAt(i));
        	suffix.insert(0, s.charAt(slen-1-i));
//        	System.out.println("prefix: "+prefix+" suffix: "+ suffix);
        	if(prefix.toString().equals(suffix.toString())) {
        		happy = prefix.toString();
//        		System.out.println("happy: "+happy);
        	}
        	
        }
        return happy;
    }
	public static void main(String[] args) {
	      String s = "leetcodeleet";
	      String convert = longestPrefix(s);
	      System.out.println(convert);
	}
}
