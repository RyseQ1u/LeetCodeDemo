using LeetCode.Methods.Easy;

using LeetCode.Methods.Easy;

using Xunit;

namespace LeetTest.MethodTests.Easy
{
    public class Leet3216_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
                new object[]{"001","001"},
                new object[]{"45320","43520"},
                new object[]{"10","10"},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_GetSmallestString_RetunStr(string s, string check)
        {
            // Arrange
            var leet = new Leet3216();

            // Act
            var result = leet.GetSmallestString(s);

            // Assert
            Assert.Equal(check, result);
        }
    }
}