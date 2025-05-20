package leet.Daily.middle;

/**
 * 差分数组
 */
public class Leet3355 {


    /**
     * 差分数组+前缀和
     * @param nums
     * @param queries
     * @return
     */
    public boolean isZeroArray_V2(int[] nums, int[][] queries){
        int n=nums.length;
        //差分数组
        int[]diff=new int[n];
        diff[0]=nums[0];
        for(int i=n-1;i>0;i--){
            diff[i]=nums[i]-nums[i-1];
        }
        for(int[]q:queries){
            diff[q[0]]--;
            if(q[1]+1<n){
                diff[q[1]+1]++;
            }
        }
        //计算前缀和
        int pre=0;
        for(int d:diff){
            pre+=d;
            if(pre>0){
                return false;
            }
        }
        return true;
    }

    /**
     * 暴力 超时
     * @param nums
     * @param queries
     * @return
     */
    public boolean isZeroArray_V1(int[] nums, int[][] queries) {
        int[] sum = new int[nums.length];
        for (int[] query : queries) {
            int s = query[0],e=query[query.length-1];
            if(s==e){
                sum[s]++;
                continue;
            }
            for (int i = s; i <= e; i++) {
                sum[i]++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0 &&  nums[i]!=sum[i]){
                return false;
            }
        }
        return true;
    }

}
