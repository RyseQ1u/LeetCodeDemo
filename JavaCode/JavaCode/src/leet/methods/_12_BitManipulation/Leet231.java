package leet.methods._12_BitManipulation;

/**
 * 2 的幂
 */
public class Leet231 {

    public boolean isPowerOfTwo(int n) {
        int tmp = 1;
        while (tmp<n){
            tmp = tmp<<1;
            if(tmp==n){
                return true;
            }
        }
        return false;
    }
    public boolean isPowerOfTwo_V2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
