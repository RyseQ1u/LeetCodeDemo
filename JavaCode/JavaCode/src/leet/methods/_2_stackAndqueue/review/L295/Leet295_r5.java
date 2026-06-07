package leet.methods._2_stackAndqueue.review.L295;

import java.util.PriorityQueue;

public class Leet295_r5 {


    class MedianFinder {
        //大顶堆
        private final PriorityQueue<Integer> big = new PriorityQueue<Integer>((a, b)->  (b-a));
        private final PriorityQueue<Integer> small = new PriorityQueue<Integer>();

        public MedianFinder() {

        }

        public void addNum(int num) {
            //保证小顶堆的元素比大顶堆元素大
            if(big.size()==small.size()){
                small.add(num);
                big.add(small.poll());
            }else {
                big.add(num);
                small.add(big.poll());
            }
        }

        public double findMedian() {
            if(big.size()==small.size()){
                return (big.peek()+small.peek()) /2;
            }else {
                return big.peek();
            }
        }
    }
}
