package leet.methods._2_stackAndqueue.review.L266;

public class L266_r1 {
    /// 判断一个字符串的字符重新排列后，是否能形成回文字符串
    public boolean canPermutePalindrome(String s) {
        /// 能形成回文字符串的条件是：最多只有一个字符出现奇数次
        int[] count = new int[128]; // 假设输入字符串只包含ASCII字符
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int oddCount = 0;
        for (int c : count) {
            if (c % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) return false;
        }
        return true;
    }
}
