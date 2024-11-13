using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2207_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] {"abdcdbc","ac" ,4 },
            new object[] {"aabb","ab" ,6 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_MaximumSubsequenceCount_RetunSum(string text, string pattern, long check)
        {
            // Arrange
            var leet = new Leet2207();
            //var input1 = new int[][] { new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 } };
            //var input2 = new int[][] { new int[] { 1, 0, 2 }, new int[] { 1, 0, 2 } };

            // Act
            var result = leet.MaximumSubsequenceCount(text, pattern);

            // Assert
            Assert.Equal(check, result);
        }
    }
}