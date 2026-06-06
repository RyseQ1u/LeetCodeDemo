package leet.methods._12_BitManipulation.L136;

public class Leet136_r4 {
    public int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n^=num;
        }
        return n;
    }
}
