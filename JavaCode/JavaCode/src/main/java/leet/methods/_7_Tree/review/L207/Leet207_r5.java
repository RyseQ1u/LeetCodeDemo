package leet.methods._7_Tree.review.L207;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Leet207_r5 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //记录入度
        int[] ins = new int[numCourses];
        //记录出度
        ArrayList<ArrayList<Integer>> outs = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            outs.add(new ArrayList<>());
        }
        for (int[] pq : prerequisites) {
            ins[pq[0]]++;
            outs.get(pq[1]).add(pq[0]);
        }
        //将入度0的课入队
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < ins.length; i++) {
            if(ins[i]==0)queue.add(i);
        }
        while (!queue.isEmpty()){
            Integer i = queue.poll();
            numCourses--;
            for (Integer j : outs.get(i)) {
                if(--ins[j]==0)queue.add(j);
            }
        }
        return numCourses==0;
    }
}
