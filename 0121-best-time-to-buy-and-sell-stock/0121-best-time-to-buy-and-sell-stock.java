class Solution {
    public int maxProfit(int[] prices) {
       int bestBuy = prices[0];
       int maxProfit = 0;
       for(int i=1;i<prices.length;i++){
        int currentPrice=prices[i]-bestBuy;
        if(currentPrice > maxProfit){
            maxProfit = currentPrice;
        }
        if(bestBuy > prices[i]){
            bestBuy = prices[i];
        }
       }
       return maxProfit;
    
    }
}