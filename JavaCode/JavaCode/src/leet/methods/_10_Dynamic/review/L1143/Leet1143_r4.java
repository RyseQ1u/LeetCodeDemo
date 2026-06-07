package leet.methods._10_Dynamic.review.L1143;

public class Leet1143_r4 {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] chars1 = text1.toCharArray();
        char[] chars2= text2.toCharArray();
        int n=chars1.length,m=chars2.length;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(chars1[i]==chars2[j]){
                    dp[i+1][j+1]=dp[i][j]+1;
                }else {
                    dp[i+1][j+1]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[n][m];
    }
}
