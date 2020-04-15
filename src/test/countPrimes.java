package test;
//判断一个数n是否为素数，就需要判断1到n-1之间的数能否被n整除，能够被整除说明不是素数，否则就是素数。
public class countPrimes {
	public int countPrimes2(int n) {
		   int count = 0;
		   for (int i = 1; i < n; i++) {
		      if (isPrime(i)) count++;
		   }
		   return count;
	}

	private boolean isPrime(int num) {
		   if (num <= 1) return false;
		   for (int i = 2; i * i <= num; i++) {
		      if (num % i == 0) return false;
		   }
		   return true;
	}
}
