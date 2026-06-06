package leet.methods._6_Search.review.L278;

/// 二分查询
public class Leet278_r6 {
    public int firstBadVersion(int n) {
        int res = 1;
        while (res <= n) {
            int m = res + (n - res) / 2;
            if (isBadVersion(m)) {
                n = m - 1;
            } else {
                res = m + 1;
            }
        }
        return res;
    }

    private boolean isBadVersion(int version) {
        return false;
    }
}
