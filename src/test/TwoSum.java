package test;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
	    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	    for (int i = 0; i < nums.length; i++) {
	    	map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	    	int complement = target-nums[i];
	    	if(map.containsKey(complement)&&map.get(complement)!=i) {
	    		res[0] = i;
	    		res[1] = map.get(complement);
	    		break;
	    	}
	    }
	    return res;
	}
	
}
