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
public class L409_r8 {
    public int longestPalindrome(String s) {
        //字符计数
        char[] map = new char[128];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }
        //统计奇数字符数量
        int oddCount = 0;
        for (int i = 0; i < map.length; i++) {
            if((map[i]&1)==1){
                oddCount++;
            }
        }
        return oddCount==0?s.length():s.length()-oddCount+1;
    }
}
