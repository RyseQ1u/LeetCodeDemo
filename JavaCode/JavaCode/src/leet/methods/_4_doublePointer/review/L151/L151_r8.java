package leet.methods._4_doublePointer.review.L151;

public class L151_r8 {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length(), r = n - 1, l = r, i = 0;
        char[] res = new char[n + 1];
        while (l >= 0) {
            while (l >= 0 && s.charAt(l) != ' ') l--;
            for (int j = l + 1; j <= r; j++) {
                res[i++] = s.charAt(j);
                if (j == r) res[i++] = ' ';
            }
            while (l >= 0 && s.charAt(l) == ' ') l--;
            r = l;
        }
        return new String(res, 0, i - 1);
    }
}
