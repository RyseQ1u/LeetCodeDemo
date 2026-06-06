package leet.methods._4_doublePointer.review.L392;

public class L392_r4 {

    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)return true;
        int si =0;
        for (int ti = 0; ti < t.length(); ti++) {
            if(t.charAt(ti) == s.charAt(si)){
                if(si==s.length()-1)return true;
                si++;
            }
        }
        return false;
    }
}
