package leet.methods._12_BitManipulation;

/**
 * 位1的个数
 */
public class Leet191 {

    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res+=n%2;
            n/=2;
        }
        return res;
    }
}
