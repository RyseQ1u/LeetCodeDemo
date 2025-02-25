using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet3254_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] {new int[] { 1, 2, 3, 4, 3, 2, 5 },3,new int[] { 3, 4, -1, -1, -1 } },
            new object[] { new int[] { 2, 2, 2, 2, 2 },4,new int[] { -1, -1 } },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_ResultsArray_RetunSum(int[] input1, int k, int[] expected)
        {
            // Arrange
            var leet = new Leet3254();

            // Act
            var result = leet.ResultsArray(input1, k);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}