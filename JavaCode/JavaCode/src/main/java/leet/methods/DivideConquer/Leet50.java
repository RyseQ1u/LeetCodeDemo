package leet.methods.DivideConquer;

public class Leet50 {


    /**
     * 快速幂运算
     */
    public double myPow(double x, int N) {
        double res = 1;
        //避免溢出
        long n = N;
        //让保持n>0
        if(n<0){
            n = -n;
            x = 1/x;
        }
        //快速幂运算
        while (n!=0){
            if((n&1)==1){
                res*=x;
            }
            x*=x;
            n>>=1;
        }
        return res;
    }
}
