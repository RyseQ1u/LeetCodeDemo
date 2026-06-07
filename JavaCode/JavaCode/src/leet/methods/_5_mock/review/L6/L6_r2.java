package leet.methods._5_mock.review.L6;

import java.util.ArrayList;

public class L6_r2 {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        ArrayList<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int row = 0,step = -1;
        for (int i = 0; i < s.length(); i++) {
            list.get(row).append(s.charAt(i));
            if(row == 0 || row == numRows-1){
                step*=-1;
            }
            row+=step;
        }
        StringBuilder res = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            res.append(list.get(i).toString());
        }
        return res.toString();
    }
}
