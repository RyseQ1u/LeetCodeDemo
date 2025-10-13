package leet.Daily.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Leet2273 {

    /**
     * 去除相邻的异或字符串
     * @param words
     * @return
     */
    public List<String> removeAnagrams(String[] words) {
        char[] last = words[0].toCharArray();
        Arrays.sort(last);
        int j =1;
        for (int i = 0; i < words.length; i++) {
            char[] cur = words[i].toCharArray();
            Arrays.sort(cur);
            if(!Arrays.equals(last,cur)){
                last=cur;
                words[j++]=words[i];
            }
        }
        return Arrays.asList(Arrays.copyOf(words,j));
    }

    /**
     * 优化 使用数组进行hash
     * @param words
     * @return
     */
    public List<String> removeAnagrams_V2(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for (int i = 0; i < words.length; i++) {
            if(!sameStr(words[i],res.get(res.size()-1))){
                res.add(words[i]);
            }
        }
        return res;
    }

    private int[] sameArr = new int[26];
    private boolean sameStr(String s1,String s2){
        Arrays.fill(sameArr,0);
        //长度对比
        if(s1.length()!=s2.length()){
            return false;
        }
        //统计字符
        for (int i = 0; i < s1.length(); i++) {
            sameArr[s1.charAt(i)-'a']++;
        }
        for (int i = 0; i <s2.length() ; i++) {
            int n = s1.charAt(i)-'a';
            sameArr[n]--;
            if(sameArr[n]<0)return false;
        }

        return true;
    }
}
