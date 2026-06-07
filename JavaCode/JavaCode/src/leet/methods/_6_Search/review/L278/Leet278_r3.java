package leet.methods._6_Search.review.L278;
/// 二分查询
public class Leet278_r3 {
    public int firstBadVersion(int n) {
        int l = 0;
        while (l<=n){
            int mid = l+(n-l)/2;
            if(isBadVersion(mid)){
                n = mid-1;
            }else {
                l=mid+1;
            }
        }
        return l;
    }

    private boolean isBadVersion(int version){
        return false;
    }
}
