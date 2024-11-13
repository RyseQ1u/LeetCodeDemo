using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet3200_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[]{2,4,3},
            new object[]{2,1,2},
            new object[]{1,1,1},
            new object[]{10,1,2},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_DestCity_RetunStr(int r, int b, int check)
        {
            // Arrange
            var leet = new Leet3200();

            // Act
            var result = leet.MaxHeightOfTriangle(r, b);

            // Assert
            Assert.Equal(result, check);
        }
    }
}