package test;

public class sortColor {
	public void sortColors(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		
        for(int i=0;i<=right;) {
        	int num = nums[i];
        	if(num == 2) {
        		int tmp = nums[i];
        		nums[i] = nums[right];
        		nums[right] = tmp;
        		right--;
        	}else if(num == 0) {
        		int tmp = nums[i];
        		nums[i] = nums[left];
        		nums[left] = tmp;
        		left++;
        		i++;
        	}else {
        		i++;
        	}
        }
    }
}
