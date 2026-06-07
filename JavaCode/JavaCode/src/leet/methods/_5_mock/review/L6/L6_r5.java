package leet.methods._5_mock.review.L6;

import java.util.ArrayList;

public class L6_r5 {
    public String convert(String s, int numRows) {
        if(numRows<=1) return s;
        ArrayList<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int flag = -1,r=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(r == 0 || (r+1)%numRows == 0) flag*=-1;
            list.get(r).append(c);
            r+=flag;
        }
        StringBuilder sb = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
