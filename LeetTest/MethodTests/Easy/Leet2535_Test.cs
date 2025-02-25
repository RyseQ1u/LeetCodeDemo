using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet2535_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] { new int[] { 1, 15, 6, 3 }, 9 },
            new object[] { new int[] { 1, 2, 4, 3 }, 0 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_ClearDigits_RetunStr(int[] s, int check)
        {
            // Arrange
            var leet = new Leet2535();

            // Act
            var result = leet.DifferenceOfSum(s);

            // Assert
            Assert.Equal(check, result);
        }
    }
}