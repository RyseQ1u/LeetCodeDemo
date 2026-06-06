package leet.methods._4_doublePointer.review.L151;

public class L151_r5 {
    public String reverseWords(String s) {
        s=s.trim();
        char[] res = new char[s.length()+1];
        int r=s.length()-1,l=r,index = 0;
        while (l>=0){
            while (l>=0 && s.charAt(l)!=' ')l--;
            for (int i = l+1; i < r+1 ; i++) {
                res[index++] =  s.charAt(i);
                if(i==r){
                    res[index++]=' ';
                }
            }
            while (l>=0 && s.charAt(l)==' ')l-- ;
            r=l;
        }
        return new String(res,0,index-1 );
    }
}
