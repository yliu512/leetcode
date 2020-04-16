package test;

import java.util.ArrayList;
import java.util.List;

public class rightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		rightSide(root,res,0);
        return res;
    }
	public void rightSide(TreeNode root,List<Integer> res,int level) {
		if(root == null) return;
		if(level == res.size()) {
			res.add(root.val);
		}
		rightSide(root.right,res,level+1);
		rightSide(root.left,res,level+1);
		
	}
}
//从右边看，并不是指右节点--也就是每层最右边的节点，则考虑层次遍历只取最右
//[1,2] result [1,2]
