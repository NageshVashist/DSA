package dp;

public class FibonacciSeries {
    public static void main(String[] args) {
        int i = 30;

        int[] dp = new int[i+1];

        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == 2) {
                dp[j] = 1;
            } else {
                dp[j] = dp[j - 1] + dp[j - 2];
            }
        }
        System.out.println(dp[i]);
    }
}
