package leet.methods._2_stackAndqueue.review.L266;

/// 是否为回文字符串
public class L266_r7 {
    public boolean canPermutePalindrome(String s) {
        //判断奇数字母出现个数
        int[] map = new int[127];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }
        int odd = 0;
        for (int i : map) {
            if((i&1)==1)odd++;
        }
        return odd<2;
    }
}
