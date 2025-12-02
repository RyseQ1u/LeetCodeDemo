package leet.methods.Search.review.L278;
/// 二分查询
public class Leet278_r1 {
    public int firstBadVersion(int n) {
        int l = 1 ,r =n,mid = 0;
        while (l<=r){
            mid = l + (r - l) / 2;
            if(isBadVersion(mid)){
               r = mid -1;
            }else {
                l = mid+1;
            }
        }
        return l;
    }

    private boolean isBadVersion(int version){
        return false;
    }
}
