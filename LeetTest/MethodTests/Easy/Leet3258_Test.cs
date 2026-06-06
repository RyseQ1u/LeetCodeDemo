using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet3258_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
                //new object[]{"10101",1,12},
                //new object[]{ "1010101",2, 25},
                //new object[]{ "11111", 1,15},
                //new object[]{ "0001111", 2,26},
                new object[]{ "1010", 1,9},
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_CountKConstraintSubstrings_RetunStr(string s, int k, int check)
        {
            // Arrange
            var leet = new Leet3258();

            // Act
            var result = leet.CountKConstraintSubstrings(s, k);

            // Assert
            Assert.Equal(check, result);
        }
    }
}