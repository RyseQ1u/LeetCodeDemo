using LeetCode.Methods.Middle;

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