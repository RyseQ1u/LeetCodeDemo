using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2024_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] { "TTFF", 2,4 },
            new object[] { "TFFT", 1 ,3},
            new object[] { "TTFTTFTT", 1 ,5},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void Check_MaxConsecutiveAnswers_Retun(string answerKey, int k, int check)
        {
            // Arrange
            var leet2024 = new Leet2024();

            // Act
            var result = leet2024.MaxConsecutiveAnswers(answerKey, k);

            // Assert
            Assert.Equal(check, result);
        }
    }
}