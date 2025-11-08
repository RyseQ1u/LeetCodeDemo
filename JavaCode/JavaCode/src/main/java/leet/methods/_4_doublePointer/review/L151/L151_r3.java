package leet.methods._4_doublePointer.review.L151;

public class L151_r3 {
    public String reverseWords(String s) {
        s = s.trim();
        //从后往前遍历
        int r = s.length() - 1, l = r;
        char[] res = new char[s.length() + 1];
        int index = 0;
        while (l >= 0) {
            //找到第一个空格
            while (l >= 0 && s.charAt(l) == ' ') l--;
            //开始切割字符串
            for (int i = l + 1; i < r + 1; i++) {
                res[index++] = s.charAt(i);
                if (i == r) {
                    res[index++] = ' ';
                }
            }
            //找到第一个字符
            while (l >= 0 && s.charAt(l) != ' ') l--;
            r=l;
        }
        return new String(res,0,index-1);
    }
}
