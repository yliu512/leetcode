package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {
	   //存储数组的所有排列
    List<int[]> list = new ArrayList<int[]>();
    public Solution(int[] nums) {
        //首先求所有排列
        permutations(nums,list,0);
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return list.get(0);
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int index = (int)(Math.random() * list.size());
        return list.get(index);
    }
    //求数组的所有排列
    public void permutations(int[] array,List<int[]> list,int start){
        if(array == null){
            return;
        }
        if(start == array.length){
            int[] temp = new int[array.length];
            System.arraycopy(array,0,temp,0,array.length);
            list.add(temp);
        }
        for(int i = start; i < array.length; ++i){
            swap(array,i,start);
            permutations(array,list,start+1);
            swap(array,i,start);
        }
    }
    //交换元素
    public void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
}
