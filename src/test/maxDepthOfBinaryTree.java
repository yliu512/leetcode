package test;



public class maxDepthOfBinaryTree {
	int max=0;
	public int maxDepth(TreeNode root) {
        int i=0;
        if(root == null){
            return 0;
        }
        dfs(root,root.left,root.right,i);
        return max+1;
        
    }
	public void dfs(TreeNode cur, TreeNode left, TreeNode right, int i) {
		if(cur == null) {
			return;
		}
		if(cur.left !=null) {
            // System.out.println("left");
			i++;
			dfs(cur.left,cur.left.left,cur.left.right,i);
            // System.out.println(i);
			if(i>max) {
				max = i;
			}
			i--;
		}
		if(cur.right !=null) {
            // System.out.println("right");
			i++;
			dfs(cur.right,cur.right.left,cur.right.right,i);
            // System.out.println(i);
			if(i>max) {
				max = i;
			}
			i--;
		}
	}
}
