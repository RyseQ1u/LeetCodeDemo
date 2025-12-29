package leet.methods._7_Tree.review.L207;

import java.util.ArrayList;
import java.util.LinkedList;

public class Leet207_r4 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //记录每门课前置课程数量
        int[] needs = new int[numCourses];
        //统计每门课对应的后续课程
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        //初始化数据
        for (int[] pr : prerequisites) {
            needs[pr[0]]++;
            list.get(pr[1]).add(pr[0]);
        }
        LinkedList<Integer> quque = new LinkedList<>();
        for (int i = 0; i < needs.length; i++) {
            if (needs[i] == 0) quque.add(i);
        }
        while (!quque.isEmpty()) {
            Integer i = quque.poll();
            numCourses--;
            for (Integer integer : list.get(i)) {
                if (--needs[integer] == 0) quque.add(integer);

            }
        }

        return numCourses == 0;
    }
}
