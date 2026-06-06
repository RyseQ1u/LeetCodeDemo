package leet.methods._5_mock.review.L54;

import java.util.ArrayList;
import java.util.List;

public class L54_r3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int l =0 , r= matrix[0].length-1,c = 0,f = matrix.length-1;
        while (true){
            //→
            for (int i = l; i <= r; i++) {
                list.add(matrix[c][i]);
            }
            if(++c>f)break;
            //↓
            for (int i = c; i <= f; i++) {
                list.add(matrix[i][r]);
            }
            if(--r<l)break;
            //←
            for (int i = r; i >= l; i--) {
                list.add(matrix[f][i]);
            }
            if(--f<c)break;
            //↑
            for (int i = f; i >= c; i--) {
                list.add(matrix[i][l]);
            }
            if(++l>r)break;
        }
        return list;
    }
}
