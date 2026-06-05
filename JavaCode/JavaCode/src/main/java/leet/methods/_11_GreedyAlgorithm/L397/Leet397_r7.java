package leet.methods._11_GreedyAlgorithm.L397;

public class Leet397_r7 {
    public int integerReplacement(int n) {
        if((n&1)==0){
            return  integerReplacement(n/2)+1;
        }
        return  Math.min(integerReplacement(n/2+1),integerReplacement(n/2)) + 2;
    }
}
