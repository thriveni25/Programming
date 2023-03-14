package leetcode.testyantra.com;

class Solution3 {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i =0 ; i<prices.length ; i++){
            if(buy< prices[i]){
            	System.out.println(buy);
            	System.out.println(prices[i]);
            	
                profit = Math.max(prices[i] - buy, profit );
                System.out.println("p"+profit);
            	
            }else{
                buy = prices[i];
            }
        }

        return profit;
    } 
    public static void main(String[] args) {
		int [] prices= {30,24,5,9,50,8};
		
		System.out.println(maxProfit(prices));
		
	}
}