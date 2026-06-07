package leet.methods._5_mock.review.L54;

import java.util.ArrayList;
import java.util.List;

/// 螺旋矩阵
public class L54_r7 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int l=0,r=matrix[0].length-1,u=0,d=matrix.length-1;
        while (true){
            for (int i = l; i <= r; i++) {
                res.add(matrix[u][i]);
            }
            if(++u>d)break;

            for (int i = u; i <= d; i++) {
                res.add(matrix[i][r]);
            }
            if(--r<l)break;

            for (int i = r; i >= l; i--) {
                res.add(matrix[d][i]);
            }
            if(--d<u)break;

            for (int i = d; i >= u; i--) {
                res.add(matrix[i][l]);
            }

            if(++l>r)break;
        }

        return res;
    }
}
