package leet.methods._5_mock.review.L54;

import java.util.ArrayList;
import java.util.List;

/// 螺旋矩阵
public class L54_r8 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int n = matrix.length,m=matrix[0].length,top = 0,bottom=n-1,left=0,right=m-1;
        while (true){
            //遍历最上层 ->
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            //上边界收缩
            if(++top>bottom)break;
            //遍历最右列
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            //右边界收缩
            if(--right<left)break;
            //遍历最底层
            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            //收缩下边界
            if(--bottom<top)break;
            //遍历最左列
            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            if(++left>right)break;
        }
        return res;
    }
}
