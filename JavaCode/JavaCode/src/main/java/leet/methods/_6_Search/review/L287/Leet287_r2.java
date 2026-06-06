package leet.methods._6_Search.review.L287;

public class Leet287_r2 {
    public int findDuplicate(int[] nums) {
        boolean[] map = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(map[nums[i]]) return nums[i];
            map[nums[i]]=true;
        }
        return -1;
    }
}
