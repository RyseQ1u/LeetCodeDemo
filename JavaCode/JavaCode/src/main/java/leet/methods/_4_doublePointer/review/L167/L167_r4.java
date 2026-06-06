package leet.methods._4_doublePointer.review.L167;

/**
 * 升序数组求两数之和
 */
public class L167_r4 {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length,l=0,r=n-1;
        while (l<r){
            int sum = numbers[l]+numbers[r];
            if(sum<target){
                l++;
            }else if(sum>target) {
                r--;
            }else {
                return new int[]{l+1,r+1};
            }
        }
        return new int[2];
    }
}
