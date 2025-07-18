package leet.methods._10_Dynamic;

/**
 * 斐波那契数列
 */
public class Leet509 {
    /**
     * 递归
     */
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        return fib(n-1)+fib(n-2);
    }

    /**
     * 循环
     */
    public int fib_2(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        int[] res = new int[n];
        //设置前两位的值
        res[0]=0;
        res[1]=1;
        for (int i = 2; i < n; i++) {
            res[i] = res[i-1] + res[i-2];
        }
        return res[n-1];
    }
}
