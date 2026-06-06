package leet.methods._4_doublePointer.review.L3;

public class L3_r2 {
    public int lengthOfLongestSubstring(String s) {
        int l = 0,res=0;
        //记录最后出现的位置
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i++) {
            //计数
            char c = s.charAt(i);
            map[c]++;
            //当出现重复元素时移动指针
            while (map[c]>1) map[s.charAt(l++)]--;
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}
