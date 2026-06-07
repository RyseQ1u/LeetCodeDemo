package leet.methods._11_GreedyAlgorithm.L11;

public class Leet11_r5 {
    public int maxArea(int[] height) {
        //双指针
        int res = 0,l=0,r=height.length-1;
        while (l<r){
            if(height[l]<height[r]){
                res =Math.max(height[l]*(r-l),res);
                l++;
            }else {
                res=Math.max(height[r]*(r-l),res);
                r--;
            }
        }
        return res;
    }
}
