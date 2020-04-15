package test;

import java.util.Arrays;

public class MergeSorted {
	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int p = 0;
		int q = 0;
		int[] x = Arrays.copyOf(nums1, m+n);
        for(int i=0;i<m+n;i++) {
        	if(n==0){
                break;
            }
            if(m==0){
                nums1 = nums2.clone();
            }
        	if(x[p]>=nums2[q] || p==m) {
        		nums1[i] = nums2[q];
        		q++;
        	}else {
        		nums1[i] = x[p];
        		p++;
        	}
        }
        System.out.print(Arrays.toString(nums1));
    }
//	public static void main(String[] args)  
//    { 
//	   int[] n1= {};
//	   int m =0;
//	   int[] n2= {2,5,6};
//	   int n= 3;
//       merge(n1,m,n2,n);
//  
//    } 
}
