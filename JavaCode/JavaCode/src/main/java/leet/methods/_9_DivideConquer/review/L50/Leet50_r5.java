package leet.methods._9_DivideConquer.review.L50;

public class Leet50_r5 {
    public double myPow(double x, int n) {
        long m = n;
        if(n<0){
            m=-m;
            x=1/x;
        }
        return mp(x,m);
    }

    double mp(double x,long n){
        if(n==0)return 1;
        double res = mp(x,n>>1);
        res*=res;
        if((n&1)==1)res*=x;
        return res;
    }

    public double myPow_V2(double x, int n) {
        long m = n;
        if(n<0){
            m=-m;
            x=1/x;
        }
        double res = 1;
        while (m>0){
            if((m&1)==1)res*=x;
            x*=x;
            m>>=1;
        }
        return res;
    }
}
