package leet.methods._4_doublePointer.review.L392;

public class L392_r7 {

    public boolean isSubsequence(String s, String t) {
        int n = s.length()  ,m=t.length(),i=0,j=0;
        if(n==0)return true;
        while (i<n&&j<m){
            if(s.charAt(i)==t.charAt(j)){
                if(i++==n)return true;
            }
            j++;
        }
        return false;
    }
}
