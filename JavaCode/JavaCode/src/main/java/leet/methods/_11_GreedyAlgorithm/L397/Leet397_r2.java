package leet.methods._11_GreedyAlgorithm.L397;

public class Leet397_r2 {
    public int integerReplacement(int n) {
        if(n==1)return 0;
        //是偶数
        if((n&1)==0){
            return 1+integerReplacement(n/2);
        }
        return 2+Math.min(integerReplacement(n/2+1),integerReplacement(n/2));
    }
}
