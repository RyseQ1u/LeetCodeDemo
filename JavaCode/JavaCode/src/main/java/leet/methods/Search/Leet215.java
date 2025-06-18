package leet.methods.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Leet215 {

    /**
     * 计数排序
     */
    public int findKthLargest(int[] nums, int k) {
        int[] arr =new int[20001];
        for (int num : nums) {
            //处理负数
            arr[num+10000]++;
        }
        //倒序找第k大
        for (int i = arr.length - 1; i >= 0; i--) {
            //减去个数
            k-=arr[i];
            if(k<=0) return i-10000;
        }
        return -1;
    }

    /**
     * 快速排序
     */
    public int findKthLargest_V2(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return quickSort(list,k);
    }

    public int quickSort(List<Integer> nums,int k){
        //使用随机数选择
        Random random = new Random();
        //中点
        int pivot = nums.get(random.nextInt(nums.size()));
        //分类
        ArrayList<Integer> big = new ArrayList<>();
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> equl = new ArrayList<>();
        for (Integer num : nums) {
            if(pivot<num){
                big.add(num);
            }else if(pivot>num){
                small.add(num);
            }else {
                equl.add(num);
            }
        }
        //判断k范围
        if(k <= big.size()){
            //目标元素在big数组范围内
            return quickSort(big,k);
        }else if(nums.size() - small.size() < k){
            //目标元素在small范围内
            return quickSort(small,k - (nums.size()-small.size()));
        }else {
            //目标为中点
            return pivot;
        }
    }

}
