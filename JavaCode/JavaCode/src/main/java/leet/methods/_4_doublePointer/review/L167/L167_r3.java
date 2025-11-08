package leet.methods._4_doublePointer.review.L167;

/**
 * 升序数组求两数之和
 */
public class L167_r3 {
    public int[] twoSum(int[] numbers, int target) {
        //使用双指针头尾遍历
        int l =0,r =numbers.length-1;
        while (l<r){
            if(numbers[l]+numbers[r]<target){
                l++;
            }else if(numbers[l] + numbers[r]>target){
                r--;
            }else {
                return new int[]{l+1,r+1};
            }
        }
        return new int[2];
    }
}
