package leet.methods._11_GreedyAlgorithm.L11;

public class Leet11_r7 {
    public int maxArea(int[] height) {
        //双指针
        int n=height.length, l=0,r=n-1,res=0;
        while (l<r){
            if(height[l]>height[r]){
                res=Math.max(res,(height[r]*(r-l)));
                r--;
            }else {
                res=Math.max(res,(height[l]*(r-l)));
                l++;
            }
        }
        return res;
    }
}
