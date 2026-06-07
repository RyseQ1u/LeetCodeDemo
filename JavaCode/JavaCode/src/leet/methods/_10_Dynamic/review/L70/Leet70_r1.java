package leet.methods._10_Dynamic.review.L70;

public class Leet70_r1 {
    /**
     * 类斐波那契数列
     */
    public int climbStairs(int n) {
        int a=1,b=1,sum =0;
        for (int i = 0; i < n-1; i++) {
            sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
}
