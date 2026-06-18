package leet.methods._4_doublePointer.review.L3;

import java.util.Arrays;

public class L3_r8 {
    public int lengthOfLongestSubstring(String s) {
        int res =0,left=0;
        //记录某字母最后一次出现的地方
        int[] map = new int[128];
        Arrays.fill(map,-1);
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if(map[c]>=left){
                left=map[c]+1;
            }
            map[c]=right;
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}
