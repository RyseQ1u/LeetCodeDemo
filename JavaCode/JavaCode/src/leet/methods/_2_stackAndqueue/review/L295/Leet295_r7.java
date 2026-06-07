package leet.methods._2_stackAndqueue.review.L295;


import java.util.PriorityQueue;

public class Leet295_r7 {




    class MedianFinder {
        //大顶堆
        private final PriorityQueue<Integer> big = new PriorityQueue<Integer>((a, b)->b-a);
        //小顶堆
        private final PriorityQueue<Integer> small = new PriorityQueue<Integer>();

        public MedianFinder() {

        }

        public void addNum(int num) {
            if(small.size()==big.size()){
                small.add(num);
                big.add(small.poll());
            }else {
                big.add(num);
                small.add(big.poll());
            }
        }

        public double findMedian() {
            if(small.size()==big.size()){
                return  (big.peek()+small.peek()) / 2.0;
            }else {
                return big.peek();
            }
        }
    }
}
