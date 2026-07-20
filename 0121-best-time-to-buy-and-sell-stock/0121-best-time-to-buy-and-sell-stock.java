class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int p:prices){
            if(minprice>p){
                minprice=p;
            }
            else if(p-minprice>maxprofit){
                maxprofit=p-minprice;
            }
        }
        return maxprofit;
    }
}