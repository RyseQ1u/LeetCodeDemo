using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2270_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] { new int[] { 10, 4, -8, 7 }, 2 },
            new object[] { new int[] { 2, 3, 1, 0 }, 2},
            new object[] { new int[] { 9, 9, 9 }, 1},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void Check_EdgeScore_Retun(int[] edges, int check)
        {
            // Arrange
            var leet = new Leet2270();

            // Act
            var result = leet.WaysToSplitArray_V2(edges);

            // Assert
            Assert.Equal(check, result);
        }
    }
}