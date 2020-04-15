package test;

import java.util.HashMap;

public class containDup {
	public boolean containsDuplicate(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int j=0;
		if(nums == null || nums.length <= 1) {
			return false;
		}
        for(int i=0;i<nums.length;i++) {
        	if(map.put(nums[i], i) != null) {
        		//如果key在map中已经存在，则返回此key所对应的value，反之如果key不存在，返回null
        		return true;
        	}
        }
        return false;
    }
}
