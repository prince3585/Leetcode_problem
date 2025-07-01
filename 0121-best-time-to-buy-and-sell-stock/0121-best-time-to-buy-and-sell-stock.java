class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit=0;
       int buy_price=prices[0];
       for(int i=0;i<prices.length;i++){
        int currentProfit=prices[i]-buy_price;
        if(currentProfit>maxProfit){
            maxProfit=currentProfit;
        }
        if(prices[i]<buy_price){
            buy_price=prices[i];
        }
       }
       return maxProfit; 
    }
}