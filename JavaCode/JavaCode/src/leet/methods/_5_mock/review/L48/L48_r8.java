package leet.methods._5_mock.review.L48;

public class L48_r8 {
    public void rotate(int[][] matrix) {
        int  n= matrix.length,m=matrix[0].length;
        int[][] tmp = new int[n][m];
        for (int i = n; i > 0; i--) {
            tmp[i]=matrix[i].clone();
        }
        for (int i = 0; i < n; i++) {
            for (int j = m; j > 0; j--) {
                matrix[i][j]=tmp[n-1-j][i];
            }
        }
    }
}
