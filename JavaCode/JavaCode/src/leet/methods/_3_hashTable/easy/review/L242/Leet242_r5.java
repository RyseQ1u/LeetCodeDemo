package leet.methods._3_hashTable.easy.review.L242;

/// 有效的字母异位词
public class Leet242_r5 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
            map[t.charAt(i)]--;
        }
        for (int i = 97; i < 123; i++) {
            if(map[i]<0)return false;
        }
        return true;
    }
}
