package test;

import java.util.ArrayList;
import java.util.List;

public class permutations {
	public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums.length==0||nums==null) return null;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        buildAns(nums,temp,ans);
        
        for(int i=0;i<ans.size();i++)
  	      System.out.println(ans.get(i));
        
        return ans;
    }
    
    public void buildAns(int nums[],ArrayList<Integer> temp, ArrayList<List<Integer>> ans){
    	if(temp.size()==nums.length){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                buildAns(nums,temp,ans);
                temp.remove(temp.size()-1);
            }
        }
    }
//    public static void main(String[] args) {
//	      int[] nums = {1,2,3};
//	      permute(nums);
//	      
//	}

}
