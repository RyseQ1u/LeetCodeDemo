package leet.methods._3_hashTable.easy.review.L205;

public class L205_r1 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        //使用数组保存对应关系 ASCII 码表 长度 127
        int[] mapS = new int[127];
        int[] mapT = new int[127];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(mapS[sc]!=0 || mapT[tc]!=0){
                //已经存在对应关系
                if(mapS[sc]!=tc || mapT[tc]!=sc){
                    return false;
                }
            }
            //保存对应关系
            mapS[sc] = tc;
            mapT[tc] =sc;
        }
        return true;
    }
}
