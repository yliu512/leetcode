package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Graph {
	
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> ans = new ArrayList<>();
		if(graph == null || graph.length==0) {
			return ans;
		}
		List<Integer> item = new ArrayList<Integer>();
		item.add(0);
		dfs(graph,0,graph.length-1,item,ans);
		return ans;
    }
	private void dfs(int [][] graph, int cur, int end, List<Integer> item, List<List<Integer>> ans) {
		if(cur == end) {
			ans.add(new ArrayList<Integer>(item));
			return;
		}
		for(int i:graph[cur]) {
			item.add(i);
			dfs(graph,i,end,item,ans);
			item.remove(item.size()-1);
		}
//		char b[]={'a','b','c','d'};
//		  for(char ch : b)
//		  {
//		   System.out.println(ch);//打印出数组b中的元素
//		  }

	}
	public static void main(String[] args)  
    { 
       
  
    } 
}
