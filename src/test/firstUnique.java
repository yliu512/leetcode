package test;

import java.util.HashMap;

public class firstUnique {
	public int firstUniqChar(String s) {
		int len = s.length();
		HashMap<Integer, Integer> a = new HashMap<Integer,Integer>();
        for(int i=0;i<len;i++) {
        	int key = (int) s.charAt(i);
        	a.put(key, a.getOrDefault(key, 0)+1);
        }
        for(int i=0;i<len;i++) {
        	int key = (int) s.charAt(i);
        	if(a.get(key)==1) {
        		return i;
        	}
        }
        return -1;
    }
}
