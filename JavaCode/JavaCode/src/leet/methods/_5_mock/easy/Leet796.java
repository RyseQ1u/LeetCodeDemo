package leet.methods._5_mock.easy;

public class Leet796 {

    /**
     * 拼接字符串
     * @param s
     * @param goal
     * @return
     */
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (goal + goal).contains(s);
    }
}
