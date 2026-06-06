package leet.methods._7_Tree.review.L207;

import java.util.ArrayList;
import java.util.LinkedList;

public class Leet207_r7 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        ArrayList< ArrayList< Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>() );
        }
        int[] needs = new int[n];
        for (int[] pq : prerequisites) {
            list.get(pq[1]).add(pq[0]);
            needs[pq[0]]++;
        }
        LinkedList<Integer> canClass = new LinkedList<>();
        for (int i = 0; i < needs.length; i++) {
            if(needs[i]==0){
                canClass.add(i);
            }
        }
        while (!canClass.isEmpty()){
            int curClass = canClass.pop();
            for (Integer i : list.get(curClass)) {
                if(--needs[i]==0){
                    canClass.add(i);
                }
            }
            n--;
        }
        return n==0;
    }
}
