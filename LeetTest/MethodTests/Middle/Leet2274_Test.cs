using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2274_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            //new object[] {2,9 ,new int[] {4,6 } ,3},
            //new object[] {6,8 ,new int[] {7,6,8 } ,0},
            //new object[] {28,50 ,new int[] {35,48 } ,12},
            //new object[] {34,50 ,new int[] {50 } ,16},
            new object[] {1, 1000000000, new int[] {1, 1000000000 } ,1000000000},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_MaxConsecutive_RetunSum(int bottom, int top, int[] special, int check)
        {
            // Arrange
            var leet = new Leet2274();
            //var input1 = new int[][] { new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 } };
            //var input2 = new int[][] { new int[] { 1, 0, 2 }, new int[] { 1, 0, 2 } };

            // Act
            var result = leet.MaxConsecutive(bottom, top, special);

            // Assert
            Assert.Equal(check, result);
        }
    }
}