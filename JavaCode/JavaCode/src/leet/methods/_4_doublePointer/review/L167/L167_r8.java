package leet.methods._4_doublePointer.review.L167;

/**
 * 升序数组求两数之和
 */
public class L167_r8 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int l =0 ,r = numbers.length-1;
        while (l<r){
            int sum = numbers[l]+numbers[r];
            if(sum>target){
                r--;
            }else if(sum<target){
                l++;
            }else {
                res[0]=l+1;
                res[1]=r+1;
                break;
            }
        }
        return res;
    }
}
