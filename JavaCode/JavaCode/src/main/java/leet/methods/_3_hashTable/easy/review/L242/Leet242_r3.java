package leet.methods._3_hashTable.easy.review.L242;

public class Leet242_r3 {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        int length = s.length();
        if(length != t.length()) return false;
        for (int i = 0; i < length; i++) {
            map[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < length; i++) {
            if (--map[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
