package dp;

public class BuyAnsSellStock {
    public static void main(String[] args) {
//        int prices[]= {7,1,5,3,6,4};
        int prices[]= {5,4,3,2,1};
        System.out.println(findMaxProfit(prices));
    }
    public static int findMaxProfit(int[]prices){
        if(prices==null || prices.length==0){
            return 0;
        }

        int dp[]= new int[prices.length];
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            dp[i]=Math.max(dp[i-1],prices[i]-min);
        }

        return dp[dp.length-1];
    }

    public static int maxProfit(int[] prices) {

        if (prices.length == 0) return 0;

        int[] profit = new int[prices.length];

        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }

            profit[i] = Math.max(profit[i - 1], prices[i] - min);

        }

        return profit[prices.length - 1];

    }
}
