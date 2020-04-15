package test;

import java.util.HashMap;
import java.util.Map;

public class numOfBoomerangs {
	public int numberOfBoomerangs(int[][] points) {
		int ans=0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<points.length;i++) {
			for(int j=0; j<points.length;j++) {
				if(i==j) {
					continue;
				}
				int a = points[i][0]-points[j][0];
				int b = points[i][1]-points[j][1];
				double dis = Math.sqrt(Math.abs(a*a+b*b));
				map.put(a*a+b*b, map.getOrDefault(a*a+b*b, 0)+1);
			}
			for(int val:map.values()) {
				ans+=val*(val-1);// n*(n-1)种排列组合
			}
			map.clear();
		}
		return ans;
    }
}
