package leet.methods._10_Dynamic.review.L70;

public class Leet70_r2 {
    public int climbStairs(int n) {
        int sum = 0,a=1,b=1;
        for (int i = 0; i < n-1; i++) {
            sum =  a+b;
            a = b;
            b=sum;
        }
        return b;
    }
}
