package leet.methods._5_mock.review.L6;

import java.util.ArrayList;
import java.util.List;

public class L6_r3 {
    public String convert(String s, int numRows) {
        if(numRows<2) return s;
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder()) ;
        }
        int flag = -1,index =0;
        for (int i = 0; i < s.length(); i++) {
            list.get(index).append( s.charAt(i));
            if(index==0 || index==numRows-1){
                flag*=-1;
            }
            index+=flag;
        }
        StringBuilder sb = list.get(0);
        for (int i = 1; i < numRows; i++) {
            sb.append(list.get(i).toString());
        }
        return sb.toString();
    }
}
