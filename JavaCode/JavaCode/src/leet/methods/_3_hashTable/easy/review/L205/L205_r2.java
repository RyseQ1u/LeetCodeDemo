package leet.methods._3_hashTable.easy.review.L205;

public class L205_r2 {
    public boolean isIsomorphic(String s, String t) {
        int[] tMap = new int[127];
        int[] sMap = new int[127];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if ((sMap[sc] != 0) && (sMap[sc] != tc)
                    || (tMap[tc] != 0) && (tMap[tc] != sc)
            ) return false;
            sMap[sc] = tc;
            tMap[tc] = sc;
        }
        return true;
    }
}
