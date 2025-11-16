package leet.methods._3_hashTable.easy.review.L205;

public class L205_r5 {
    public boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[128];
        int[] tMap = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char st = t.charAt(i);
            if (sMap[sc] != 0 && sMap[sc] != st) return false;
            if (tMap[st] != 0 && tMap[st] != sc) return false;
            sMap[sc] = st;
            tMap[st] = sc;
        }
        return true;
    }
}
