package leet.methods._5_mock.review.L59;

public class L59_r6 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int i=1,l=0,r=n-1,u=0,d=n-1,count=n*n;
        while (i<=count){
            for (int j = l; j <= r; j++) {
                res[u][j]=i++;
            }
            u++;
            for (int j = u; j <= d; j++) {
                res[j][r]=i++;
            }
            r--;
            for (int j = r; j >= l; j--) {
                res[d][j]=i++;
            }
            d--;
            for (int j = d; j >= u; j--) {
                res[j][l]=i++;
            }
            l++;
        }
        return res;
    }
}
