using LeetCode.Methods.Easy;
using Xunit;

namespace LeetTest.MethodTests.Easy
{
    public class Leet3142_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] { new int[][] { new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 } } },
            new object[] { new int[][] { new int[] { 1, 0, 2 }, new int[] { 1, 0, 2 } } }
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_SatisfiesConditions_RetunTrue(int[][] grid)
        {
            // Arrange
            var leet = new Leet3142();
            //var input1 = new int[][] { new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 } };
            //var input2 = new int[][] { new int[] { 1, 0, 2 }, new int[] { 1, 0, 2 } };

            // Act
            var result = leet.SatisfiesConditions(grid);

            // Assert
            Assert.True(result);
        }
    }
}