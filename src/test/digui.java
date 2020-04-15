package test;

public class digui {
	public static int my_pow(int n, int k) {
		System.out.println("aaa  "+k);
		if(k==0) {
			return k;
		}
//		System.out.println("bbb  "+ k);
	    int x = my_pow(n,k-1);
	    System.out.println("hhh"+x);
	        
	    System.out.println("bbb  "+ k);
	    return x;
	}
	public static void main(String[] args) {
		int ret = my_pow(5,4);
	    System.out.println(ret);
//	    return 0;
	}
}
