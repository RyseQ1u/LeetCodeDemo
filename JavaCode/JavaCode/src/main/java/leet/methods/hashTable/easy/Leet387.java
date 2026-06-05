package leet.methods.hashTable.easy;

import java.util.HashMap;

public class Leet387 {
    public int firstUniqChar(String s) {
        //返回对象
        int i = -1;
        //字母数组 用于记录字母出现次数
        int[] arr = new int[26];
        char[] cArr = s.toCharArray();
        for (char c : cArr){
            arr[c-'a']++;
        }
        for (int j = 0; j < cArr.length; j++) {
            if(arr[cArr[j]-'a']==1){
                i=j;
                break;
            }
        }
        return i;
    }
}
