using System.Collections.Generic;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// Leet682
    /// </summary>
    public class Leet682
    {
        public int CalPoints(string[] operations)
        {
            var r = 0;
            Stack<int> stack = new Stack<int>();
            foreach (string op in operations)
            {
                if (int.TryParse(op, out int n))
                {
                    r += n;
                    stack.Push(n);
                }
                else if (op == "C")
                {
                    r -= stack.Pop();
                }
                else if (op == "D")
                {
                    var d = stack.Peek() * 2;
                    r += d;
                    stack.Push(d);
                }
                else if (op == "+")
                {
                    var temp = stack.Pop();
                    var tempPeek = stack.Peek();
                    stack.Push(temp);
                    var sum = temp + tempPeek;
                    r += sum;
                    stack.Push(sum);
                }
            }

            return r;
        }
    }
}