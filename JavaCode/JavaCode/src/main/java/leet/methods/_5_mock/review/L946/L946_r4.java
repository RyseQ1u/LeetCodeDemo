package leet.methods._5_mock.review.L946;

/// 验证栈序列
public class L946_r4 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int in=0,out=0,i=0,n= popped.length;
        while (in<n){
            pushed[i++]=pushed[in];
            while (i>0 && pushed[i-1]==popped[out]){
                i--;
                out++;
            }
            in++;
        }
        return i==0;
    }
}
