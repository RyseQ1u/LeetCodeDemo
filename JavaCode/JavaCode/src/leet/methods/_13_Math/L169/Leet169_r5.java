package leet.methods._13_Math.L169;

public class Leet169_r5 {
    public int majorityElement(int[] nums) {
        //模拟栈 多数元素一定会剩下
        int res = nums[0],cnt=1;
        for (int i = 1; i < nums.length; i++) {
            if(cnt==0){
                res =  nums[i];
                cnt=1;
            }else {
                if(res==nums[i]){
                    cnt++;
                }else {
                    cnt--;
                }
            }
        }

        return res;
    }
}
