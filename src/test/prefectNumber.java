package test;

public class prefectNumber {
	public boolean checkPerfectNumber(int num) {
        if(num<6 || num%2 !=0) {
        	return false;
        }
        int sum = 1;
        for(int i=2;i<=num/2;i++) {
        	if(num%i == 0) {
        		sum+=i;
        	}
        }
        return sum == num;
    }
}
