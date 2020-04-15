package test;

public class countAndSay {
	public String countAndSay(int n) {
        
        if(n==1) {
        	return "1";
        }
        String str = countAndSay(n-1);
        int count = 1;
        String s = null;
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i) == str.charAt(i+1)) {
        		count++;
        	}else {
        		s = s+String.valueOf(count)+str.charAt(i);
        		count = 1;
        	}
        }
        return s;

        
    }
}
