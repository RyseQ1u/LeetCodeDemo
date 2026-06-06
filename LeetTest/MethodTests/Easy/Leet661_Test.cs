using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet661_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
                //new object[]
                //{
                //    new int[][] { new int[] { 1, 1, 1},new int[] { 1, 0, 1 } ,new int[] { 1, 1, 1 } },
                //     new int[][] { new int[] { 0,0,0},new int[] { 0, 0, 0 } ,new int[] { 0, 0, 0 } },
                //},
                new object[]
                {
                    new int[][] { new int[] { 100, 200, 100 },new int[] { 200, 50, 200 } ,new int[] { 100, 200, 100 } },
                     new int[][] { new int[] { 137, 141, 137 },new int[] { 141, 138, 141 } ,new int[] { 137, 141, 137 } },
                },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_ImageSmoother_RetunStr(int[][] img, int[][] check)
        {
            // Arrange
            var leet = new Leet661();

            // Act 100,200,100
            var result = leet.ImageSmoother(img);

            // Assert
            Assert.Equal(check, result);
        }
    }
}