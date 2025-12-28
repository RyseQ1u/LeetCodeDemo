package leet.methods._5_mock.review.L6;

import java.util.ArrayList;
import java.util.List;

public class L6_r6 {
    public String convert(String s, int numRows) {
        if(numRows<2) return s;
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int flag = -1, row=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(row==0||row==numRows-1){
                flag*=-1;
            }
            list.get(row).append(c);
            row+=flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : list) {
            res.append(sb);
        }
        return res.toString();
    }
}
