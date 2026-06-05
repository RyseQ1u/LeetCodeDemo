using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet3284_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
                //new object[]{"10101",1,12},
                //new object[]{ "1010101",2, 25},
                //new object[]{ "11111", 1,15},
                //new object[]{ "0001111", 2,26},
                new object[]{ 2, new string[] { "RIGHT", "DOWN" },3},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_FinalPositionOfSnake_RetunStr(int n, string[] s, int check)
        {
            // Arrange
            var leet = new Leet3284();

            // Act
            var result = leet.FinalPositionOfSnake(n, s);

            // Assert
            Assert.Equal(check, result);
        }
    }
}