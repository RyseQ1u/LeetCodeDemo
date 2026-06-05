using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2944_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] {new int[] { 26, 18, 6, 12, 49, 7, 45, 45 },39 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_ResultsArray_RetunSum(int[] input1, int expected)
        {
            // Arrange
            var leet = new Leet2944();

            // Act
            var result = leet.MinimumCoins(input1);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}