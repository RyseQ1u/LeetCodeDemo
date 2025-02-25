using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2516_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] { "aabaaaacaabc",2, 8 },
            new object[] {"a",1,-1 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_TakeCharacters_RetunSum(string s, int k, int expected)
        {
            // Arrange
            var leet = new Leet2516();
            //var input1 = new int[][] { new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 } };
            //var input2 = new int[][] { new int[] { 1, 0, 2 }, new int[] { 1, 0, 2 } };

            // Act
            var result = leet.TakeCharacters(s, k);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}