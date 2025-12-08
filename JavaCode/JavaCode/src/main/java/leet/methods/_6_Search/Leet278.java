package leet.methods._6_Search;

public class Leet278 {

    public int firstBadVersion(int n) {
        int l=1,r=n;
        while (l<=r){
            int i = l + (r - l) / 2;
            if(isBadVersion(i)){
                r = i-1;
            }else {
                l = i+1;
            }
        }
        return l;
    }

    private boolean isBadVersion(int n) {
        return n >= 1;
    }


}
