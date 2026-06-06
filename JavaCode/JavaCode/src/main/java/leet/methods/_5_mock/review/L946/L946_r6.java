package leet.methods._5_mock.review.L946;

/// 验证栈序列
public class L946_r6 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i =0 ,j=0;
        for (int num : pushed) {
            pushed[i++]=num;
            while (j<popped.length && pushed[i-1]==popped[j]){
                i--;
                j++;
            }
        }
        return i==0;
    }
}
