using LeetCode.Methods.Middle;

namespace LeetTest.MethodTests.Middle
{
    public class Leet1366_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            //new object[] { new string[] { "ABC", "ACB", "ABC", "ACB", "ACB" }, "ACB" },
            //new object[] { new string[] { "WXYZ", "XYZW" }, "XWYZ" },
            new object[] { new string[] { "BCA", "CAB", "CBA", "ABC", "ACB", "BAC" }, "ABC" },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_RankTeams_RetunSum(string[] votes, string expected)
        {
            // Arrange
            var leet = new Leet1366();

            // Act
            var result = leet.RankTeams(votes);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}