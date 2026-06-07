package leet.methods._2_stackAndqueue.review.L295;

import javafx.scene.layout.Priority;

import java.util.PriorityQueue;

public class Leet295_r3 {

    /**
     * 数据流的中位数
     * 设计一个支持以下两种操作的数据结构：
     * 1. void addNum(int num) - 从数据流中添加一个整数到数据结构中。
     * 2. double findMedian() - 返回目前所有元素的中位数。
     */
    class MedianFinder {

        PriorityQueue<Integer> big = new PriorityQueue<>();
        PriorityQueue<Integer> small = new PriorityQueue<>((a, b) -> ( b - a ));
        /**
         * 使用优先队列维护两个堆
         * 一个大顶堆存储较小的一半元素
         * 一个小顶堆存储较大的一半元素
         * 保持两个堆的大小差不超过1 且大顶堆的元素都小于等于小顶堆的元素
         */
        public MedianFinder() {

        }

        /**
         * 插入元素时，判断插入到哪个堆
         * 长度相等的时候插入大顶堆
         * 长度不等的时候插入小顶堆
         * 然后调整两个堆的平衡
         * @param num
         */
        public void addNum(int num) {
            if(big.size() == small.size()) {
                small.add(num);
                big.add(small.poll());
            } else {
                big.add(num);
                small.add(big.poll());
            }
        }

        /**
         * 计算中位数
         *
         * @return
         */
        public double findMedian() {
            if(big.size() == small.size()) {
                return (big.peek() + small.peek()) / 2.0;
            } else {
                return big.peek();
            }
        }
    }
}
