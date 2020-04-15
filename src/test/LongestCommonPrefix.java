package test;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
		StringBuilder c = new StringBuilder();
		int strsLen = strs.length;
        if(strs.length==0){
            return "";
        }
		int minLength = strs[0].length();
		for(int n = 0; n<strs.length;n++) {
			if(strs[n].length() <= minLength) {
				minLength = strs[n].length();
			}
		}
		for(int i=0; i<minLength;i++) {
			char start  =strs[0].charAt(i);
			for(int j=1; j<strsLen;j++) {
				
				if(start != strs[j].charAt(i)) {
					return c.toString();
				}
			}
			c.append(start);
		}
		return c.toString();
	
	
	}
}
