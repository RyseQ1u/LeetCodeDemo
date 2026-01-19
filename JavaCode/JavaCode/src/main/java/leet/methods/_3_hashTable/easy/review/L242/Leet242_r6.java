package leet.methods._3_hashTable.easy.review.L242;

/// 有效的字母异位词
public class Leet242_r6 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] map = new int[127];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            if(--map[t.charAt(i)]==-1)return false;
        }
        return true;
    }
}
