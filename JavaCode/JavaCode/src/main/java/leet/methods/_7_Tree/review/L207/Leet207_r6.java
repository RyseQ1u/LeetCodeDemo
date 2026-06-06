package leet.methods._7_Tree.review.L207;

import java.util.ArrayList;
import java.util.LinkedList;

public class Leet207_r6 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //记录课程的入度和出度
        //统计前置课程
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        //入度表
        int[] ins = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            ins[prerequisite[0]]++;
            list.get(prerequisite[1]).add(prerequisite[0]);
        }
        LinkedList<Integer> cans = new LinkedList<>();
        for (int i = 0; i < ins.length; i++) {
            if(ins[i] == 0)cans.add(i);
        }
        while (!cans.isEmpty()){
            numCourses--;
            int course = cans.poll();
            for (Integer i : list.get(course)) {
                if(--ins[i]==0)cans.add(i);
            }
        }
        return numCourses==0;
    }
}
