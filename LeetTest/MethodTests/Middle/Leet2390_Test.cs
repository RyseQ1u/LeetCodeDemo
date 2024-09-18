using LeetCode.Methods;
using LeetCode.Methods.Easy;
using LeetCode.Methods.Middle;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2390_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] { "leet**cod*e","lecoe" },
            new object[] { "erase*****" , string.Empty },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_SumDigitDifferences_RetunSum(string s, string check)
        {
            // Arrange
            var leet = new Leet2390();

            // Act
            var result = leet.RemoveStars2(s);

            // Assert
            Assert.Equal(check, result);
        }
    }
}