package leet.methods._5_mock.review.L48;

public class L48_r1 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 使用辅助数组
        int[][] tmp = new int[n][];
        for (int i = 0; i < n; i++)
            tmp[i] = matrix[i].clone();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = tmp[n-1-i][j];
            }
        }
    }
}
