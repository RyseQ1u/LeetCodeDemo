package leet.methods._4_doublePointer.review.L3;

import java.util.Arrays;

public class L3_r6 {
    public int lengthOfLongestSubstring(String s) {
        //记录上一次出现的坐标
        int[] map = new int[128];
        Arrays.fill(map, -1);
        int res = 0, left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //发现重复字符 索引往后移动
            if (map[c] >= left) {
                left = map[c] + 1;
            }
            map[c] = i;
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
