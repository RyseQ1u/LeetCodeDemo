package leet.methods._6_Search.review.L287;

public class Leet287_r6 {
    public int findDuplicate(int[] nums) {
        int[] map = new int[nums.length];
        for (int num : nums) {
            map[num]++;
        }
        for (int num : nums) {
            if(map[num]>1)return num;
        }
        return 0;
    }

    /// 快慢指针 转换为链表找循环点
    public int findDuplicate_v2(int[] nums) {
        int f =0,s=0;
        f= nums[nums[f]];
        s=nums[s];
        while (f!=s){
            f= nums[nums[f]];
            s=nums[s];
        }
        f=0;
        while (f!=s){
            f=nums[f];
            s=nums[s];
        }
        return f;
    }
}
