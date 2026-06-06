using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet983_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] { new int[] { 1, 4, 6, 7, 8, 20 } , new int[] { 2,7,15 }, 11 },
            new object[] { new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31 } , new int[] { 2, 7, 15 }, 17 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_MincostTickets_RetunSum(int[] grid1, int[] grid2, long sum)
        {
            // Arrange
            var leet = new Leet983();

            // Act
            var result = leet.MincostTickets(grid1, grid2);

            // Assert
            Assert.Equal(sum, result);
        }
    }
}