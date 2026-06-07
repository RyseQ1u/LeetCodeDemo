package leet.methods._3_hashTable.easy.review.L409;

/**
 * 409. 最长回文串
 * 给你一个由大小写英文字母组成的字符串 s ，返回 通过重新排列 s 中的字母 所能形成的最长回文串的长度
 * 示例 1：
 * 输入:s = "abccccdd"
 * 输出:7
 * 解释:我们可以构造的最长回文串是"dccaccd",其长度为 7。
 * 示例 2：
 * 输入:s = "a"
 * 输出:1
 * 解释:最长回文串是"a",其长度为 1。
 * 提示：
 * 1 <= s.length <= 2000
 * s 仅由大小写英文字母组成
 */
public class L409_r2 {
    /**
     * 思路：使用位运算优化空间
     * 1. 使用一个整数作为位掩码，初始值为0
     * 2. 遍历字符串中的每个字符，根据字符的ASCII值计算对应的位位置
     * 3. 使用异或操作切换该位的位置（出现偶数次该位为0，出现奇数次该位为1）
     * 4. 遍历完成后，检查掩码中有多少位是1（表示出现奇数次的字符数量）
     * 5. 如果有奇数次字符，则最长回文串长度为字符串长度减去奇数次字符数量加1，否则为字符串长度
     *
     * @param s 输入字符串
     * @return 最长回文串的长度
     */
    public int longestPalindrome(String s) {
        int[] map = new int[128];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            map[s.charAt(i)]++;
        }
        //统计奇数个数量
        int oddCount = 0;
        for (int count : map) {
            if ((count & 1) == 1) oddCount++;
        }
        if (oddCount > 0) {
            return length - oddCount + 1;
        } else {
            return length;
        }
    }
}
