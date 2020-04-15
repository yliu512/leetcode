package test;
//异或关系 00为0 11为0
public class singleNum {
	public int singleNumber(int[] nums) {
        int res = 0;
        for(int num: nums) {
        	res ^= num;
        }
        return res;
    }
}
