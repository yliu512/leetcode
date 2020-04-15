package test;

public class BestTimeStock {
	public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i=0;i<prices.length;i++) {
        	int profix = prices[i+1]-prices[i];
        	sum += profix>0?profix:0;
        }
        return sum;
    }
}
