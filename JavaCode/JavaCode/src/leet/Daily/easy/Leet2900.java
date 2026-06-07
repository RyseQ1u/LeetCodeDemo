package leet.Daily.easy;

import java.util.ArrayList;
import java.util.List;

public class Leet2900 {

    /**
     * 贪心法 获取 010101 间隔最长子数组
     * @param words
     * @param groups
     * @return
     */
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        //记录上一个元素的值
        int last = -1;
        List<String> list = new ArrayList();
        for(int i = 0 ; i < groups.length;i++){
            if(groups[i] != last){
                list.add(words[i]);
                last = groups[i];
            }
        }
        return list;
    }

}
