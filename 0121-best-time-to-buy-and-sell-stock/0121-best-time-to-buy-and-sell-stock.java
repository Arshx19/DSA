class Solution {
    public int maxProfit(int[] prices) {
        int buy_day = Integer.MAX_VALUE;
        int maxProfit = 0;
        int m = prices.length;
        

        for(int i=0;i<m;i++){
            if(prices[i] < buy_day){
                buy_day = prices[i];
            }
            else{
                maxProfit = Math.max(maxProfit,prices[i] -buy_day); 
            }

        }
        return maxProfit;
    }
}