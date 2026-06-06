package leet.methods._5_mock.review.L6;

import java.util.ArrayList;

public class L6_r7 {
    public String convert(String s, int numRows) {
        if(numRows<2)return s;
        ArrayList<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int row = 0,flag = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(row==0 || row==numRows-1)flag*=-1;
            StringBuilder sb = list.get(row);
            sb.append(c);
            row+=flag;
        }
        StringBuilder res = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            res.append(list.get(i));
        }
        return res.toString();
    }
}
