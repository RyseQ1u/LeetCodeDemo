package leet.methods._5_mock.review.L59;

public class L59_r2 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int l = 0, r = n - 1, c = 0, f = n - 1, i = 1;
        int count = n*n;
        while (i <= count) {
            for (int j = l; j <= r; j++) {
                res[c][j] = i++;
            }
            c++;

            for (int j = c; j <= f; j++) {
                res[j][r] = i++;
            }
            r--;

            for (int j = r; j >= l; j--) {
                res[f][j] = i++;
            }
            f--;

            for (int j = f; j >= c; j--) {
                res[j][l] = i++;
            }
            l++;
        }
        return res;
    }
}
