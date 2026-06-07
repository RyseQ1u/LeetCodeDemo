package leet.Daily.easy;

import java.util.ArrayList;
import java.util.List;

public class Leet2094 {


    /**
     * 暴力破解 循环遍历三位数
     *
     * @param digits
     * @return
     */
    public int[] findEvenNumbers(int[] digits) {
        //记录数字个数
        int[] cnt = new int[10];
        for (int d : digits) {
            cnt[d]++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        next:
        // 枚举所有三位数偶数 i
        for (int i = 100; i < 1000; i += 2) {
            int[] c = new int[10];
            // 枚举 i 的每一位 d
            for (int x = i; x > 0; x /= 10) {
                int d = x % 10;
                // 如果 i 中 d 的个数比 digits 中的还多，那么 i 无法由 digits 中的数字组成
                if (++c[d] > cnt[d]) {
                    // 枚举下一个偶数
                    continue next;
                }
            }
            ans.add(i);
        }
        return ans.stream().mapToInt(i -> i).toArray();

    }


}
