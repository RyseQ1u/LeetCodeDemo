package leet.methods.mock.middle;

import java.util.ArrayList;

public class Leet6 {


    /**
     * 模拟分排
     */
    public String convert(String s, int numRows) {
        //不用分的情况
        if(numRows < 2) return s;
        //根据行创建对应数量的字串
        ArrayList<StringBuilder> rows = new ArrayList<>();
        //初始化
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int i = 0,n=-1;
        //遍历插入数据
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            //判断是否为中间列
            if(i==0 || i==numRows-1){
                n = -n;
            }
            i+=n;
        }
        //构建返回结果
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows) res.append(row);
        return res.toString();
    }
}


