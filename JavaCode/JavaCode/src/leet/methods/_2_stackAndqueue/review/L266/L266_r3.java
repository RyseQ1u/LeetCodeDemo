package leet.methods._2_stackAndqueue.review.L266;

public class L266_r3 {
    public boolean canPermutePalindrome(String s) {
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i++) {
                map[s.charAt(i)]++;
        }
        int oddCount=0;
        for (int i : map) {
            if((i&1)==1){
                oddCount    ++;
            }
        }
       if((s.length()&1) ==0){
           return oddCount  ==0;
       }else {
           return oddCount==1;
       }
    }
}
