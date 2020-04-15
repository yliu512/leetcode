package test;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// root要大于左侧所有节点 小于右侧所有节点

public class validateBinaryST {
	public boolean isValidBST(TreeNode root){
		return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
       
    }
	public boolean isValidBST(TreeNode root,long min,long max) {
		if(root == null) {
        	return true;
        }
		if(root.val>=max || root.val<=min) {
			return false;
		}
		return isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max);
	}
}
//binary tree 建议使用中序遍历---先左子 根 右子 随后list的规律一定是 a[i]<a[i+1]
/**
    vector<int> a1;
    bool isValidBST(TreeNode* root) {
        if(root==NULL)
            return true;
        ss(root);
        int len=a1.size();
        for (int i=0;i<len-1;i++)
            if(a1[i]>=a1[i+1])
                return false;
        return true;
    }
    
    void ss(TreeNode * a ){
        if(a==NULL)
            return;
        ss(a->left);
        a1.push_back(a->val);
        ss(a->right);
        
    }
 */