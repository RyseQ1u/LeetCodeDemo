package leet.methods._11_GreedyAlgorithm.L179;

import java.util.Arrays;

public class Leet179_r4 {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] strs = new String[n];
        for (int i = 0; i < nums.length; i++) {
            strs[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strs,(a,b)->(b+a).compareTo(a+b));
        if(strs[0].equals("0"))return "0";
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
