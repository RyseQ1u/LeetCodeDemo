using LeetCode.Methods.Hard;

namespace LeetTest.MethodTests.Hard
{
    public class Leet2306_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] {  new string[] { "coffee", "donuts", "time", "toffee" }, 6 },
            new object[] {new string[] { "lack", "back" },0 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_DistinctNames_RetunSum(string[] ideas, int expected)
        {
            // Arrange
            var leet = new Leet2306();

            // Act
            var result = leet.DistinctNames(ideas);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}