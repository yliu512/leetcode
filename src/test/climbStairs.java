package test;

public class climbStairs {
	
	public int climbStairs(int n) {
        if(n == 0) {
        	return 0;
        }
        if(n == 1) {
        	return 1;
        }else if(n == 2) {
        	return 2;
        	
        }else{
        	return climbStairs(n-1)+climbStairs(n-2);
        }
    }
	//递推公式：f(n) = f(n-1) + f(n-2)
	public int climbStairs2(int n) {
		if(n == 1) {
        	return 1;
        }
        int a[] = new int[n];
        a[0] = 1;
        a[1] = 2;
        for(int i = 2; i<n;i++) {
        	a[i] = a[i-1]+a[i-2];
        }
        return a[n-1];
    }
}
