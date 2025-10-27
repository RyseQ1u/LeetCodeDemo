package leet.methods._2_stackAndqueue.review.L295;

import java.util.PriorityQueue;

public class Leet295_Template {
    //使用优先队列
    class MedianFinder {

        private PriorityQueue<Integer> min = new PriorityQueue<>((a, b)->(b-a)); // 小顶堆，存储较大的一半元素
        private PriorityQueue<Integer> max = new PriorityQueue<>(); // 大顶堆，存储较小的一半元素
        public MedianFinder() {

        }

        public void addNum(int num) {
            if(max.size()!= min.size()){
                max.add(num);
                min.add(max.poll());
            }else {
                min .add(num);
                max.add(min.poll());
            }
        }

        public double findMedian() {
            return max.size()==min.size()?(max.peek()+min.peek())/2.0:max.peek();
        }
    }
}
