package test;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class intersectionTwoArrays {
	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> a = new HashMap<Integer,Integer>();
        List<Integer> res = new ArrayList<Integer>();
        for(int num1: nums1) {
        	a.put(num1, a.getOrDefault(num1, 0)+1);
        }
        for(int num2:nums2) {
        	if(a.containsKey(num2)&& a.get(num2)>0) {
        		res.add(num2);
        		a.put(num2, a.get(num2)-1);
        	}
        }
        int[] x = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            x[i] = res.get(i);
        }
        return x;
    }
}
