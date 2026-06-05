package leet.methods.Search;

import java.util.ArrayList;
import java.util.LinkedList;

public class Leet207 {

    /**
     * BFS
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //节点入度表
        int[] indegrees = new int[numCourses];
        //邻接表 记录指向节点
        ArrayList<ArrayList<Integer>> adjacency  = new ArrayList<>();
        //广度搜索队列 存放入度0的节点
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<>());
        }
        for (int[] pr : prerequisites) {
            //节点入度加1
            indegrees[pr[0]]++;
            //记录前置节点
            adjacency.get(pr[1]).add(pr[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            //将入度0的节点入队
            if(indegrees[i]==0) queue.add(i);
        }
        //开始BFS
        while (!queue.isEmpty()){
            Integer pre = queue.poll();
            //节点数减一
            numCourses--;
            //遍历节点指向节点
            for (Integer toword : adjacency.get(pre)) {
                //对应节点的入度减一 将入度0的节点加入队列
                if(--indegrees[toword] == 0) queue.add(toword);
            }
        }
        //最后判断节点是否有剩余
        return numCourses==0;
    }

}
