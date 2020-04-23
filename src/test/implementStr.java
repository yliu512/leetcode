package test;

public class implementStr {
	public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if(nlen>hlen) {
        	return -1;
        }
        if(hlen==nlen && hlen == 0){
            return 0;
        }
        for(int i=0;i<hlen-nlen+1;i++) {
        	if(needle.equalsIgnoreCase(haystack.substring(i, i+nlen))) {
        		return i;
        	}
        }
        return -1;
    }
}
