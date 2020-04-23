package test;

public class searchRotatedSortedArray {
	public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right) {
        	int mid = (left+right)/2;
            System.out.println(mid);
        	if(nums[mid] == target) {
        		return mid;
        	}
        	if(nums[mid] < nums[right]) {//如果右半边是有序的
        		if(target <= nums[right] && target > nums[mid]) {//如果target在右半边里面
        			left = mid+1;//将左指针移到右半边
        		}else {
        			right = mid-1;
        		}
        	}else {
        		if(target < nums[mid] && target >= nums[left]) {
        			right = mid-1;
        		}else {
        			left = mid+1;
        		}
        	}
        }
        return -1;
    }
}
