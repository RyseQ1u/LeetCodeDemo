package leet.Daily.easy;

public class Leet3442 {

    public int maxDifference(String s) {
        //统计全部字母出现的次数
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        //查找最大的奇数,最小的偶数
        int single = 0, event = Integer.MAX_VALUE;
        for (int n : cnt) {
            if (n == 0) continue;
            if (n % 2 == 0) {
                event = Math.min(event, n);
            } else {
                single = Math.max(single, n);
            }
        }
        return single - event;
    }

}
