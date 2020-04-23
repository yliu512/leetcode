package test;

public class addBinary {
	public String addBinary(String a, String b) {
		int m = a.length()-1;
        int n = b.length()-1;
        int len = Math.max(m, n);
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<=len; i++) {
            int sum = carry;
            int num = 0;
            if (m >= 0) {
                num = a.charAt(m)-'0';// char 转 int 减去0. int 转 char 加上0
                m--;
            }
            int num2 = 0;
            if (n >= 0) {
                num2 = b.charAt(n)-'0';
                n--;
            }
            sum += num + num2;
            sb.insert(0, sum%2+"");
            carry = sum/2;
        }
        if (carry != 0) {
            sb.insert(0, carry+"");
        }
        return sb.toString();
        
    }
}
