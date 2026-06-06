package leet.methods._13_Math;

/**
 * 整数拆分
 */
public class Leet343 {

    /**
     * 数学法 拆分因子为3时会取得乘积的最大值
     * 最优： 3 。把数字 n 可能拆为多个因子 3 ，余数可能为 0,1,2 三种情况。
     * 次优： 2 。若余数为 2 ；则保留，不再拆为 1+1 。
     * 最差： 1 。若余数为 1 ；则应把一份 3+1 替换为 2+2，因为 2×2>3×1。
     */
    public int integerBreak(int n) {
        //小于3的时候处理
        if(n<3) return n-1;
        int a = n /3,b=n%3;
        if(b==0) return (int) Math.pow(3,a);
        //余1 将一个3+1 > 再乘 1
        if(b==1) return (int) (Math.pow(3,a-1)*4);
        //余2 再乘2
        return (int) (Math.pow(3,a) * 2);
    }
}
