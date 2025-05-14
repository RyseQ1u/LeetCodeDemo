package leet.methods.doublePointer.middle;

import com.sun.xml.internal.ws.util.StringUtils;

public class Leet151 {

    /**
     * //去重 切割 倒序遍历
     * @param s
     * @return
     */
    public String reverseWords(String s) {

        String[] s1 = s.trim().split(" ");
        StringBuilder s2 = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--) {
            if(s1[i].isEmpty())continue;
            s2.append(s1[i]+ " ");
        }
        return s2.toString().trim();
    }


}
