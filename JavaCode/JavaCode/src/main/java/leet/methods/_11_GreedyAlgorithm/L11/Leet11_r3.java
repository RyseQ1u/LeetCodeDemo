package leet.methods._11_GreedyAlgorithm.L11;

public class Leet11_r3 {
    public int maxArea(int[] height) {
        //双指针，移动最小值
        int max=0, n= height.length, l=0,r=n-1;
        while (l<r){
            if(height[l]>height[r]){
                max=Math.max(max,(height[r])*(r-l))        ;
                r--;
            }else {
                max=Math.max(max,height[l]*(r-l));
                l++;
            }
        }
        return max;
    }
}
