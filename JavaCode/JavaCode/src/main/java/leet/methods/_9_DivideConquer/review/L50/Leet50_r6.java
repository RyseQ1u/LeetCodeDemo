package leet.methods._9_DivideConquer.review.L50;

public class Leet50_r6 {
    public double myPow(double x, int n) {
        long m =n;
        if(n<0){
            m=-m;
            x=1/x;
        }
        return mp(x,m);
    }
    double mp(double x,long n){
        if(n==0)return 1;
        else if(n==1)return x;
        double half=mp(x,n>>1);
        if((n&1)==0){
            return half*half;
        }else {
            return half*half*x;
        }
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
