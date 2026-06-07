package leet.methods._2_stackAndqueue.review.L295;

import java.util.PriorityQueue;

public class Leet295_r1 {
    //使用优先队列
    class MedianFinder {

        private PriorityQueue<Integer> max = new PriorityQueue<>((a, b)->(b-a)); // 小顶堆，存储较大的一半元素
        private PriorityQueue<Integer> min = new PriorityQueue<>(); // 大顶堆，存储较小的一半元素
        public MedianFinder() {

        }

        public void addNum(int num) {
            if(min.size()!= max.size()){
                min.add(num);
                max.add(min.poll());
            }else {
                max.add(num);
                min.add(max.poll());
            }
        }

        public double findMedian() {
            return min.size()== max.size()?(min.peek()+ max.peek())/2.0: min.peek();
        }
    }
}
