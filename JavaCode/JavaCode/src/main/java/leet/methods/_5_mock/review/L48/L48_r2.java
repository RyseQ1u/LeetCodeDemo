package leet.methods._5_mock.review.L48;

public class L48_r2 {
    public void rotate(int[][] matrix) {
        //使用辅助数组 行转列
        int n = matrix.length;
        int[][] tmp = new int[n][n];
        for (int i = 0; i < n; i++) {
            tmp[i] = matrix[i].clone();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = tmp[n - 1 - i][j];
            }
        }
    }
}
