using System.Collections.Generic;

namespace LeetCode.Class
{
    // Definition for a Node.
    public class Node
    {
        public int val;
        public IList<Node> children;
        internal int pval;
        private List<Node> nodes;

        public Node()
        { }

        public Node(int _val)
        {
            val = _val;
        }

        public Node(int _val, List<Node> nodes) : this(_val)
        {
            this.nodes = nodes;
        }

        public Node(int _val, IList<Node> _children, int pval)
        {
            val = _val;
            children = _children;
            this.pval = pval;
        }
    }
}