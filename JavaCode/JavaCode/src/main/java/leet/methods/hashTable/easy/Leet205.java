package leet.methods.hashTable.easy;

public class Leet205 {


    //使用数组
    public boolean isIsomorphic(String s, String t) {
        boolean flag = true;
        //转换字符数组
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        //统计映射关系
        int[] sFreq = new int[127];
        int[] tFreq = new int[127];
        for (int i = 0; i < sArr.length; i++) {
            int si = sArr[i];
            int ti = tArr[i];
            if (sFreq[si] != 0 && sFreq[si] != ti || tFreq[ti] != 0 && tFreq[ti] != si) {
                return false;
            }
            sFreq[si] = ti;
            tFreq[ti] = si;

        }

        return flag;
    }

//    public boolean isIsomorphic(String s, String t) {
//        boolean flag = true;
//        //转换字符数组
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//        //统计出现个数
//        int[] sFreq = new int[26];
//        int[] tFreq = new int[26];
//        for (int i = 0; i < sArr.length; i++) {
//            int si = sArr[i]-'a';
//            int ti = tArr[i]-'a';
//            if(sFreq[si] != tFreq[ti]){
//                flag=false;
//                break;
//            }
//            sFreq[si]++;
//            tFreq[ti]++;
//
//        }
//        return flag;
//    }
}
