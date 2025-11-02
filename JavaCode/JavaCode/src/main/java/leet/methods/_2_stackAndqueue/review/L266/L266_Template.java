package leet.methods._2_stackAndqueue.review.L266;

public class L266_Template {
    public boolean canPermutePalindrome(String s) {
        int [] charCount = new int[128];
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }
        int oddCount =0;
        for (int count : charCount) {
            if((count &1) ==1){
                oddCount++;
            }
        }
        if(oddCount <=1){
            return true;
        }
        return false;
    }
}
