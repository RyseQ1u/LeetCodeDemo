using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet3185_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] {new int[] { 12, 12, 30, 24, 24 },2 },
            new object[] {  new int[] { 72, 48, 24, 3 } ,3 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_CountCompleteDayPairs_RetunSum(int[] input1, long expected)
        {
            // Arrange
            var leet = new Leet3185();

            // Act
            var result = leet.CountCompleteDayPairs(input1);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}