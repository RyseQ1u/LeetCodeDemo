package leet.methods._4_doublePointer.review.L167;

/**
 * 升序数组求两数之和
 */
public class L167_r6 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left =0,right = numbers.length-1;
        while (left<right){
            int sum = numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else {
                res[0]=left+1;res[1]=right+1;
                return res;
            }
        }
        return res;

    }
}
