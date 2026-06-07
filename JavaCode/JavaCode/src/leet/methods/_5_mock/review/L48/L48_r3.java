package leet.methods._5_mock.review.L48;

public class L48_r3 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //使用辅助数组旋转
        int[][] tmp = new int[n][n];
        for (int i = 0; i < n; i++) {
            tmp[i] = matrix[i].clone();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = tmp[n-1-j][i];
            }
        }
    }
}
