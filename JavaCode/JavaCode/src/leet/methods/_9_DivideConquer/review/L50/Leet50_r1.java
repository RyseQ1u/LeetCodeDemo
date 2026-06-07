package leet.methods._9_DivideConquer.review.L50;

public class Leet50_r1 {

    public double myPow(double x, int n) {
        if(n<0){
            return mp(1/x,-(long) n);
        }
        return mp(x,n);
    }
    double mp(double x,long n){
        if (n == 0) {
            return 1;
        }
        double res = mp(x, n >> 1);
        res *= res;
        if ((n & 1) == 1) {
            res *= x;
        }
        return res;
    }

    public double myPow_V2(double x, int n) {
        double res =1;
        //避免溢出
        long N = n;
        if(n<0){
            x = 1/x;
            N=-N;
        }
        while (N>0){
            if((N&1)==1){
                res*=x;
            }
            x*=x;
            N>>=1;
        }
        return res;
    }
}
