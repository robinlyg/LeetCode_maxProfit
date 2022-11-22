class Solution {
    static public int maxProfit(int[] prices) {


        int maxProfit = 0, profit=0, minBuy=Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++){
            minBuy = Math.min(minBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] arr = {2,4,1};
        System.out.println(maxProfit(arr));
    }
}
