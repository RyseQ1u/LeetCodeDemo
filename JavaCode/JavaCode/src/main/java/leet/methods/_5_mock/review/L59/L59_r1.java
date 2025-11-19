package leet.methods._5_mock.review.L59;

public class L59_r1 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int l=0,r=n-1,c=0,f=n-1;
        int cur = 1,count = n*n;
        while (cur<=count){
            for (int i = l; i <= r; i++) {
                res[c][i] = cur++;
            }
            c++;
            for (int i = c; i <= f; i++) {
                res[i][r]=cur++;
            }
            r--;
            for (int i = r; i >= l; i--) {
                res[f][i]=cur++;
            }
            f--;
            for (int i = f; i >= c; i--) {
                res[i][l]=cur++;
            }
            l++;
        }
        return res;

    }
}
