package leet.methods.Search;

public class Leet287 {

    public int findDuplicate(int[] nums) {
        //快慢指针
        int slow =0;
        int fast =0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        //当快慢指针 相遇时代表有环
        while (slow!=fast){
            //慢指针走一步
            slow=nums[slow];
            //快指针走两步
            fast=nums[nums[fast]];
        }
        //慢指针从0开始出发 将会和快指针在环入口相遇
        int si = 0;
        int fi = fast;
        while (si != fi){
            //步长相同
            si = nums[si];
            fi = nums[fi];
        }
        return si;
    }

    /**
     * 二进制
     */
    public int findDuplicate_v2(int[] nums) {
        int n = nums.length - 1, result = 0;
        for (int bit = 0; bit < 32; bit++) {
            int mask = 1 << bit; // 当前位掩码
            int countExpected = 0, countActual = 0;
            for (int i = 1; i <= n; i++)
                if ((i & mask) != 0) countExpected++; // 预期1的个数
            for (int num : nums)
            if ((num & mask) != 0) countActual++; // 实际1的个数
            if (countActual > countExpected)
                result |= mask; // 若实际>预期，该位为1
        }
        return result;
    }


}
