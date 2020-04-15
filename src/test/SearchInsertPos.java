package test;

import java.util.Arrays;

public class SearchInsertPos {
	public static int searchInsert(int[] nums, int target,int left, int right) {
		 System.out.print("fengqiu");
		if(left>right) {
			return left;
		}
		if (left == right) {
            return left;
        }
		int half = (left+right)/2;
		if(target>nums[half]) {
			return searchInsert(nums,target,half+1,right);
		}else if(target<nums[half]) {
			return searchInsert(nums,target,left,half-1);
			
		}else {
			return half;
		}
		
	}
	public static void main(String[] args) {
	      int[] nums = {2,7,8,9,10};
	      System.out.print(searchInsert(nums,5,0,nums.length-1));
	}
//	public int searchInsert(int[] nums, int target) {
//		if(target>nums[nums.length-1]){
//            return nums.length;
//        }
//        if(target==nums[nums.length-1]){
//            return nums.length-1;
//        }
//        if(target<=nums[0]){
//            return 0;
//        }
//    }
}
