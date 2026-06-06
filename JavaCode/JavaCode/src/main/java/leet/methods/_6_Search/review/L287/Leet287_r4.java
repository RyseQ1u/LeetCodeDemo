package leet.methods._6_Search.review.L287;

public class Leet287_r4 {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] map = new boolean[n];
        for (int num : nums) {
            if(map[num])return num;
            map[num]=true;
        }
        return 0;
    }
}
