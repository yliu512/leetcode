package test;

import java.util.HashMap;

public class validAnagram {
	public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if(slen != t.length()) {
        	return false;
        }
        HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
        for(int i=0;i<slen;i++) {
        	int key = (int) s.charAt(i);
        	a.put(key, a.getOrDefault(key, 0)+1);
        }
        for(int i=0;i<tlen;i++) {
        	int key = (int) t.charAt(i);
        	if(a.get(key) == null || a.get(key)==0) {
        		return false;
        	}else {
        		a.put(key, a.get(key)-1);
        	}
        }
        return true;
    }
}
