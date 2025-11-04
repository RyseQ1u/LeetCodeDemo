package leet.methods._3_hashTable.easy.review.L242;

public class Leet242_r4 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] map = new int[128];
        for (char c : s.toCharArray()) {
            map[c]++;
        }
        for (char c : t.toCharArray()) {
            if(--map[c]<0){
                return false;
            }
        }
        return true;
    }
}
