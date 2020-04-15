package test;

public class covertSorted {
	public TreeNode sortedArrayToBST(int[] nums) {
		return add(nums,0,nums.length-1);
    }
	public TreeNode add(int[] nums,int i,int j) {
		if(j<i) {
			return null;
		}
		int half = (j+i) /2;
		TreeNode root = new TreeNode(nums[half]);
		root.left = add(nums,i,half-1);
		root.right = add(nums,half+1,j);
		return root;
	}
}
