package leet.methods._3_hashTable.easy.review.L205;

public class L205_r3 {
    public boolean isIsomorphic(String s, String t) {
        int[] smap = new int[128];
        int[] tmap = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char st = t.charAt(i);
            if(smap[st] != 0 && smap[st] != sc) return false;
            if(tmap[sc] != 0 && tmap[sc] != st) return false;
            smap[st] = sc;
            tmap[sc] = st;
        }
        return true;
    }
}
