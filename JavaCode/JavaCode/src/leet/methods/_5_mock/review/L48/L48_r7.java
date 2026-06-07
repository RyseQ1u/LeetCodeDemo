package leet.methods._5_mock.review.L48;

public class L48_r7 {
    public void rotate(int[][] matrix) {
        int n = matrix.length,m=matrix[0].length;
        int[][] tmp = new int[n][m];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i]=matrix[i].clone();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=tmp[n-1-j][i];
            }
        }
    }
    public void rotate_v2(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < (n+1)/2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i]=tmp;
            }
        }
    }
}
