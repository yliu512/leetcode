package test;

public class missingNum {
	public int missingNumber(int[] nums) {
		int max = 0;
		int realSum = 0;
        int exist0 = -1;
		for(int i=0;i<nums.length;i++) {
			max = max<nums[i]?nums[i]:max;
			realSum += nums[i];
            if(nums[i] == 0){
                exist0 = 1;
            }
		}
        int sum = max*(max+1)/2;//前n位想加的和
        System.out.println(sum+" "+realSum);
        
        if(exist0 >0 && sum-realSum ==0){// if exist 0, should return max+1
            return max+1;
        }
        return sum-realSum;
    }
}
