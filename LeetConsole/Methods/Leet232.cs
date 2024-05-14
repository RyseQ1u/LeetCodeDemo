using System.Collections.Generic;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet232
    {
        public bool Action()
        {
            //var postorder = new int[] { 3, 9, 20, 15, 7 };
            //var inorder = new int[] { 9, 3, 15, 20, 7 };

            //var r = KthLargestLevelSum(new TreeNode(5,
            //    new TreeNode(8,new TreeNode(2,new TreeNode(4),new TreeNode(6)),new TreeNode(1)),new TreeNode(9,new TreeNode(3),new TreeNode(7)))
            //    ,2);
            //var r = ValidPartition(new int[] { 4, 4, 4, 5, 6 });
            MyQueue myQueue = new MyQueue();
            return false;
        }
    }

    public class MyQueue
    {
        private Stack<int> orderStack = new Stack<int>();
        private Stack<int> reverseStack = new Stack<int>();

        public MyQueue()
        {
        }

        public void Push(int x)
        {
            reverseStack.Push(x);
        }

        public int Pop()
        {
            if (orderStack.Count == 0)
            {
                while (reverseStack.Count > 0)
                {
                    orderStack.Push(reverseStack.Pop());
                }
            }
            if (orderStack.Count > 0)
            {
                return orderStack.Pop();
            }
            else { return 0; }
        }

        public int Peek()
        {
            if (orderStack.Count == 0)
            {
                while (reverseStack.Count > 0)
                {
                    orderStack.Push(reverseStack.Pop());
                }
            }
            if (orderStack.Count > 0)
            {
                return orderStack.Peek();
            }
            else { return 0; }
        }

        public bool Empty()
        {
            return (reverseStack.Count == 0 && orderStack.Count == 0);
        }
    }
}