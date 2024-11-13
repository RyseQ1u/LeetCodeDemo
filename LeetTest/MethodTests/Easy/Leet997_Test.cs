using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet997_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] {2, new int[][] { new int[] { 1,2 } } ,2},
            new object[] {1, new int[][] {} ,1},
            new object[] {3, new int[][] { new int[] { 1,3}, new int[] {2,3 } },3 },
            new object[] { 3,new int[][] { new int[] { 1,3}, new int[] {2,3 } , new int[] {3,1 }} ,-1 },
            new object[] { 4,new int[][] { new int[] { 1,3}, new int[] {1,4 } , new int[] {2,3 }, new int[] { 2,4 }, new int[] { 4, 3 } } ,3 }
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_FindJudge_RetunTrue(int n, int[][] grid, int check)
        {
            // Arrange
            var leet = new Leet997();

            // Act
            var result = leet.FindJudge(n, grid);

            // Assert
            Assert.Equal(check, result);
        }
    }
}