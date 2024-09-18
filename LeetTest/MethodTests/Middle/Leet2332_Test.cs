using LeetCode.Methods.Easy;
using LeetCode.Methods.Middle;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2332_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] { new int[] { 10, 20 }, new int[] { 2, 17, 18, 19 }, 2,16 },
            new object[] { new int[] { 20, 30, 10 }, new int[] { 19, 13, 26, 4, 25, 11, 21 }, 2,20},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_LatestTimeCatchTheBus_RetunSum(int[] buses, int[] passengers, int capacity, int check)
        {
            // Arrange
            var leet = new Leet2332();
            //var input1 = new int[][] { new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 } };
            //var input2 = new int[][] { new int[] { 1, 0, 2 }, new int[] { 1, 0, 2 } };

            // Act
            var result = leet.LatestTimeCatchTheBus(buses, passengers, capacity);

            // Assert
            Assert.Equal(check, result);
        }
    }
}