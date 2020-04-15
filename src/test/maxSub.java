package test;

public class maxSub {
	public int maxSubArray(int[] nums) {
		int sum = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length;i++) {
        	// sum = Math.max(sum+nums[i], nums[i]);
            if(sum>0){
                sum+=nums[i];
            }else{
                sum = nums[i];
            }
        	max = Math.max(max, sum);
            System.out.println("sum:"+sum+" max "+max);
        }
        
        return max;
    }
}
