package leet.methods._7_Tree.review.L207;

import java.util.ArrayList;
import java.util.LinkedList;

public class Leet207_r8 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //维护出入度表
        int[] ins = new int[numCourses];
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            lists.add(new ArrayList());
        }
        for (int[] pq : prerequisites) {
            ins[pq[0]]++;
            lists.get(pq[1]).add(pq[0]);
        }
        LinkedList<Integer> canDos = new LinkedList<>();
        for (int i = 0; i < ins.length; i++)
        {
            if(ins[i]==0){
                canDos.add(i);
            }
        }
        while (!canDos.isEmpty()){
            ArrayList<Integer> list = lists.get(canDos.pop());
            for (Integer i : list) {
                if(--ins[i]==0){
                    canDos.add(i);
                }
            }
            numCourses--;
        }

        return numCourses==0;
    }
}
