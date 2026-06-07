package leet._class.stackAndqueue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 使用优先队列实现栈
 */
class MedianFinder_Leet295 {

    Queue<Integer> Small,Big;
    public MedianFinder_Leet295() {
        //小顶堆 大到小排序
        Small = new PriorityQueue<>();
        //大顶堆 小到大排序
        Big = new PriorityQueue<>((x,y)->(y-x));
    }

    /**
     * 添加方法
     * 当两个队列元素个数不相等时，需要向大顶堆增加一个元素
     * 先将当前添加值加入到小顶堆，再将小顶堆堆顶加入到大顶堆种
     * 反之亦然 以此保证整体有序
     * @param num
     */
    public void addNum(int num) {

        if(Small.size()!=Big.size()){
            Small.add(num);
            Big.add((Small.poll()));
        }else {
            Big.add(num);
            Small.add((Big.poll()));
        }
    }

    /**
     * 如果两个队列大小不同，返回小堆顶
     * @return
     */
    public double findMedian() {
        return Small.size() != Big.size()? Small.peek():( Small.peek()+Big.peek())/2.0;
    }
}
