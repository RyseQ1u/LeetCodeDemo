package leet.Daily.easy;

public class Leet3024 {

    public String triangleType(int[] nums) {
        //判断是否能成为三角形
        if(nums.length!=3 || nums[0]+nums[1]<=nums[2] || nums[1]+nums[2]<=nums[0]||nums[2]+nums[0]<=nums[1]){
            return "none";
        }
        //等腰判断
        if(nums[0]==nums[1]){
            //等边判断
            if(nums[1]==nums[2]){
                return "equilateral";
            }else {
                return "isosceles";
            }
        } else if (nums[2]==nums[1]) {
            return "isosceles";
        }else if (nums[2]==nums[0]) {
            return "isosceles";
        }else {
            return "scalene";
        }

    }

}
