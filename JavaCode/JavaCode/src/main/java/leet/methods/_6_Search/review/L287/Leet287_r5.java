package leet.methods._6_Search.review.L287;

public class Leet287_r5 {
    public int findDuplicate(int[] nums) {
        boolean[] map = new boolean[nums.length];
        for (int num : nums) {
           if( map[num]) return num;
           map[num]=true;
        }
        return 0;
    }
    /// 快慢指针
    public int findDuplicate_v2(int[] nums) {
        int fast =0,slow=0;
        while (true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow==fast)break;
        }
        fast = 0;
        while (slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
