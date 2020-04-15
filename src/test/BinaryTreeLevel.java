package test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevel {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		if(root == null) {
			return ans;
		}
		order(root,0,ans);
		return ans;
    }
	public void order(TreeNode root,int i,List<List<Integer>> ans){
		if(root == null) {
			return;
		}
		if(ans.size()<=i) {//从根节点开始，先递归获取根节点左子节点及其子节点的节点值，
			List<Integer> node = new ArrayList<Integer>();
	        node.add(root.val);
	        ans.add(node);   
		}else {//然后再递归获取根节点右子节点及其子节点的节点值 此时ans已经添加了左子节点所有的值，回到i=1 right，所以size一定大于i。
			List<Integer> node = (List<Integer>)ans.get(i);
	        node.add(root.val);
		}
		i++;
		order(root.left,i,ans);
		order(root.right,i,ans);
		
	}
}
