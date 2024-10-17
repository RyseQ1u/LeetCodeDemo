using LeetCode.Methods.Easy;
using Xunit;

namespace LeetTest.MethodTests.Easy
{
    public class Leet3194_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] { new int[] { 7, 8, 3, 4, 15, 13, 4, 1 },5.5 },
            new object[] { new int[] { 1,9,8,3,10,5 },5.5 },
            new object[] { new int[] {1,2,3,7,8,9 },5.0 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_DestCity_RetunStr(int[] nums, double check)
        {
            // Arrange
            var leet = new Leet3194();

            // Act
            var result = leet.MinimumAverage(nums);

            // Assert
            Assert.Equal(result, check);
        }
    }
}