using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2414_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] { "abacaba", 2 },
            new object[] { "abcde", 5},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void Check_LongestContinuousSubstring_Retun(string answerKey, int check)
        {
            // Arrange
            var leet = new Leet2414();

            // Act
            var result = leet.LongestContinuousSubstring(answerKey);

            // Assert
            Assert.Equal(check, result);
        }
    }
}