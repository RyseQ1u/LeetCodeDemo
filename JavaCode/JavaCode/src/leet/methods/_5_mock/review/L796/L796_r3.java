package leet.methods._5_mock.review.L796;

public class L796_r3 {
    public boolean rotateString(String s, String goal) {
        return s.length() ==goal.length() &&   (s+s).contains(goal);
    }
}
