package leet.methods._3_hashTable.easy.review.L205;

public class L205_r4 {
    public boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[128];
        int[] mapT = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            //检查对应关系
            if (mapS[cs] != 0 && mapS[cs] != ct) return false;
            if (mapT[ct] != 0 && mapT[ct] != cs) return false;
            /// 记录对应关系
            mapS[cs] = ct;
            mapT[ct] = cs;
        }
        return true;
    }
}
