using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet90_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[]
            {
                new int[] { 1,2,2 } ,
                new List<IList<int>>()
                {
                    new List<int>() {} ,
                    new List<int>() { 1 } ,
                    new List<int>() { 2 } ,
                    new List<int>() { 1,2 } ,
                    new List<int>() { 2,2 } ,
                    new List<int>() { 1,2,2 } ,
                },
            },
            new object[]
            {
                new int[] { 0 } ,
                new List<IList<int>>()
                {
                    new List<int>() {} ,
                    new List<int>() { 0 } ,
                }
            },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_CombinationSum2_RetunSum(int[] input1, IList<IList<int>> expected)
        {
            // Arrange
            var leet = new Leet90();

            // Act
            var result = leet.SubsetsWithDup(input1);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}