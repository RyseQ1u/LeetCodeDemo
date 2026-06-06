package leet.methods._11_GreedyAlgorithm.L179;

import java.util.Arrays;

public class Leet179_r5 {
    public String largestNumber(int[] nums) {
        //转换字符串 排序
        String[] strs = new String[nums.length];
        for (int i = 0; i < strs.length; i++) {
            strs[i]=String.valueOf(nums[i]);
        }
        //排序 倒序
        Arrays.sort(strs,(a,b)->(b+a).compareTo(a+b));
        if(strs[0].equals("0"))return "0";
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
