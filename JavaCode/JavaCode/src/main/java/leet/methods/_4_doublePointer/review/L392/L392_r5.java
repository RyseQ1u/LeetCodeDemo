package leet.methods._4_doublePointer.review.L392;

public class L392_r5 {

    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)return true;
        int si=0,ti=0,sn=s.length(),tn=t.length();
        while (si<sn&&ti<tn){
            if(s.charAt(si)==t.charAt(ti)){
                si++;
                if(si==sn)return true;
            }
            ti++;
        }
        return false;
    }
}
