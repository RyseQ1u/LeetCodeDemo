package leet.methods._10_Dynamic.review.L10;

public class Leet10_r1 {

    char[] sc;
    char[] pc;

    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        sc = s.toCharArray();
        pc = p.toCharArray();
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                //判断最后一位是否为*号
                if (pc[j - 1] != '*') {
                    //否
                    //判断最一位是否相同 若相同再判断前长度为n-1的字符串是否匹配
                    dp[i][j] = MyEquals(i, j) && dp[i - 1][j - 1];
                } else {
                    //最后一位为*号的情况
                    //判断n-1是否相同
                    if (MyEquals(i, j - 1)) {
                        //再判断前n-1的字符串是否匹配 因为*代表多个或0个使用长度j指针不变
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        //不相等的时候跳过两位n-2继续匹配
                        dp[i][j] = dp[i][j - 2];
                    }
                    //最终结果取并集代表 * 匹配和未匹配的情况
                    dp[i][j] = dp[i][j] || dp[i][j - 2];
                }
            }
        }
        return dp[n][m];
    }

    private boolean MyEquals(int x, int y) {
        if (x == 0) return false;
        if (pc[y - 1] == '.') return true;
        return sc[x - 1] == pc[y - 1];
    }
}
