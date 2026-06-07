package leet.methods._4_doublePointer.review.L3;

import java.util.Arrays;

public class L3_r5 {
    public int lengthOfLongestSubstring(String s) {
        //记录字母出现的最后的位置
        int[] map = new int[128];
        Arrays.fill(map,-1);
        int left = 0,res =0;
        for (int right = 0; right < s.length(); right++) {
            char  c = s.charAt(right);
            if(map[c]>=left){
                left=map[c]+1;
            }
            map[c]=right;
            res  =  Math.max(res,right-left+1);
        }
        return res;
    }
}
