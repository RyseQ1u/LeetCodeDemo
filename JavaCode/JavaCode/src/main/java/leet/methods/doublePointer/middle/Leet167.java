package leet.methods.doublePointer.middle;

import leet._class.linklist.ListNode;

public class Leet167 {


    /**
     * 使用双指针
     * 计算两个指针的值，
     * 如果比目标大移动右指针，
     * 如果比目标小移动左指针，
     * 如果等于目标直接返回结果。
     *
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;

            } else if (sum > target) {
                right--;

            } else {
                return new int[]{left + 1, right + 1};

            }
        }
        return new int[0];
    }


}
