package leet.methods._11_GreedyAlgorithm.L179;

import java.util.Arrays;

public class Leet179_r3 {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strs,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        if(strs[0].equals("0"))return "0";
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
