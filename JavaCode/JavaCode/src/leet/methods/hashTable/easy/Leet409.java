package leet.methods.hashTable.easy;

import java.util.HashMap;
import java.util.Map;

public class Leet409 {

    /**
     * 使用数组优化
     * @param s
     * @return
     */
    public int longestPalindrome2(String s) {
        int len = s.length();
        int sum=0;
        //判断是否有奇数
        boolean hasOdd=false;
        int[] count = new int[128];
        for(int i =0;i<len;i++){
            count[s.charAt(i)]++;
        }
        for(int x:count){
            sum+=x/2*2;
            if(!hasOdd&&x%2==1){
                sum++;
                hasOdd=true;
            }
        }
        return sum;
    }
    public int longestPalindrome(String s) {
        int res =0;
        //判断是否有奇数
        boolean hasOdd=false;
        //记录字母出现频率
        HashMap<Character, Integer> kvs = new HashMap<>();
        for (char c :s.toCharArray()){
            kvs.merge(c,1,(a,b)->a+b);
        }
        for (Map.Entry<Character, Integer> kv : kvs.entrySet()) {
            // 将当前字符出现次数向下取偶数，并计入 res
            int count = kv.getValue();
            int rem = count % 2;
            res += count - rem;
            // 若当前字符出现次数为奇数，则将 hasOdd 置 true
            if (hasOdd || rem == 1) hasOdd = true;
        }
        return hasOdd ? res+1 : res;
    }


}
