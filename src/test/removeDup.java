package test;

public class removeDup {
	public int removeDuplicates(int[] nums) {
		int len = nums.length;
		int j = 0;
        for(int i=0;i<len-1;i++){
            if(nums[i] !=nums[i+1]){// find the last duplicate element
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[len-1];
        return j;
    }
}
