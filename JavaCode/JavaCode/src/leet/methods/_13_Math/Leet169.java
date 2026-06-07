package leet.methods._13_Math;

/**
 * 多数元素
 */
public class Leet169 {

    public int majorityElement(int[] nums) {
        int major = 0, cnt = 0;
        //遍历元素，相同数字计数+1 不同数字计数-1
        for (int num : nums) {
            //当计数为0时 假设当前值为从数
            if (cnt == 0) {
                major = num;
                cnt = 1;
            } else {
                //当计数不为0时 判断进行+-操作
                cnt += major == num ? 1 : -1;
            }
        }
        return major;
    }
}
