package leet.methods._2_stackAndqueue.review.L295;

import java.util.PriorityQueue;

public class Leet295_r8 {

    class MedianFinder {

    PriorityQueue<Integer> small =  new PriorityQueue<Integer>();
    PriorityQueue<Integer> big =  new PriorityQueue<Integer>((a,b)->b-a);

        public MedianFinder() {

        }

        public void addNum(int num) {
            //先放入小顶堆
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
                return (big.peek()+small.peek())/2.0;
            }
            return big.peek();
        }
    }
}
