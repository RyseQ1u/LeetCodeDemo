package leet.Daily.easy;

import leet._class.linklist.ListNode;

import java.util.Arrays;

public class Leet2255 {


    public int countPrefixes(String[] words, String s) {
        int res =0;
        //遍历数组 比较位上的字符
        boolean[] flag = new boolean[words.length];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < words.length; j++) {
                if(flag[j] ) continue;
                if(words[j].length()>s.length()) {
                    flag[j]=true;
                    continue;
                }
                if(words[j].length()>i){
                   if(c == words[j].charAt(i)){
                       flag[j]=false;
                   }else {
                       flag[j]=true;
                   }
                }
            }
        }
        for (boolean b : flag) {
            if (!b) res++;
        }
        return res;
    }



}
