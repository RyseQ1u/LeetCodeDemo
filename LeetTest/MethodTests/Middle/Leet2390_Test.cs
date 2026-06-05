using LeetCode.Methods;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2390_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] { "leet**cod*e","lecoe" },
            new object[] { "erase*****" , string.Empty },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_SumDigitDifferences_RetunSum(string s, string check)
        {
            // Arrange
            var leet = new Leet2390();

            // Act
            var result = leet.RemoveStars2(s);

            // Assert
            Assert.Equal(check, result);
        }
    }
}