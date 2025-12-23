package leet.methods._7_Tree.review.L207;

import java.util.ArrayList;
import java.util.LinkedList;

public class Leet207_r1 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegress = new int[numCourses];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] pr : prerequisites) {
            //记录需要先修的课程数量
            indegress[pr[0]]++;
            //记录需要先修的课程
            list.get(pr[1]).add(pr[0]);
        }
        //统计不需要前置条件的课程
        for (int i = 0; i < numCourses; i++) {
            if (indegress[i] == 0) queue.add(i);
        }
        while (!queue.isEmpty()) {
            Integer pre = queue.poll();
            numCourses--;
            for (Integer toword : list.get(pre)) {
                if (--indegress[toword] == 0) queue.add(toword);
            }
        }
        return numCourses == 0;
    }
}
