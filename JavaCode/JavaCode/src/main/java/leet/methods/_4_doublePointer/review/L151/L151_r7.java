package leet.methods._4_doublePointer.review.L151;

public class L151_r7 {
    public String reverseWords(String s) {
        char[] res = new char[s.length() + 1];
        s = s.trim();
        int r = s.length() - 1, l = r, index = 0;
        while (l >= 0) {
            //找空格
            while (l >= 0 && s.charAt(l) != ' ') l--;
            for (int i = l + 1; i <= r; i++) {
                res[index++] = s.charAt(i);
                if (i == r) res[index++] = ' ';
            }
            //找字符
            while (l >= 0 && s.charAt(l) == ' ') l--;
            r = l;
        }
        return new String(res, 0, index - 1);
    }
}
