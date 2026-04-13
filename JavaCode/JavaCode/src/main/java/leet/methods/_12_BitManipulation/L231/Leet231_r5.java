package leet.methods._12_BitManipulation.L231;

public class Leet231_r5 {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n &(n-1))==0;
    }
}
