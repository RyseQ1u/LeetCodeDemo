package leet.methods._12_BitManipulation.L136;

public class Leet136_r3 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res^=num;
        }
        return res;
    }
}
