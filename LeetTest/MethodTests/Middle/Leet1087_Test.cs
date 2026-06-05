using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet1087_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] {new int[] { 1, 1, 100000 } ,2.01,10000000 },
            new object[] {new int[] { 1, 3, 2 } ,6,1 },
            new object[] {new int[] { 1, 3, 2 } ,2.7,3 },
            new object[] {new int[] { 1, 3, 2 } ,1.9,-1 },
            new object[] {new int[] { 5, 3, 4, 6, 2, 2, 7 } ,10.92,4 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_MinSpeedOnTime_RetunSum(int[] input1, double input2, int expected)
        {
            // Arrange
            var leet = new Leet1087();

            // Act
            var actual = leet.MinSpeedOnTime(input1, input2);

            // Assert
            Assert.Equal(expected, actual);
        }
    }
}