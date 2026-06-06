package leet.methods._12_BitManipulation;

/**
 * 两数之和
 */
public class Leet371 {

    public int getSum(int a, int b) {
        while (b != 0) {
            // 寻找进位
            // 两个位置都为1时
            // 向左进一位
            int c = (a & b) << 1;
            // 计算位和
            a ^= b;
            //赋值进位进行下一轮加法
            b = c;
        }
        return a;
    }
}
