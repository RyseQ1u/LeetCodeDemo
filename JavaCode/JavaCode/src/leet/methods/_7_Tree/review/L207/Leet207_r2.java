package leet.methods._7_Tree.review.L207;

import java.util.ArrayList;
import java.util.LinkedList;

public class Leet207_r2 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //统计每门课需要的前置课程
        int[] count = new int[numCourses];
        //统计每门课完成后 可以修的课程
        ArrayList<ArrayList<Integer>> coursees = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            coursees.add(new ArrayList<>());
        }
        for (int[] pr : prerequisites) {
            count[pr[0]]++;
            coursees.get(pr[1]).add(pr[0]);
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]==0)queue.add(i);
        }
        while (!queue.isEmpty()){
            Integer i = queue.poll();
            numCourses--;
            for (Integer j : coursees.get(i)) {
                if(--count[j] == 0)queue.add(j);
            }
        }
        return numCourses==0;
    }
}
