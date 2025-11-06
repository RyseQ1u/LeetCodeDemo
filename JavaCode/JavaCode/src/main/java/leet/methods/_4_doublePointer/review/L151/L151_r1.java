package leet.methods._4_doublePointer.review.L151;

public class L151_r1 {
    public String reverseWords(String s) {
        s =s.trim();
        //从又往前遍历
        int r = s.length()-1,l=r;
        char[] res = new char[s.length() + 1];
        int start = 0;
        while (l>=0){
            //找到第一空格开始切割
            while (l>=0 && s.charAt(l) !=' ') l--;
            //切割字符串
            for (int i = l+1; i < r+1; i++) {
                res[start++] = s.charAt(i);
                if(i==r){
                    res[start++]=' ';
                }
            }
            //找到最后一个空格 移动右指针
            while (l>=0 && s.charAt(l) == ' ')l--;
            r=l;
        }
        if(start==0)return "";

        return new String(res,0,start-1);
    }

}
