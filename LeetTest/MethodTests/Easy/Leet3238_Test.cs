using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet3238_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
                //new object[]{"10101",1,12},
                //new object[]{ "1010101",2, 25},
                //new object[]{ "11111", 1,15},
                //new object[]{ "0001111", 2,26},
                new object[]{ 4, new int[][] { new int[] { 0, 0 }, new int[] { 1, 0 }, new int[] { 1, 0 }, new int[] { 2, 1 }, new int[] { 2, 1 }, new int[] { 2, 0 } },2},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_FinalPositionOfSnake_RetunStr(int n, int[][] s, int check)
        {
            // Arrange
            var leet = new Leet3238();

            // Act
            var result = leet.WinningPlayerCount(n, s);

            // Assert
            Assert.Equal(check, result);
        }
    }
}