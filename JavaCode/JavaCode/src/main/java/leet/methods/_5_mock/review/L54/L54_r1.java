package leet.methods._5_mock.review.L54;

import java.util.ArrayList;
import java.util.List;

public class L54_r1 {
    public List<Integer> spiralOrder(int[][] matrix) {
        //边界
        int left = 0, right = matrix[0].length-1, top = 0, floor = matrix.length-1;
        ArrayList<Integer> res = new ArrayList<>(right * floor);
        while (true) {
            //从左到右
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            //上边界向下移动并检查是否越界
            if (++top > floor) break;

            //从上到下
            for (int i = top; i <= floor; i++) {
                res.add(matrix[i][right]);
            }
            //右边界向左移动并检查是否越界
            if (--right < left) break;

            //从右到左
            for (int i = right; i >= left; i--) {
                res.add(matrix[floor][i]);
            }
            //下边界向上移动 越界检查
            if (--floor < top) break;

            //从下到上
            for (int i = floor; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            //左边界向右移动 越界检查
            if (++left > right) break;
        }
        return res;
    }
}
