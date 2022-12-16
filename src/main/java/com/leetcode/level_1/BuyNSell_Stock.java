package com.leetcode.level_1;

public class BuyNSell_Stock {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int min = prices[0];
        int profit=0;
        for (int b = 1; b < prices.length; b++) {
            if(prices[b]<min){
                min=prices[b];
            }
            profit=Math.max(profit,prices[b]-min);
        }
        return profit;
    }
}
