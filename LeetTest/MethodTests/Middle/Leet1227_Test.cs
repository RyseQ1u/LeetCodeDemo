using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet1227_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[] {1, 1.00000 },
            new object[] { 2,0.50000 },
            new object[] { 3,0.50000 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_MincostTickets_RetunSum(int input1, double expected)
        {
            // Arrange
            var leet = new Leet1227();

            // Act
            var result = leet.NthPersonGetsNthSeat(input1);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}