package leet.methods._2_stackAndqueue.review.L266;

public class L266_r5 {
    public boolean canPermutePalindrome(String s) {
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }
        int odd = 0;
        for (int i : map) {
            if((i&1)==1)odd++;
        }

        return odd<2;
    }
}
