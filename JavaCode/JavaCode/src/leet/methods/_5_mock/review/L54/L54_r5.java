package leet.methods._5_mock.review.L54;

import java.util.ArrayList;
import java.util.List;

/// 螺旋矩阵
public class L54_r5 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0,r = matrix[0].length-1,c = 0,f = matrix.length-1;
        ArrayList<Integer> res = new ArrayList<>();
        while (true){
            for (int i = l; i <= r; i++) {
                res.add(matrix[c][i]);
            }
            if(++c > f) break;
            for (int i = c; i <= f; i++) {
                res.add(matrix[i][r]);
            }
            if(--r<l)break;
            for (int i = r; i >= l; i--) {
                res.add(matrix[f][i]);
            }
            if(--f<c)break;
            for (int i = f; i >= c; i--) {
                res.add(matrix[i][l]);
            }
            if(++l>r)break;
        }
        return res;
    }
}
