package test;

public class reverseInteger {
	public int reverse(int x) {
		long res = 0;
        while(x!=0) {
        	int end = x%10;
        	res = res*10+end;
        	if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) {
            	return 0;
            }
        	x /= 10;
        }
        return (int)res;
         
    }
}
