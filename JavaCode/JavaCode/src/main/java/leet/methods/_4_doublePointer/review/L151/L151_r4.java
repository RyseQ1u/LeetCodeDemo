package leet.methods._4_doublePointer.review.L151;

public class L151_r4 {
    public String reverseWords(String s) {
        //去空格
        s=s.trim();
        //倒序遍历
        char[] res = new char[s.length() + 1];
        int index = 0;
        int r = s.length()-1,l=r;
        while (l>=0){
            //寻找第一个空格所在索引
            while (l>=0 && s.charAt(l) != ' ' )l--;
            //切割字符串
            for (int i = l+1; i < r+1; i++) {
                res[index++] = s.charAt(i);
                if(i==r){
                    res[index++] = ' ';
                }
            }
            //寻找下一个单词
            while (l>=0 && s.charAt(l)== ' ')l--;
            r=l;
        }
        return new String(res,0,index-1);
    }
}
