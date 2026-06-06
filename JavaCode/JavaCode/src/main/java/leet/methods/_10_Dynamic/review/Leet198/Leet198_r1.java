package leet.methods._10_Dynamic.review.Leet198;

public class Leet198_r1 {
    public int rob(int[] nums) {
        // 初始化动态规划状态变量
        // cur: 表示偷窃到当前房屋时能获得的最大金额
        // pre: 表示偷窃到上一个房屋时能获得的最大金额
        int cur = 0, pre = 0, tmp;

        // 遍历每个房屋的金额
        for (int num : nums) {
            // 保存当前状态，用于后续更新pre
            // 在考虑当前房屋时，tmp保存的是不考虑当前房屋时的最大金额
            tmp = cur;

            // 动态规划状态转移方程：
            // 选择1：不偷当前房屋，最大金额为cur（即上一个房屋的最大金额）
            // 选择2：偷当前房屋，最大金额为pre + num（即上上个房屋的最大金额加上当前房屋金额）
            // 取两者中的较大值作为新的cur
            cur = Math.max(cur, pre + num);

            // 更新pre为上一个房屋时的cur值（即不考虑当前房屋时的状态）
            pre = tmp;
        }

        // 返回偷窃到最后一个房屋时的最大金额
        return cur;
    }
}
