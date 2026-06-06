package leet.methods._10_Dynamic.review.L10;

public class Leet10_r6 {
    char[] sc;
    char[] pc;
    public boolean isMatch(String s, String p) {
        int n = s.length(),m=p.length();
        this.sc = s.toCharArray();
        this.pc = p.toCharArray();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0]=true;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(pc[j-1]!='*'){
                    dp[i][j]=isEquls(i,j) && dp[i-1][j-1];
                }else {
                    if(isEquls(i,j-1)){
                        dp[i][j]=dp[i-1][j];
                    }else {
                        dp[i][j]=dp[i][j-2];
                    }
                    dp[i][j]=dp[i][j] || dp[i][j-2];
                }
            }
        }
        return dp[n][m];
    }

    private boolean isEquls(int i,int j){
        if(i==0)return false;
        if(pc[j-1]=='.')return true;
        return sc[i-1]==pc[j-1];
    }
}
