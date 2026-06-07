package leet.methods._10_Dynamic.review.L10;

public class Leet10_r3 {
    private char[] sArr;
    private char[] pArr;

    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        sArr = s.toCharArray();
        pArr = p.toCharArray();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (pArr[j-1] != '*') {
                    dp[i][j] = equlsForLength(i, j)&&dp[i - 1][j - 1];
                } else {
                    if (equlsForLength(i, j - 1)) {
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

    private boolean equlsForLength(int sL, int pL) {
        if (sL == 0) return false;
        if (pArr[pL - 1] == '.') return true;
        return sArr[sL - 1] == pArr[pL - 1];
    }
}
