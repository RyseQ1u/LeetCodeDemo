package leet.methods._6_Search.review.L287;

public class Leet287_r7 {
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
}
