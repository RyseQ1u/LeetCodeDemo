package leet.methods._6_Search.review.L287;

public class Leet287_r3 {
    public int findDuplicate(int[] nums) {
        //快慢指针 使用数组映射
        int flast = nums[nums[0]];
        int slow = nums[0];
        while (flast!=slow){
            flast=nums[nums[flast]];
            slow=nums[slow];
        }
        flast=0;
        while (flast!=slow){
            flast=nums[flast];
            slow=nums[slow];
        }
        return flast;
    }
}
