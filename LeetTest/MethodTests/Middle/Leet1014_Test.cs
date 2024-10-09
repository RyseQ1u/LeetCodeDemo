using LeetCode.Methods.Easy;
using LeetCode.Methods.Hard;
using LeetCode.Methods.Middle;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeetTest.MethodTests.Middle
{
    public class Leet1014_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] {new int[] { 8,1,5,2,6 } ,11 },
            new object[] {new int[] { 6,2,5,1,8 } ,11 },
            new object[] {  new int[] { 1,2 } ,2 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_MaxScoreSightseeingPair_RetunSum(int[] input1, long expected)
        {
            // Arrange
            var leet = new Leet1014();

            // Act
            var actual = leet.MaxScoreSightseeingPair(input1);

            // Assert
            Assert.Equal(expected, actual);
        }
    }
}