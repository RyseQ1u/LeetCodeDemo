package leet.methods.mock.middle;

import java.util.ArrayList;

public class Leet48 {


    /**
     * 数学法 使用旋转公式
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 深拷贝 matrix -> tmp
        int[][] tmp = new int[n][];
        for (int i = 0; i < n; i++)
            tmp[i] = matrix[i].clone();
        // 根据元素旋转公式，遍历修改原矩阵 matrix 的各元素
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][n - 1 - i] = tmp[i][j];
            }
        }
    }

    /**
     * 模拟旋转+旋转公式
     * @param matrix
     */
    public void rotate_V2(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            for(int j = 0;j<(n+1)/2;j++){
                //记录左上原元素
                int tmp = matrix[i][j];
                //替换左上元素 左下->左上
                matrix[i][j] = matrix[n-1-j][i];
                //替换左下元素 右下->右左
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                //替换右下元素 右上->右下
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                //替换右上元素 原左上->右上
                matrix[j][n-1-i]=tmp;
            }
        }
    }
}


