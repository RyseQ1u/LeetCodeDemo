package leet.methods.doublePointer.easy;

import java.util.HashMap;
import java.util.Map;

public class Leet392 {


    /**
     * 使用双指针
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        //空集是子集直接返回true
        if(s.length()==0)return true;
        for (int i = 0,j=0; j < t.length(); i++) {
            //比较字符
            if(s.charAt(i)==t.charAt(i)){
                //判断s是否已经匹配完
                if(++i==s.length()){
                    return  true;
                }
            }
        }
        return false;
    }



}
