package leet.methods._10_Dynamic.review.L10;

public class Leet10_r2 {
    private boolean[][] dp;
    private char[] tc;
    private char[] pc;

    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        tc = s.toCharArray();
        pc = p.toCharArray();
        dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (pc[j - 1] != '*') {
                    dp[i][j] = myEqual(i, j) && dp[i - 1][j - 1];
                } else {
                    if (myEqual(i, j - 1)) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 2];
                    }
                    dp[i][j] = dp[i][j] || dp[i][j - 2];
                }
            }
        }
        return dp[n][m];
    }

    private boolean myEqual(int sl, int pl) {
        if (sl == 0) return false;
        if (pc[pl - 1] == '.') return true;
        return tc[sl - 1] == pc[pl - 1];
    }
}
