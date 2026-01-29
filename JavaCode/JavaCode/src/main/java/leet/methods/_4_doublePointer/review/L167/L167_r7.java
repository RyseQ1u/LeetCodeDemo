package leet.methods._4_doublePointer.review.L167;

/**
 * 升序数组求两数之和
 */
public class L167_r7 {
    public int[] twoSum(int[] numbers, int target) {
        //双指针
        int l =0 , r = numbers.length-1;
        while (l<r){
            int sum = numbers[l]+numbers[r];
            if(sum>target){
                r--;
            }else if(sum<target){
                l++;
            }else {
                return new int[]{l+1,r+1};
            }
        }
        return new int[2];
    }
}
