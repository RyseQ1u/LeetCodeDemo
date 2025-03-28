package leet.Daily.easy;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Stack;

public class Leet2716 {


    /**
     * 利用数组优化
     * @param s
     * @return
     */
    public int minimizedStringLength(String s) {
        int[] repeat=new int[26];
        int res=0;
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()){
           int i = c-'a';
            if(repeat[i]==0){
                repeat[i]=1;
                res++;
            }
        }

        return  res;
    }

    public int minimizedStringLength_V1(String s) {

        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()){
            set.add(c);
        }
        return  set.size();
    }

}
