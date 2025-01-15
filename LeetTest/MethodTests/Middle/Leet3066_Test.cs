using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet3066_Test
    {
        public static IEnumerable<object[]> Data => new[]
{
            new object[] { new int[]{ 2, 11, 10, 1, 3 }, 10,2 },
            new object[] { new int[]{ 1, 1, 2, 4, 9 }, 20,4 },
            new object[] { new int[]{ 999999999, 999999999, 999999999 }, 1000000000, 2 },
            new object[] { new int[]{ 19, 44, 61, 96, 84, 79, 84, 61, 97, 44 }, 44, 1 },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void Check_MinOperations_Retun(int[] nums, int k, int check)
        {
            // Arrange
            var leet = new Leet3066();

            // Act
            var result = leet.MinOperations(nums, k);

            // Assert
            Assert.Equal(check, result);
        }
    }
}