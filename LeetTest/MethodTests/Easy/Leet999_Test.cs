using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet999_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[]
            {
                new char[][]
                {
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'p', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'R', '.', '.', '.', 'p' },
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'p', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                },
                3
            },
            new object[] {
                new char[][]
                {
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'p', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'B', '.', '.', '.', 'p' },
                    new char[] { '.', '.', 'B', 'R', 'B', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'B', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'p', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                },
                0
            },
            new object[] {
                new char[][]
                {
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'p', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'p', '.', '.', '.', 'p' },
                    new char[] { 'p', 'p', '.', 'R', '.', 'p', 'B', '.' },
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'B', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', 'p', '.', '.', '.', '.' },
                    new char[] { '.', '.', '.', '.', '.', '.', '.', '.' },
                },
                3
            },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_NumRookCaptures_RetunTrue(char[][] board, int check)
        {
            // Arrange
            var leet = new Leet999();

            // Act
            var result = leet.NumRookCaptures(board);

            // Assert
            Assert.Equal(check, result);
        }
    }
}