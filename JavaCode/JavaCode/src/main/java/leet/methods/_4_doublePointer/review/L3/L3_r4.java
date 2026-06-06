package leet.methods._4_doublePointer.review.L3;

import java.util.Arrays;

public class L3_r4 {
    public int lengthOfLongestSubstring(String s) {
            int[] map = new int[128];
            Arrays.fill(map,-1);
            int res=0;
            for (int l=0,r   = 0; r < s.length(); r++) {
                char  c = s.charAt(r);
                if(map[c]>=l){
                    l=map[c]+1;
                }
                map[c]=r;
                res  =  Math.max(res,r-l+1);
            }
            return res;
    }
}
