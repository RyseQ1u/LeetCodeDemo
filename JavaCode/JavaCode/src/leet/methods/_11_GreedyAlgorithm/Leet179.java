package leet.methods._11_GreedyAlgorithm;

import java.util.Arrays;

/**
 * 最大数
 */
public class Leet179 {

    /**
     * 使用字符串比较替代int类型比较，可以避免溢出
     * 流式处理
     */
    public String largestNumber(int[] nums) {
        //转换字符串
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i]=String.valueOf(nums[i]);
        }
        //排序，字典序比较
        Arrays.sort(strs,(a,b)->(b+a).compareTo(a+b));
        if(strs[0].equals("0"))return "0";
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
    /**
     * 使用字符串比较替代int类型比较，可以避免溢出
     * 流式处理
     */
    public String largestNumber_2(int[] nums) {
        return Arrays.stream(nums)
                //转换成字符串
                .mapToObj(Integer::toString)
                //排序
                .sorted((a, b) -> (a + b).compareTo(b + a))
                //处理结果
                .reduce("", (a, b) -> a.equals("0") ? a : a + b);
    }
}
