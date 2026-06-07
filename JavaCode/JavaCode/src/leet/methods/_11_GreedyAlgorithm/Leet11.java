package leet.methods._11_GreedyAlgorithm;

/**
 * 盛最多水的容器
 */
public class Leet11 {

    /**
     * 双指针，每次移动高度小的指针
     */
    public int maxArea(int[] height) {
        int right = height.length - 1, left = 0, res = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                res = Math.max(res, height[left] * (right - left));
                left++;
            } else {
                res = Math.max(res, height[right] * (right - left));
                right--;
            }
        }
        return res;
    }

    /**
     * 简化代码
     */
    public int maxArea_2(int[] height) {
        int right = height.length - 1, left = 0, res = 0;
        while (left < right)  res = height[left] < height[right] ? Math.max(res, (right - left) * height[left++]) : Math.max(res, (right - left) * height[right]);
        return res;
    }
}
