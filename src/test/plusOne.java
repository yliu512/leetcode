package test;

public class plusOne {
	public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(digits[len-1]<9) {
        	digits[len-1] += 1;
        	return digits;
        }else {
        	digits[len-1] = 0;
        }     
        for(int i=len-2;i>=0;i--) {
        	if(digits[i] == 9) {
        		digits[i] = 0;
        	}else {
        		digits[i] += 1;
        		break;
        	}
        }
        if(digits[0]==0) {
        	int[] d = new int[len+1];
        	d[0] = 1;
        	for(int i=0;i<len;i++) {
            	d[i+1] = digits[i];
            }
        	return d;
        }
        return digits;
    }
}
