package leet.methods._10_Dynamic.review.L70;

public class Leet70_r6 {
    public int climbStairs(int n) {
        int a =1,b=1,sum;
        for (int i = 1; i < n; i++) {
            sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
}
