package leet.methods._2_stackAndqueue.review.L295;

import java.util.PriorityQueue;
import java.util.Stack;

public class Leet295_r4 {
    class MedianFinder {
        //大顶堆 保证大顶堆里的数据都比小顶堆的小
        private PriorityQueue<Integer> big = new PriorityQueue<>((a,b)->  (b - a));
        //小顶堆
        private PriorityQueue<Integer> small = new PriorityQueue<>();

        public MedianFinder() {

        }

        public void addNum(int num) {
            if(big.size()==small.size()){
                //先加入小顶堆 取出小顶堆里最小的元素 再加入大顶堆以保证小顶中的元素都比大顶中的大
                small.add(num);
                big.add(small.poll());
            }else {
                big.add(num);
                small.add(big.poll());
            }
        }

        public double findMedian() {
            if(big.size() == small.size()){
                return (big.peek()+small.peek()) /2.0;
            }else {
                //数量不同时返回大堆顶
                return big.peek();
            }
        }
    }
}
