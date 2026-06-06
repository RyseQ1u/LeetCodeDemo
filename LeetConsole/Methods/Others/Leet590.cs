using LeetCode.Class;
using System.Collections.Generic;

namespace Leet.Methods
{
    public class Leet590
    {
        public IList<int> Action()
        {
            var node = new Node(1, new List<Node>() { new Node(3, new List<Node>() { new Node(5), new Node(6) }), new Node(2), new Node(4) });
            return Postorder(node);
        }

        public IList<int> Postorder(Node root)
        {
            List<int> result = new List<int>();

            if (root.children == null)
            {
                result.Add(root.val);
            }
            else
            {
                foreach (var child in root.children)
                {
                    result.AddRange(Postorder(child));
                }
                result.Add(root.val);
            }

            return result;
        }
    }
}