package leet.methods._13_Math.L169;

public class Leet169_r3 {
    public int majorityElement(int[] nums) {
        int res = 0,cnt=0;
        //模拟栈 数字不同的时候弹出
        for (int num : nums) {
            if(cnt==0){
                res=num;
                cnt=1;
            }else {
                if(res==num){
                    cnt++;
                }else {
                    cnt--;
                }
            }
        }
        return res;
    }
}
