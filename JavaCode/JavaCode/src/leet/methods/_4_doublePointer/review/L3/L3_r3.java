package leet.methods._4_doublePointer.review.L3;

import java.util.Arrays;

public class L3_r3 {
    public int lengthOfLongestSubstring(String s) {
        //记录最后出现的位置
        int[] map = new int[128];
        Arrays.fill(map,-1);
        int left = 0,res=0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            //判断是否在范围里出现过
            if(map[c]>=left){
                left = map[c]+1;
            }
            map[c]=right;
            res = Math.max(res,right-left+1);
        }
        return res;
    }
}
