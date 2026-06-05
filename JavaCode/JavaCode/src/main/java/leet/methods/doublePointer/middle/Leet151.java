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

    /**
     * 双指针切割
     * @param s
     * @return
     */
    public String reverseWords2(String s) {
        // 删除首尾空格 从第一个单词开始
        s = s.trim();
        int right = s.length() - 1, left = right;
        StringBuilder res = new StringBuilder();
        while (left >= 0) {
            // 搜索首个空格
            while (left >= 0 && s.charAt(left) != ' ') left--;
            // 添加单词
            res.append(s.substring(left + 1, right + 1) + " ");
            // 跳过单词间空格 找到下一个单词
            while (left >= 0 && s.charAt(left) == ' ') left--;
            // right 指向下个单词的尾字符
            right = left;
        }
        // 转化为字符串并返回
        return res.toString().trim();
    }
}
