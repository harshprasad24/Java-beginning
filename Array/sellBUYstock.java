public class sellBUYstock {
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }
    public static int maxProfit(int[] prices) {
        int profit =0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                profit=Math.max(profit, prices[i]-buyPrice);
            }else{
                buyPrice=prices[i];
            }
        }
        return profit;
    }
}
