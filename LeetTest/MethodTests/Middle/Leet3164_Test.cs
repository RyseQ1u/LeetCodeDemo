using LeetCode.Methods.Easy;
using LeetCode.Methods.Middle;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeetTest.MethodTests.Middle
{
    public class Leet3164_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] {new int[] { 1,3,4 } , new int[] { 1, 3, 4 } ,1,5 },
            new object[] {  new int[] { 1, 2, 4, 12 } , new int[] {2, 4 },3,2 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_NumberOfPairs_RetunSum(int[] input1, int[] input2, int input3, long expected)
        {
            // Arrange
            var leet = new Leet3164();

            // Act
            var result = leet.NumberOfPairs(input1, input2, input3);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}