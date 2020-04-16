package test;

import java.util.HashMap;

public class ransomNote {// if ransom is substring of magazine 
	public boolean canConstruct(String ransomNote, String magazine) {
        int rlen = ransomNote.length();
        int mlen = magazine.length();
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for(int i=0;i<mlen;i++) {
        	char key = magazine.charAt(i);
        	count.put(key, count.getOrDefault(key, 0)+1);
        }
        for(int i=0;i<rlen;i++) {
        	char key = ransomNote.charAt(i);
        	if(count.get(key) == null || count.get(key)<1) {// if ramsom is not in magazine or count<1
        		return false;
        	}else{
        		count.put(key, count.get(key)-1);
        	}
        }
        return true;
        		
    }
}
