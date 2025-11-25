package leet.methods._5_mock.review.L59;

public class L59_r3 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int i=1, count = n*n,l=0,r=n-1,c = 0,f=n-1;

        while (i<=count){
            //→
            for (int j = l; j <= r; j++) {
                res[c][j] = i++;
            }
            if(++c>f)break;
            //↓
            for (int j = c; j <= f; j++) {
                res[j][r]=i++;
            }
            if(--r<l)break;
            //←
            for (int j = r; j >= l; j--) {
                res[f][j]=i++;
            }
            if(--f<c)break;
            //↑
            for (int j = f; j >= c; j--) {
                res[j][l]=i++;
            }
            if(++l>r)break;
        }
        return res;
    }
}
