package leet.methods._2_stackAndqueue.review.L266;

public class L266_r2 {
    /**
     * 回文字符串 正着读和反着读一样
     * 可以重新排列组成回文字符串
     * 例如 "civic" "aaabbbb"
     * 1. 统计每个字符出现的次数
     * 2. 判断出现奇数次的字符数量
     * 3. 如果字符串长度是偶数，所有字符都必须出现偶数次
     * 4. 如果字符串长度是奇数，最多允许一个字符出现奇数次
     * 5. 根据上述条件判断是否可以重新排列组成回文字符串
     *
     * @param s
     * @return
     */
    public boolean canPermutePalindrome(String s) {
        // 统计字符出现次数
        int oddCount = 0;
        int[] charCount = new int[128];
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }
        // 统计出现奇数次的字符数量
        for (int count : charCount) {
            if ((count & 1) == 1) {
                oddCount++;
            }
        }
        // 判断是否可以组成回文字符串
        if ((s.length() & 1) == 0) {
            return oddCount == 0;
        } else {
            return oddCount == 1;
        }
    }
}
