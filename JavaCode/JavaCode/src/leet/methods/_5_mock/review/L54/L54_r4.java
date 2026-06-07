package leet.methods._5_mock.review.L54;

import java.util.ArrayList;
import java.util.List;

/// 螺旋矩阵
public class L54_r4 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length,l=0,r=n-1,c=0,f=m-1;
        ArrayList<Integer> res = new ArrayList<>(m * n);
        while (true){
            //→
            for (int i = l; i <= r; i++) {
                res.add(matrix[c][i]);
            }
            if(++c>f)break;
            //↓
            for (int i = c; i <= f; i++) {
                res.add(matrix[i][r]);
            }
            if(--r<l)break;
            //←
            for (int i = r; i >= l; i--) {
                res.add(matrix[f][i]);
            }
            if(--f<c)break;
            //↑
            for (int i = f; i >= c; i--) {
                res.add(matrix[i][l]);
            }
            if(++l>r)break;
        }
        return res;
    }
}
