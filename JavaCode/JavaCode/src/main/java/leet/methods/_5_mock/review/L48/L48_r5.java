package leet.methods._5_mock.review.L48;

public class L48_r5 {
    public void rotate(int[][] matrix) {
        //辅助数组
        int n = matrix.length;
        int[][] tmp = new int[n][];
        for (int i = 0; i < matrix.length; i++) {
            tmp[i] = matrix[i].clone();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = tmp[n-1-j][i];
            }
        }
    }

    /// 原地旋转
    public void rotate_V2(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n / 2); i++) {
            for (int j = 0; j < ((n + 1) / 2); j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = tmp;
            }
        }
    }
}
