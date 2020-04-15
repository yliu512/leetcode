package test;

public class test {
	public static String convert(String s, int nRows) {
		if(s.length()==0 || nRows<1 || s == null) {
			return "empty";
		}
		if(nRows == 1) {
			return s; 
		}
		StringBuilder res = new StringBuilder();
		int d = 2*nRows-2;
		for(int i=0; i<nRows; i++) {
			for(int j=i;j<s.length();j+=d) {
				res.append(s.charAt(j));
				int pos = j+d-2*i;
				if(pos<s.length() && i!=0 && i !=nRows-1){
					res.append(s.charAt(pos));
				}
			}
		}
		return res.toString();
	}
	public static void main(String[] args) {
	      String s = "abcdefghijklmn";
	      int nRows = 5;
	      String convert = convert(s,nRows);
	      System.out.println(convert);
	}
}
