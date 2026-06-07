package leet.methods._7_Tree.review.L207;

import java.util.ArrayList;
import java.util.LinkedList;

public class Leet207_r3 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //记录每门课必修的数量
        int[] needs = new int[numCourses];
        //记录每门课作为前置课程的数量
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            lists.add(new ArrayList());
        }
        for (int[] pr : prerequisites) {
            needs[pr[0]]++;
            lists.get(pr[1]).add(pr[0]);
        }
        LinkedList<Integer> quque = new LinkedList<>();
        for (int i = 0; i < needs.length; i++) {
            if(needs[i]==0) quque.add(i);
        }
        while (!quque.isEmpty()){
            Integer i = quque.poll();
            numCourses--;
            for (Integer integer : lists.get(i)) {
               if(-- needs[integer]==0)quque.add(integer);
            }
        }
        return numCourses==0;
    }
}
