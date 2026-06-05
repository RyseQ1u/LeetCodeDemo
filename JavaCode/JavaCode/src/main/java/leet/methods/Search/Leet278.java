package leet.methods.Search;

public class Leet278 {

    public int firstBadVersion(int n) {
        int l=1,r=n,i=0;
        while (l<=r){
            //防止整型数据溢出
            i = (r+l)/2;
            if(isBadVersion(i)){
                r = i-1;
            }else {
                l = i+1;
            }
        }
        return i;
    }

    private boolean isBadVersion(int n) {
        if(n>=1) return true;
        return false;
    }


}
