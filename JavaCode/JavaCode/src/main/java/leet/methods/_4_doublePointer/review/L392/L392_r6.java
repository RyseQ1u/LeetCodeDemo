package leet.methods._4_doublePointer.review.L392;

public class L392_r6 {

    public boolean isSubsequence(String s, String t) {

        //双指针遍历
        int si =0,ti=0,sn =s.length(),tn=t.length();
        if(sn==0)return true;
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
