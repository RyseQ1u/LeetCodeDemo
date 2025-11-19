package leet.methods._5_mock.review.L54;

import java.util.ArrayList;
import java.util.List;

public class L54_r2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, right = matrix[0].length-1, ceiling = 0, floor = matrix.length-1;
        ArrayList<Integer> res = new ArrayList<>();
        while (true) {
            // →
            for (int i = left; i <= right; i++) {
                res.add(matrix[ceiling][i]);
            }
            if(++ceiling>floor)break;

            // ↓
            for (int i = ceiling; i <= floor; i++) {
                res.add(matrix[i][right]);
            }
            if(--right<left)break;

            // ←
            for (int i = right; i >= left; i--) {
                res.add(matrix[floor][i]);
            }
            if(--floor<ceiling)break;

            // ↑
            for (int i = floor; i >= ceiling; i--) {
                res.add(matrix[i][left]);
            }
            if(++left>right)break;
        }
        return res;
    }
}
