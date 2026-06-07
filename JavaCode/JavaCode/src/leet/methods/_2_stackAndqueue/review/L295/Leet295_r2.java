package leet.methods._2_stackAndqueue.review.L295;

import java.util.PriorityQueue;

public class Leet295_r2 {
    class MedianFinder {
    //小顶堆
    private PriorityQueue<Integer> asc = new PriorityQueue<>();
    //大顶堆
    private PriorityQueue<Integer> desc = new PriorityQueue<>((a, b) -> ( b - a ));

        public MedianFinder() {

        }

        public void addNum(int num) {
            if(asc.size() != desc.size()){
                //向大顶堆添加元素
                asc.add(num);
                desc.add(asc.poll());
            }else {
                //向小顶堆添加元素
                desc.add(num);
                asc.add(desc.poll());
            }

        }

        public double findMedian() {
            if(asc.size() != desc.size()){
                //奇数量元素 返回小顶堆的堆顶元素
                return asc.peek();
            }else {
                return (asc.peek() + desc.peek()) / 2.0;
            }
        }
    }
}
