package test;
//如果左节点的左孩子 = 右节点的右孩子 对称
public class symmetricTree {
	public boolean isSymmetric(TreeNode root) {
        if(root == null) {
        	return true;
        }
        return isSymmetric(root.left,root.right);
    }
	public boolean isSymmetric(TreeNode left, TreeNode right) {
		if(left == null && right==null) {
			return true;
		}
		if(left == null) {
			return false;
		}
		if(right == null) {
			return false;
		}
		if(left.val != right.val) {
			return false;
		}
		return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
	}
}
