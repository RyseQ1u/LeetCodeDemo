using LeetCode.Methods.Easy;
using LeetCode.Methods.Middle;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeetTest.MethodTests.Middle
{
    public class Leet2576_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] { new int[]{ 3,5,2,4}, 2 },
            new object[] { new int[] { 9, 2, 5, 4 }, 4},
            new object[] { new int[] { 7, 6, 8 } ,0},
            new object[] { new int[] { 1, 78, 27, 48, 14, 86, 79, 68, 77, 20, 57, 21, 18, 67, 5, 51, 70, 85, 47, 56, 22, 79, 41, 8, 39, 81, 59, 74, 14, 45, 49, 15, 10, 28, 16, 77, 22, 65, 8, 36, 79, 94, 44, 80, 72, 8, 96, 78, 39, 92, 69, 55, 9, 44, 26, 76, 40, 77, 16, 69, 40, 64, 12, 48, 66, 7, 59, 10 } ,64},
            new object[] { new int[] { 42, 83, 48, 10, 24, 55, 9, 100, 10, 17, 17, 99, 51, 32, 16, 98, 99, 31, 28, 68, 71, 14, 64, 29, 15, 40 } ,26},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void Check_MaxNumOfMarkedIndices_Retun(int[] nums, int check)
        {
            // Arrange
            var leet = new Leet2576();

            // Act
            var result = leet.MaxNumOfMarkedIndices(nums);

            // Assert
            Assert.Equal(check, result);
        }
    }
}