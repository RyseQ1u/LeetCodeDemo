package leet.methods._4_doublePointer.review.L392;

public class L392_r3 {

    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty())return true;
        int si =0;
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i)==s.charAt(si)){
                si++;
                if(si==s.length())  return true;
            }
        }
        return false;
    }
}
