package leet.methods._10_Dynamic.review.L10;

public class Leet10_r5 {
    private char[] sc ;
    private char[] pc ;
    public boolean isMatch(String s, String p) {
        int n =s.length(),m=p.length();
        sc = s.toCharArray();
        pc = p.toCharArray();
        //构建dp
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0]=true;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                //判断最后一位是否为*
                if(pc[j-1]!='*'){
                    //判断是否匹配
                    dp[i][j]=isEqui(i,j) && dp[i-1][j-1];
                }else {
                    //判断倒数第二位是否匹配
                    if(isEqui(i,j-1)){
                        dp[i][j]=dp[i-1][j];
                    }else {
                        //不匹配则跳过两位比较
                        dp[i][j]=dp[i][j-2];
                    }
                    dp[i][j] = dp[i][j] || dp[i][j-2];
                }
            }
        }
        return dp[n][m];
    }

    private boolean isEqui(int lenOne,int lenTwo){
        if(lenOne==0)return false;
        if(pc[lenTwo-1]=='.')return true;
        return sc[lenOne-1]==pc[lenTwo-1];
    }
}
