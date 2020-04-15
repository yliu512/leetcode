package test;

public class houseRobber {
	//dp[i] = max(dp[i-2] + num[i], dp[i-1])
	public int rob(int[] nums) {
		if(nums.length == 0) {
        	return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int a[] = new int[nums.length];
        a[0] = nums[0];
        a[1] = Integer.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++) {
        	a[i] = Integer.max(a[i-2]+nums[i], a[i-1]);
        }
        return a[nums.length-1];
    }
}
