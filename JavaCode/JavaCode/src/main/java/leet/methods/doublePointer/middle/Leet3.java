package leet.methods.doublePointer.middle;

import java.util.HashMap;
import java.util.Map;

public class Leet3 {


    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> dic = new HashMap<>();
        int i=-1,res=0,len=s.length();
        for (int j = 0; j < len; j++) {
            //判断是否重复
            if(dic.containsKey(s.charAt(j))){
                //更新左指针 i
                i = Math.max(i,dic.get(s.charAt(j)));
            }
            //更新哈希表
            dic.put(s.charAt(j),j);
            res = Math.max(res,j-i);
        }

        return  res;
    }


}
