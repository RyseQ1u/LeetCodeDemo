package leet.methods._11_GreedyAlgorithm.L135;

public class Leet135_r6 {
    public int candy(int[] ratings) {
        //双向遍历一次
        int n = ratings.length;
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        for (int i = 1; i < n; i++) {
            if(ratings[i]>ratings[i-1]){
                nums1[i]=nums1[i-1]+1;
            }
        }
        for (int i = n-1; i > 0; i--) {
            if(ratings[i-1]>ratings[i]){
                nums2[i-1]=nums2[i]+1;
            }
        }
        int res=n;
        for (int i = 0; i < n; i++) {
            res+=Math.max(nums1[i],nums2[i]);
        }
        return res;
    }
}
