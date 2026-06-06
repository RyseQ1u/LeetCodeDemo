package leet.methods._4_doublePointer.review.L3;

import java.util.Arrays;

public class L3_r1 {
    //统计出现次数
    public int lengthOfLongestSubstring(String s) {
        int l = 0,res=0;
        //统计出现次数
        int[] map = new int[128];
        for (int r = 0; r < s.length(); r++) {
            //计数
            map[s.charAt(r)]++;
            //如果出现次数大于1，说明有重复，移动左指针
            while (map[s.charAt(r)]>1) map[s.charAt(l++)]--;
            //更新结果
            res = Math.max(res,r-l+1);
        }
        return res;
    }

    //统计最后出现位置
    public int lengthOfLongestSubstring_V2(String s) {
        int l = 0, res = 0;
        int[] lastIndex = new int[128]; // 记录字符最后出现的位置
        Arrays.fill(lastIndex, -1);

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            // 如果字符在当前窗口内出现过，移动左指针
            if (lastIndex[c] >= l) l = lastIndex[c] + 1;

            lastIndex[c] = r; // 更新字符最后出现的位置
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
