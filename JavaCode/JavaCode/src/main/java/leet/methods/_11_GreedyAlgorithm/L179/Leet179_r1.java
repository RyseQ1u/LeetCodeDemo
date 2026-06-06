package leet.methods._11_GreedyAlgorithm.L179;

import java.util.Arrays;

public class Leet179_r1 {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i]=String.valueOf(nums[i]);
        }
        //降序
        Arrays.sort(strs,(a,b)->(b+a).compareTo(a+b));
        //最大值为0直接返回
        if(strs[0].equals("0"))return "0";
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }

    /**
     * 求最小值
     * @param nums
     * @return
     */
    public String smallestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i]=String.valueOf(nums[i]);
        }
        //升序
        Arrays.sort(strs,(a,b)->(a+b).compareTo(b+a));
        if (strs[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            if(str.equals("0"))continue;
            sb.append(str);
        }
        return sb.toString();
    }
}
