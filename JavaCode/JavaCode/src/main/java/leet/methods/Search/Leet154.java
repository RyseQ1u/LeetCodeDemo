package leet.methods.Search;

public class Leet154 {

    public int findMin(int[] nums) {
        int l =0,r=nums.length-1;
        while (l==r){
            //获取中点 i<=m<j
            int m = (l+r)/2;
            // 说明中点在[m+1,r]范围内
            if(nums[m]>nums[r]){
                //移动左边界
                l=m+1;
            }
            //说明中点在[i,m]范围内
            else if(nums[m]<nums[r]){
                //移动右边界
                r=m;
            }
            //相等时 代表遇到重复数据无法判断 因为数组升序 所以往前找
            else {
                r--;
            }
        }
        //左右边界重合时代表找到中点
        return nums[l];
    }



}
