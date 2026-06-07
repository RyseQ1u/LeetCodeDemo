package leet.methods._6_Search.review.L154;

public class Leet154_r1 {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        for (int i = 0; i < n-1; i++) {
            if(nums[i]>nums[i+1]){
                return nums[i+1];
            }
        }
        return  nums[0];
    }
}
