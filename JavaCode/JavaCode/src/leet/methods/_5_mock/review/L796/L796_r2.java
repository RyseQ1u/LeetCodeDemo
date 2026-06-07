package leet.methods._5_mock.review.L796;

public class L796_r2 {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length())return false;
        s+=s;
        int gl = goal.length();
        for (int i = 0; i < s.length()-gl; i++) {
            int c = 0;
            for (int j = 0; j < gl; j++) {
                if(s.charAt(i+j)==goal.charAt(j)){
                    c++;
                }else {
                    break;
                }
            }
            if(c==gl)return true;
        }
        return false;
    }
}
