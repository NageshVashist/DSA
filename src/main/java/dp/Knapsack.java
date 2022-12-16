package dp;

import java.util.Arrays;
import java.util.stream.Stream;

public class Knapsack {
    public static int[][] dp;

    public static void main(String[] args) {
        int w[] = {2, 4, 5};
        int val[] = {3, 7, 5};
        int W = 9;
        int size = 3;
        dp = new int[w.length + 1][val.length + 1];
        for (int i = 0; i < dp.length; i++) {

            Arrays.fill(dp[i], -1);
        }
        System.out.println(Knapsack01(val, w, W, size));
        System.out.println(KnapsackMemoization(val, w, W, size));
        System.out.println(knapsackDP(val, w, W, size));
        System.out.println(subSetSum(val, 8, 3));
        System.out.println(equalSumPartition(new int[]{2,3,5,10},4));


    }

    public static boolean equalSumPartition(int val[], int size){
        int sum=Arrays.stream(val).sum();
        if(sum%2 ==0 ){
            sum/=2;
            boolean dp[][]= new boolean[size+1][sum+1];
            for(int i=0;i<size+1;i++){
                dp[i][0]=true;
            }

            for(int i=1;i<size+1;i++){
                for(int j=1;j<sum+1;j++){
                    if(val[i-1]<=j){
                        dp[i][j]= dp[i-1][j- val[i-1]] || dp[i-1][j];
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
            return dp[size][sum];
        }

        return false;
    }

    private static boolean subSetSum(int val[], int sum, int size) {
        boolean dp[][] = new boolean[size + 1][sum + 1];
//        init dp
        for (int i = 0; i < size + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (val[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - val[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }

        }

        return dp[size][sum];
    }

    public static int knapsackDP(int val[], int w[], int W, int size) {
        int dp[][] = new int[size + 1][W + 1];
        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (w[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - w[i - 1]], dp[i - 1][j]);

                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }


        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static int KnapsackMemoization(int val[], int w[], int W, int size) {
        if (W == 0 || size == 0) {
            return 0;
        }
        if (dp[val.length][w.length] != -1) {
            return dp[val.length][w.length];
        } else if (w[size - 1] <= W) {
            int a = val[size - 1] + Knapsack01(val, w, W - w[size - 1], size - 1);
            int b = Knapsack01(val, w, W, size - 1);
            dp[val.length][w.length] = Math.max(a, b);
            return dp[val.length][w.length];
        } else {
            dp[val.length][w.length] = Knapsack01(val, w, W, size - 1);
            return dp[val.length][w.length];
        }
    }

    public static int Knapsack01(int val[], int w[], int W, int size) {
        if (W == 0 || size == 0) {
            return 0;
        } else if (w[size - 1] <= W) {
            int a = val[size - 1] + Knapsack01(val, w, W - w[size - 1], size - 1);
            int b = Knapsack01(val, w, W, size - 1);
            return Math.max(a, b);
        } else {
            return Knapsack01(val, w, W, size - 1);
        }
    }

}
