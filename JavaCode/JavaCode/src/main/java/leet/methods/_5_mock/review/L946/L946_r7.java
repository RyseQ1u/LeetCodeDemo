package leet.methods._5_mock.review.L946;

/// 验证栈序列
public class L946_r7 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0,j=0,n=popped.length;
        for (int num : pushed) {
            pushed[i++]=num;
            while ( j<n && pushed[i-1]==popped[j]){
                i--;
                j++;
            }
        }
        return i==0;
    }
}
