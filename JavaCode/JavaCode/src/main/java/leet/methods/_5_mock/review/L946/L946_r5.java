package leet.methods._5_mock.review.L946;

/// 验证栈序列
public class L946_r5 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0;
        for (int num : pushed) {
            pushed[i++]=num;
            while (i>0&&pushed[i-1]==pushed[j]){
                i--;
                j++;
            }
        }
        return i==0;
    }
}
