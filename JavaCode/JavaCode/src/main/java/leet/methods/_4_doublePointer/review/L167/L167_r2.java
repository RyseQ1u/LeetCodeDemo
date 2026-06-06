package leet.methods._4_doublePointer.review.L167;

/**
 * 升序数组求两数之和
 */
public class L167_r2 {
    public int[] twoSum(int[] numbers, int target) {
        //双指针 头尾指针向中间寻找
        int l=0,r=numbers.length-1;
        while (l<r){
            int count = numbers[l]+numbers[r];
            if(count>target){
                r--;
            }else if(count<target){
                l++;
            }else {
                return new int[]{r+1,l+1};
            }
        }
        return new int[2];
    }
}
