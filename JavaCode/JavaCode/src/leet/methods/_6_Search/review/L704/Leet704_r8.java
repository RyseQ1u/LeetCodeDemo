package leet.methods._6_Search.review.L704;

///  升序数组 二分查找
public class Leet704_r8 {
    public int search(int[] nums, int target) {
        int l = 0,r= nums.length-1;
        while (l<=r){
            int m = l+(r-l)/2;
            if(nums[m]==target){
                return m+1;
            }else if(nums[m]>target){
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return -1;
    }
}
