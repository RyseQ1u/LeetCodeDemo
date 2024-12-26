using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet3083_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
                new object[]{ "abcd", false},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_IsSubstringPresent_RetunStr(string s, bool check)
        {
            // Arrange
            var leet = new Leet3083();

            // Act
            var result = leet.IsSubstringPresent(s);

            // Assert
            Assert.Equal(check, result);
        }
    }
}