package test;

public class containerWithMostWater {
	public int maxArea(int[] height) {
        int len = height.length;
        if(len < 2) {
        	return 0;
        }
        int left = 0;
        int right = len-1;
        int maxArea = 0;
        while(left<right) {//贪心算法：从两边开始向中间缩小;每一步比较左右边界高度,高度小的那个向里走一步
        	int area = Math.min(height[left], height[right])*(right-left);
        	maxArea = Math.max(maxArea, area);
        	if(height[left]<height[right]) {
        		left++;
        	}else {
        		right--;
        	}
        }
        return maxArea;
    }
}
