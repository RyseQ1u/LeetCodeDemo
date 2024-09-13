using LeetCode.Methods.Easy;
using LeetCode.Methods.Hard;
using LeetCode.Methods.Middle;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeetTest.MethodTests.Hard
{
    public class Leet2398_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] {  new int[] { 11, 12, 19 }, new int[] { 10, 8, 7 }, 19,0 },
            new object[] {new int[] { 3, 6, 1, 3, 4 }, new int[] { 2, 1, 3, 4, 5 }, 25,3 },
            new object[] {new int[] { 19, 63, 21, 8, 5, 46, 56, 45, 54, 30, 92, 63, 31, 71, 87, 94, 67, 8, 19, 89, 79, 25 }, new int[] { 91, 92, 39, 89, 62, 81, 33, 99, 28, 99, 86, 19, 5, 6, 19, 94, 65, 86, 17, 10, 8, 42 }, 85,1 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_SumDigitDifferences_RetunSum(int[] chargeTimes, int[] runningCosts, long budget, int check)
        {
            // Arrange
            var leet = new Leet2398();
            //var input1 = new int[][] { new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 } };
            //var input2 = new int[][] { new int[] { 1, 0, 2 }, new int[] { 1, 0, 2 } };

            // Act
            var result = leet.MaximumRobots(chargeTimes, runningCosts, budget);

            // Assert
            Assert.Equal(check, result);
        }
    }
}