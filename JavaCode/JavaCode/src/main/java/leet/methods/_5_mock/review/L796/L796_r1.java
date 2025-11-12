package leet.methods._5_mock.review.L796;

public class L796_r1 {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        s+=s;
        int n = goal.length();
        for (int i = 0; i < s.length()-n; i++) {
            int j = 0;
            // 检查从位置i开始的子串是否匹配goal
            while (j < n && s.charAt(i + j) == goal.charAt(j)) {
                j++;
            }
            if (j == n) return true;
        }
        //简单写法
//        return  s.length()==goal.length() && (s+s).contains(goal);
        return false;
    }
}
