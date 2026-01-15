package leet.methods._9_DivideConquer.review.L50;

public class Leet50_r3 {
    public double myPow(double x, int n) {
        long N = n;
        if(n<0){
            x=1/x;
            N=-N;
        }
        return mp(x,N);
    }
    private double mp(double x,long n){
        if(n==0)return 1;
        double res = mp(x,n>>1);
        res*=res;
        if((n&1)==1){
            res*=x;
        }
        return res;
    }

    public double myPow_V2(double x, int n) {
        if(n<0){
            x=1/x;
            n=-n;
        }
        int res = 1;
        while (n>0){
            if((n&1)==1) res *= x;
            res*=res;
            n>>=1;
        }
        return res;
    }
}
