package leet.methods._12_BitManipulation.L136;

public class Leet136_r1 {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int num : nums) {
            a^=num;
        }
        return a;
    }
}
