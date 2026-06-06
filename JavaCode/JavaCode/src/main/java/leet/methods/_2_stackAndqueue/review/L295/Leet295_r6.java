package leet.methods._2_stackAndqueue.review.L295;

import java.util.PriorityQueue;

public class Leet295_r6 {

    class MedianFinder {
        //小顶堆
        private final PriorityQueue<Integer> small = new PriorityQueue<>();
        //大顶堆
        private final PriorityQueue<Integer> big = new PriorityQueue<>((a, b)->(b-a));

        public MedianFinder() {

        }

        public void addNum(int num) {
            //插入时保证小顶堆元素都大于大顶堆元素
            if(small.size() == big.size()){
                small.add(num);
                big.add(small.poll());
            }else {
                big.add(num);
                small.add(big.poll());
            }
        }

        public double findMedian() {
            if(small.size() == big.size()){
                return (small.peek()+ big.peek()) /2.0;
            }else {
                return big.peek();
            }
        }
    }
}
