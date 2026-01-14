package leet.methods._9_DivideConquer.review.L50;

public class Leet50_r2 {
    public double myPow(double x, int n) {
        if(n<0){
            return mp(1/x,-n);
        }else {
            return mp(x,n);
        }
    }
    double mp(double x, int n){
        if(n==0)return 1;
        double res = mp(x,n>>2);
        res*=res;
        if((n&1)==1)res*=x;
        return res;
    }

    public double myPow_V2(double x, int n) {
        int res =1;
        long N = n;
        if(n<0){
            x=1/x;
            N=-n;
        }
        while (N>0){
            if((N&1)==1)res*=x;
            x*=x;
            n>>=1;
        }
        return res;
    }
}
