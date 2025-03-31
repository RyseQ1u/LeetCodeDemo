package leet.Daily.easy;

public class Leet2278 {

    public int percentageLetter(String s, char letter) {
        int count = s.length();
        int[] arr = new int[26];
        for (char c : s.toCharArray()){
            arr[c-'a']++;
        }
        int dividend =  arr[letter-'a'];
        return dividend/ count * 100 ;
    }


}
