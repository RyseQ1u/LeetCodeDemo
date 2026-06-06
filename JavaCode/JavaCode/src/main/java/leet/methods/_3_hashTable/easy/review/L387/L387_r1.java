package leet.methods._3_hashTable.easy.review.L387;

public class L387_r1 {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
