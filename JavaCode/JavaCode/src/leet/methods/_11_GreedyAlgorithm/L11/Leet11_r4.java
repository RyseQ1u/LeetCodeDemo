package leet.methods._11_GreedyAlgorithm.L11;

public class Leet11_r4 {
    public int maxArea(int[] height) {
        //双指针
        int l=0,r=height.length-1,res=0;
        while (l<r){
            if(height[l]>height[r]){
                res=Math.max(height[r]*(r-l),res);
                r--;
            }else {
                res = Math.max(height[l]*(r-l),res);
                l++;
            }
        }
        return res;
    }
}
