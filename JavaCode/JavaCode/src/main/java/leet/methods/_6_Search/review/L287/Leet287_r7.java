package leet.methods._6_Search.review.L287;

public class Leet287_r7 {
    public int findDuplicate(int[] nums) {
        boolean[] used = new boolean[nums.length+1];
        for (int num : nums) {
            if(used[num])return num;
            used[num]=true;
        }
        return 0;
    }
}
