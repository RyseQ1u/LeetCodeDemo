package leet.methods._11_GreedyAlgorithm.L11;

public class LeetCode11_r1 {

    /**
     * 二分法
     * 每次移动高度矮的指针
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length - 1;
        while (left < right) {
            int len = right - left;
            if (height[left] > height[right]) {
                max = Math.max(max, height[right] * len);
                right--;
            }else {
                max = Math.max(max, height[left] * len);
                left++;
            }
        }
        return max;
    }

    /**
     * OT!!
     *
     * @param height
     * @return
     */
    public int maxArea_V2(int[] height) {
        int max = 0;
        for (int i = 1; i < height.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int len = i - j;
                int area = Math.min(height[j], height[i]) * len;
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
