package leet.methods.hashTable.easy;

public class Leet242 {
    public boolean isAnagram(String s, String t) {
        //构建返回对象
        boolean flag = true;
        //用数组存储存在的字母字符
        int[] sArr = new int[26];
        int[] tArr = new int[26];
        //转字符串为数组
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            sArr[sCharArr[i] - 'a']++;
            tArr[tCharArr[i] - 'a']++;

        }
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }
        return flag;

    }

    /**
     * 优化空间 使用一个数组
     * 用s数组的字符数量 减去t数组的字符数量 如果出现负数可以提前返回
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t) {
        //构建返回对象
        boolean flag = true;
        //用数组存储存在的字母字符
        int[] sArr = new int[26];
        //转字符串为数组
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < sCharArr.length; i++) {
            sArr[sCharArr[i] - 'a']++;
        }
        for (int i = 0; i < tCharArr.length; i++) {
            sArr[tCharArr[i] - 'a']--;
            if (sArr[tCharArr[i] - 'a'] < 0) {
                return false;
            }
        }
        return flag;

    }
}
