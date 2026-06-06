package leet.methods._5_mock.review.L6;

public class L6_r1 {
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        int n = s.length();
        char[][] chars = new char[numRows][n];
        int row = 0, col = 0, flag = -1;

        for (int i = 0; i < n; i++) {
            chars[row][col] = s.charAt(i);
            if (row == 0 || row == numRows - 1) {
                flag *= -1;
            }

            if (row != 0 || row != numRows - 1) {
                col++;
            }
            row += flag;
        }
        StringBuilder sb = new StringBuilder();
        for (char[] aChar : chars) {
            for (char c : aChar) {
                if (c != 0) sb.append(c);
            }
        }
        return sb.toString();
    }
}
