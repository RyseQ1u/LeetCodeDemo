package leet.methods._10_Dynamic.review.L10;

public class Leet10_r4 {
    private boolean[][] dp;
    private char[] sArr;
    private char[] pArr;
    public boolean isMatch(String s, String p) {
        int n =s.length(),m=p.length();
        sArr = s.toCharArray();
        pArr = p.toCharArray();
        dp=new boolean[n+1][m+1];
        dp[0][0]=true;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                //最后一位不为*
                if(pArr[j-1]!='*'){
                    dp[i][j]= isEqual(i,j) && dp[i-1][j-1];
                }else {
                    if(isEqual(i,j-1)){
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

    private boolean isEqual(int l1,int l2){
        if(l1==0)return false;
        if(pArr[l2-1]=='.')return true;
        return sArr[l1-1]==pArr[l2-1];
    }
}
