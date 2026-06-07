package leet.methods._11_GreedyAlgorithm.L135;

public class Leet135_r2 {
    public int candy(int[] ratings) {
        //双向贪心
        int res=0,n=ratings.length;
        int[] left = new int[n],right = new int[n];
        for (int i = 0; i < n-1; i++) {
            if(ratings[i+1]>ratings[i]){
                left[i+1]=left[i]+1;
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
