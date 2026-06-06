package leet.methods._5_mock.review.L946;

/// 验证栈序列
public class L946_r3 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        //使用指针模拟
        int in =0,out =0,i=0;
        while (in<pushed.length){
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
