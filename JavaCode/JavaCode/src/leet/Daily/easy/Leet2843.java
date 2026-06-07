package leet.Daily.easy;

public class Leet2843 {

    /**
     * 枚举
     *
     * @param low
     * @param high
     * @return
     */
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        //遍历
        for (int i = low; i <= high; i++) {
            //将数字转换为字符串
            char[] cArr = Integer.toString(i).toCharArray();
            //获取数组长度
            int n = cArr.length;
            //判断长度是否为偶数 否则数字不对称直接跳过
            if (n % 2 > 0) continue;
            //计算左边的字符和
            int sumLeft = 0;
            for (int j = 0; j < n / 2; j++) {
                sumLeft += cArr[j];
            }
            //减去右边的字符和
            for (int j = n / 2; j < n; j++) {
                sumLeft -= cArr[j];
            }
            if (sumLeft == 0) res++;
        }
        return res;
    }

}
