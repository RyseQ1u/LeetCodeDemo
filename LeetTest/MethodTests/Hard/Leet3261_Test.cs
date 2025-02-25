using LeetCode.Methods.Hard;

namespace LeetTest.MethodTests.Hard
{
    public class Leet3261_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
                //new object[]{ "0001111", 2,new int[][] { new int[] { 0, 6 } },new long[] { 26} },
                new object[]{ "010101", 1, new int[][] { new int[] { 0, 5 }, new int[] { 1, 4 }, new int[] { 2, 3 } }, new long[] { 15, 9, 3 } },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_CountKConstraintSubstrings_RetunSum(string s, int k, int[][] queries, long[] expected)
        {
            // Arrange
            var leet = new Leet3261();

            // Act
            var result = leet.CountKConstraintSubstrings(s, k, queries);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}