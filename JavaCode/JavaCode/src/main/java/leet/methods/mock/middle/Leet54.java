package leet.methods.mock.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet54 {


    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0){
            return new ArrayList<>();
        }
        //创建边界
        int left = 0,right = matrix[0].length-1,top =0,bottom = matrix.length-1,index = 0;
        Integer[] res = new Integer[(right + 1) * (bottom + 1)];
        //循环
        while (true){
            //从左到右
            for (int i = left; i <= right; i++) {
                res[index++] = matrix[top][i];
            }
            //上边界往下移动 并判断是否还有数据
            if(++top>bottom) break;

            //从上到下
            for (int i = top; i <= bottom; i++) {
                res[index++] = matrix[i][right];
            }
            //右边界向左移动 并判断是否还有数据
            if(--right<left)break;

            //从右到左
            for (int i = right; i >= left; i--) {
                res[index++] = matrix[bottom][i];
            }
            //下边界向上移动 并判断是否还有数据
            if(--bottom<top)break;

            //从下到上
            for (int i = bottom; i >= top; i--) {
                res[index++] = matrix[i][left];
            }
            //左边界向右移动 并判断是否还有数据
            if(++left>right)break;
        }
        return Arrays.asList(res);
    }
}


