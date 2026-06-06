package leet.methods._4_doublePointer.review.L167;

public class L167_r1 {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while (l<r){
            int tmp =numbers[l]+numbers[r];
            if(tmp<target){
                l++;
            }else if(tmp>target){
                r--;
            }else {
                return new int[]{l,r};
            }
        }
        return new int[2];
    }
}
