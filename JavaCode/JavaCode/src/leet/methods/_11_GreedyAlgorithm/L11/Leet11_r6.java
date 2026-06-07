package leet.methods._11_GreedyAlgorithm.L11;

public class Leet11_r6 {
    public int maxArea(int[] height) {
        //双指针
        int l =0,r = height.length-1,max=0;
        while (l<r){
            if(height[l]>height[r]){
                max=Math.max(max,height[r]*(r-l));
                r--;
            }else {
                max=Math.max(max,height[l]*(r-l));
                l++;
            }
        }
        return max;
    }
}
