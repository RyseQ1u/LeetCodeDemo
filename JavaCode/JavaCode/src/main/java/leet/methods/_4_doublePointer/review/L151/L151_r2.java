package leet.methods._4_doublePointer.review.L151;

public class L151_r2 {
    public String reverseWords(String s) {
        //去掉两边的空格
        s=s.trim();
        char[] res = new char[s.length() + 1];
        int index = 0;
        //双指针从右往左遍历
        int r= s.length()-1,l=r;
        while (l>=0){
            //找到第一个空格的位置
            //abc ab  cba
            //       ^
            //       l  r
            while (l>=0 && s.charAt(l)!= ' ') l--;
            //截取字符串
            for (int i = l+1; i < r+1; i++) {
                res[index++] = s.charAt(i);
                if(i==r){
            //补充空格
            res[index++]=' ';

                }
            }
            //找到第一个字母的位置
            //abc ab  cba
            //     ^
            //    l/r
            while (l>=0 && s.charAt(l)==' ')l--;
            r=l;
        }
        return new String(res,0,index-1);
    }
}
