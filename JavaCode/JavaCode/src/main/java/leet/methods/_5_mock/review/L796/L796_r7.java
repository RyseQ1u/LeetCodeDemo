package leet.methods._5_mock.review.L796;

public class L796_r7 {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
    }

    public boolean rotateString_V2(String s, String goal) {
        // 长度不等则肯定无法通过旋转匹配
        if (s.length() != goal.length()) return false;

        // 将s重复一次：s+s包含s的所有可能旋转结果
        s += s;
        int n = s.length();       // 重复后s的长度（2 * 原始s长度）
        int m = goal.length();    // goal的长度

        // 外层循环：遍历s+s中所有可能的匹配起始点（只需检查到n-m，避免越界）
        for (int start = 0; start <= n - m; start++) {
            boolean match = true;
            // 内层循环：从当前start位置检查是否与goal完全匹配
            for (int j = 0; j < m; j++) {
                if (s.charAt(start + j) != goal.charAt(j)) {
                    match = false;  // 字符不匹配，标记失败并跳出内层循环
                    break;
                }
            }
            // 若内层循环完整执行（j==m），说明找到匹配
            if (match) return true;
        }
        return false; // 所有起始点均未匹配成功
    }
}
