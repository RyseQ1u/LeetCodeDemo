package leet.methods._4_doublePointer.review.L392;

public class L392_r2 {

    public boolean isSubsequence(String s, String t) {
        int si = 0, ti = 0;
        while (si < s.length() && ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti)) {
                if(++si == s.length() ){
                    return true;
                };
            }
            ti++;
        }
        return false;
    }
}
