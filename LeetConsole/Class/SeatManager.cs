using System.Collections.Generic;

namespace LeetCode.Class
{
    /// <summary>
    /// 1845
    /// </summary>
    public class SeatManager2
    {
        public Stack<int> stack = new Stack<int>();
        public Stack<int> tmp = new Stack<int>();

        public SeatManager2(int n)
        {
            for (int i = n; i >= 1; i--)
            {
                stack.Push(i);
            }
        }

        public int Reserve()
        {
            return stack.Pop();
        }

        public void Unreserve(int seatNumber)
        {
            while (stack.Count > 0 && seatNumber > stack.Peek())
            {
                tmp.Push(stack.Pop());
            }
            stack.Push(seatNumber);
            while (tmp.Count > 0)
            {
                stack.Push(tmp.Pop());
            }
        }
    }

    /// <summary>
    /// 使用优先队列
    /// </summary>
    /// <param name="n"></param>
    public class SeatManager
    {
        //记录释放的座位
        private readonly PriorityQueue<int, int> pq = new();

        private int min = 1;

        public SeatManager(int n)
        {
            pq = new PriorityQueue<int, int>();
            min = 1;
        }

        public int Reserve()
        {
            return pq.Count > 0 ? pq.Dequeue() : min++;
        }

        public void Unreserve(int seatNumber)
        {
            pq.Enqueue(seatNumber, seatNumber);
        }
    }
}