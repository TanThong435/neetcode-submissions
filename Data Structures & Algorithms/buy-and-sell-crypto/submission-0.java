class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int price : prices){
            if (minPrice > price){
                minPrice = price;
            } else {
                if (price - minPrice > maxProfit){
                    maxProfit = price - minPrice;
                }
            }


        }
        return maxProfit;
    }
}
