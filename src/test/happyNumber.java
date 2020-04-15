package test;

public class happyNumber {
	public static boolean isHappy(int n) {

		while(true) {
			char[] c=String.valueOf(n).toCharArray();
			int sum=0;
			System.out.println(c.length);
			for(int i=0;i<c.length;i++) {
				int a=Integer.parseInt(String.valueOf(c[i]));  
				sum +=a*a;
			}
			System.out.println(sum);
			if(sum == 1) {
				return true;
			}
			if(sum == 4) {
				return false;
			}
			n=sum;
		}

    }
	public static void main(String[] args)  {
		isHappy(19);
	}
}
