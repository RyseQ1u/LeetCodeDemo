package leet.methods._6_Search.review.L724;

/// 寻找数组的中心下标
/// index 左边的和 等于 右边的和
public class Leet724_r8 {
    public int pivotIndex(int[] nums) {
        int res =-1,cnt=0,curCnt=0;
        for (int num : nums) {
            cnt+=num;
        }
        for (int i = 0; i < nums.length; i++) {
            if(curCnt*2 == cnt - nums[i]){
                return i;
            }
            curCnt+=nums[i];
        }
        return -1;
    }
}
