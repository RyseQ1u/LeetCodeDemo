package leet.methods._3_hashTable.easy.review.L242;


/// 有效的字母异位词
public class Leet242_r7 {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[127];
        if(s.length()!=t.length())return false;
        for (int i = 0; i < s.length(); i++) {
             map[s.charAt(i)]++;
             map[t.charAt(i)]--;
        }
        for (int i : map) {
            if(i!=0)return false;
        }
        return true;

    }
}
