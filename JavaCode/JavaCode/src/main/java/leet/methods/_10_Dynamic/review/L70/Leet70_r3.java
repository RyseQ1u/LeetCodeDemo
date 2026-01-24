package leet.methods._10_Dynamic.review.L70;

public class Leet70_r3 {
    public int climbStairs(int n) {
        int a =1,b=1,sum=0;
        for (int i = 0; i < n-1; i++) {
            sum=a+b;
            a=b;
            b=sum;
        }
        return a;
    }

    public int climbStairs_V2(int n) {
        int[] dp = new int[n + 1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
