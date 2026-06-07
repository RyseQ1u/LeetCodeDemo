package leet.methods._4_doublePointer.review.L151;

public class L151_r6 {
    public String reverseWords(String s) {
        s = s.trim();
        if (s.isEmpty()) return s;
        int n = s.length() - 1, l = n, r = n, index = 0;
        char[] res = new char[n + 2];
        while (l >= 0) {
            //找到第一个空格
            while (l >= 0 && s.charAt(l) != ' ') l--;
            for (int i = l+1; i <= r; i++) {
                res[index++] = s.charAt(i);
                if(i==r) res[index++]=' ';
            }
            //找到下一个字母
            while (l>=0 && s.charAt(l)==' ')l--;
            r=l;
        }
        return new String(res,0,index-1);
    }
}
