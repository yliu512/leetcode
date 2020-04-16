package test;

public class productOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int product = 1;
		int[] res = new int[nums.length];
		int flag = -1;
		for(int i=0;i<nums.length;i++) {
        	if(nums[i] == 0 && flag<0) {// one 0, only i is product
        		flag = i;
        		continue;
        	}
        	if(nums[i] == 0 && flag>=0) {// two 0, all 0
        		return res;
        	}
        	product *=nums[i];
        }
		
        for(int i=0;i<nums.length;i++) {
        	if(flag != -1) {
    			if(i == flag) {// 2220222 i is in 0 position
    				res[i] = product;
    			}else {// i is in 2 position
    				res[i] = 0;
    			}
    		}else {// no zero
    			res[i] = product/nums[i];
    		}
        }
        return res;
    }
}
