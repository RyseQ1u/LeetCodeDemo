package leet.methods._11_GreedyAlgorithm.L135;

public class Leet134_r3 {
    public int candy(int[] ratings) {
        //双向遍历贪心
        int n = ratings.length,res=0;
        int[] left = new int[n],right = new int[n];
        for (int i = 1; i < n; i++) {
            if(ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }
        }
        for (int i = n-1; i > 0; i--) {
            if(ratings[i-1]>ratings[i]){
                right[i-1]=right[i]+1;
            }
        }
        for (int i = 0; i < n; i++) {
            res+=Math.max(left[i],right[i]);
        }
        return res+n;
    }
}
