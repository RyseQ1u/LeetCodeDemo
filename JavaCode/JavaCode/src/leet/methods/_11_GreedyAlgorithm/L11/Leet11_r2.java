package leet.methods._11_GreedyAlgorithm.L11;

public class Leet11_r2 {
    public int maxArea(int[] height) {
        //二分 移动较小值
        int left = 0,right=height.length-1,res=0;
        while (left<right){
            int len = right-left;
            if(height[left]>height[right]){
                res=Math.max(res,len*height[right]);
                right--;
            }else {
                res=Math.max(res,len*height[left]);
                left++;
            }
        }
        return res;

    }
}
