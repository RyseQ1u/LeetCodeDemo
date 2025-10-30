package leet.methods._3_hashTable.easy.review.L409;

public class L409_r1 {
    public int longestPalindrome(String s) {
        int[] map = new int[128];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            map[s.charAt(i)]++;
        }
        //统计奇数个数量
        int oddCount = 0;
        for (int count : map) {
            if ((count & 1) == 1) oddCount++;
        }
        if (oddCount > 0) {
            return length - oddCount + 1;
        } else {
            return length;
        }
    }
}
