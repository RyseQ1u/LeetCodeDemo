package leet.methods._11_GreedyAlgorithm.L179;

import java.util.Arrays;

public class Leet179_r2 {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i]= nums[i]+"";
        }
        Arrays.sort(strs,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
