using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet40_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[]
            {
                new int[] { 10, 1, 2, 7, 6, 1, 5 } ,
                8,
                new List<IList<int>>()
                {
                    new List<int>() { 1, 1, 6 } ,
                    new List<int>() { 1, 2, 5 } ,
                    new List<int>() { 1,7 } ,
                    new List<int>() { 2, 6 } ,
                }
            },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_CombinationSum2_RetunSum(int[] candidates, int target, IList<IList<int>> expected)
        {
            // Arrange
            var leet = new Leet40();

            // Act
            var result = leet.CombinationSum2(candidates, target);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}