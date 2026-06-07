package leet.methods.mock.middle;

public class Leet59 {


    public int[][] generateMatrix(int n) {
        if(n==0){
            return new int[][]{};
        }
        int[][] res = new int[n][n];
        //创建边界
        int left = 0,right = n-1,top =0,bottom = n-1,index = 1;
        while (true){
            //从左到右
            for (int i = left; i <= right; i++) {
                res[top][i] = index++;
            }
            //上边界往下移动
            if(++top>bottom) break;

            //从上到下
            for (int i = top; i <= bottom; i++) {
                res[i][right]= index++;
            }
            //右边界向左移动
            if(--right<left)break;

            //从右到左
            for (int i = right; i >= left; i--) {
                res[bottom][i]= index++;
            }
            //下边界向上移动
            if(--bottom<top)break;

            //从下到上
            for (int i = bottom; i >= top; i--) {
                res[i][left]= index++;
            }
            //左边界向右移动
            if(++left>right)break;
        }
        return res  ;
    }
}


