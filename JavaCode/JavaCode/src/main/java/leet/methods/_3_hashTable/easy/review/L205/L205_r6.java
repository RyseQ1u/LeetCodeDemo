package leet.methods._3_hashTable.easy.review.L205;

public class L205_r6 {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int[] sm = new int[128],tm = new int[128];
        for (int i = 0; i < n; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if((sm[sc] != 0 && sm[sc] != tc) || (tm[tc] != 0&& tm[tc] != sc)) return false;
            sm[sc] = tc;
            tm[tc] = sc;
        }
        return true;
    }
}
