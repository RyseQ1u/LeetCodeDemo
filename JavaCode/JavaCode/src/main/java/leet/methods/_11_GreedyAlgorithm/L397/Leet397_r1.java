package leet.methods._11_GreedyAlgorithm.L397;

public class Leet397_r1 {
    public int integerReplacement(int n) {
        if(n==1)return 1;
        //偶数
        if(n%2==0){
            return 1+integerReplacement(n/2);
        }
        //避免溢出提前除2
        // 9 -> (9+1=10)/2 (9-1=8)/2 -> (5) (4)
        // (9/2) (9/2+1) -> (5) (4)
        return  2+Math.min(integerReplacement(n/2+1),integerReplacement(n/2));
    }
}
