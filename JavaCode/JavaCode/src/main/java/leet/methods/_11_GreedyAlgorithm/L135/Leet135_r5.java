package leet.methods._11_GreedyAlgorithm.L135;

public class Leet135_r5 {
    public int candy(int[] ratings) {
        //双向遍历
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i-1]<ratings[i]){
                left[i]=left[i-1]+1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i+1]<ratings[i]){
                right[i]=right[i+1]+1;
            }
        }
        int res = ratings.length;
        for (int i = 0; i < left.length; i++) {
            res+=Math.max(left[i],right[i]);
        }
        return res;
    }
}
