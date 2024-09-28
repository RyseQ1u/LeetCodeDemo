using LeetCode.Methods.Easy;
using Xunit;

namespace LeetTest.MethodTests.Easy
{
    public class Leet273_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] { new int[] { 2, 3, 2 },2,6 },
            new object[] { new int[] { 5,1,1,1 },0,8 },
            new object[] { new int[] { 84, 49, 5, 24, 70, 77, 87, 8 },3,154 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_TimeRequiredToBuy_RetunStr(int[] arr, int k, int check)
        {
            // Arrange
            var leet = new Leet2073();

            // Act
            var result = leet.TimeRequiredToBuy(arr, k);

            // Assert
            Assert.Equal(check, result);
        }
    }
}