package leet.methods._5_mock.review.L6;

import java.util.ArrayList;

public class L6_r8 {
    public String convert(String s, int numRows) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int r = 0,diff=-1;
        for (int i = 0; i < s.length(); i++) {
            list.get(r).append(s.charAt(i));
            if(r==numRows-1 || r==0){
                diff*=-1;
            }
            r+=diff;
        }
        for (int i = 1; i < list.size(); i++) {
            list.get(0).append(list.get(i));
        }
        return list.get(0).toString();
    }
}
