package leet.methods._10_Dynamic.review.L509;

public class Leet509_r6 {
    public int fib(int n) {
        int a = 0,b=1,sum=0;
        for (int i = 0; i < n; i++) {
            sum=a+b;
            a=b;
            b=sum;
        }
        return a;
    }
}
