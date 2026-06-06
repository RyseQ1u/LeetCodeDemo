using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet3174_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] { "abc","abc" },
            new object[] { "ab12","" },
            new object[] { "abc12","a" },
            new object[] { "abc12sfasf6457","as" },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_ClearDigits_RetunStr(string s, string check)
        {
            // Arrange
            var leet = new Leet3174();

            // Act
            var result = leet.ClearDigits2(s);

            // Assert
            Assert.Equal(result, check);
        }
    }
}