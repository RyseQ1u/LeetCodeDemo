using LeetCode.Class;
using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet1367_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[]
            {
                new ListNode(4,new ListNode(2,new ListNode(8))),
                new TreeNode(1,new TreeNode(4,null,new TreeNode(2,new TreeNode(1))),new TreeNode(4,new TreeNode(2,new TreeNode(6),new TreeNode(8)))),
                true,
            },

            //new object[]
            //{
            //    new ListNode(4,new ListNode(2)),
            //    new TreeNode(4,new TreeNode(4,new TreeNode(1,new TreeNode(2))),new TreeNode(4)),
            //    false,
            //},
            //new object[]
            //{
            //    new ListNode(1,new ListNode(10)),
            //    new TreeNode(1,null,new TreeNode(1,new TreeNode(10,new TreeNode(9)),new TreeNode(1))),
            //    true,
            //},
            //new object[]
            //{
            //    new ListNode(2,new ListNode(2,new ListNode(1))),
            //    new TreeNode(2,null,new TreeNode(2,null,new TreeNode(2,null,new TreeNode(1)))),
            //    true,
            //},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_IsSubPath_RetunSum(ListNode head, TreeNode root, bool expected)
        {
            // Arrange
            var leet = new Leet1367();

            // Act
            var result = leet.IsSubPath(head, root);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}