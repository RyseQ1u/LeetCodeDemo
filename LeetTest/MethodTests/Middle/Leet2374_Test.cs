using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2374_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] { new int[] { 1, 0, 0, 0, 0, 7, 7, 5 }, 7 },
            new object[] { new int[] { 2, 0, 0, 2 }, 0},
            new object[] { new int[] { 3, 3, 3, 0 }, 0},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void Check_EdgeScore_Retun(int[] edges, int check)
        {
            // Arrange
            var leet = new Leet2374();

            // Act
            var result = leet.EdgeScore(edges);

            // Assert
            Assert.Equal(check, result);
        }
    }
}