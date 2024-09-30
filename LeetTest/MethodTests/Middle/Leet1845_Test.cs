using LeetCode.Methods.Easy;
using LeetCode.Methods.Middle;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeetTest.MethodTests.Middle
{
    public class Leet1845_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] {  2 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void Check_Test_Retun(int check)
        {
            // Arrange
            var leet = new Leet1845();

            // Act
            var result = leet.Test2();

            // Assert
            Assert.True(result);
        }
    }
}