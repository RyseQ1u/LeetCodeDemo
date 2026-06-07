package leet.Daily.middle;

public class Leet3335 {

    private static final int MOD = 1000000007;
    /**
     * 递推
     */
    public int lengthAfterTransformations(String s, int t) {
        //创建字母数组 记录数组的长度
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            ++cnt[c-'a'];
        }
        for (int ti = 0; ti < t; ti++) {
            int[] curArr = new int[26];
            //a 可以从 z(z->ab) 变化得到 所以 a的个数 = z的个数
            curArr[0] = cnt[25];
            //b 可以从 z a 变化得到
            curArr[1] = (cnt[25] + cnt[0]) % MOD;
            for (int i = 2; i < 26; i++) {
                //中间字母变化规律相同
                curArr[i]=cnt[i-1];
             }
            cnt = curArr;
        }
        int res = 0;
        for (int i = 0; i < 26; i++) {
            res=(res+cnt[i])%MOD;
        }
        return res ;
    }

}
