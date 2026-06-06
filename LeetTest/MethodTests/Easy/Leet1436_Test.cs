using LeetCode.Methods.Easy;

namespace LeetTest.MethodTests.Easy
{
    public class Leet1436_Test
    {
        public static IEnumerable<object[]> Data => new[]
        {
            new object[]
            {
                new List<List<string>>
                {
                    new List<string> { "London", "New York" },
                    new List<string> { "New York", "Lima" },
                    new List<string> { "Lima","Sao Paulo" },
                },
                "Sao Paulo"
            },
            new object[]
            {
                new List<List<string>>
                {
                    new List<string> { "B","C" },
                    new List<string> { "D","B" },
                    new List<string> {"C","A" },
                },
                "A"
            },
                        new object[]
            {
                new List<List<string>>
                {
                    new List<string> {"A","Z" },
                },
                "Z"
            },
        };

        [Theory]
        [MemberData(nameof(Data))]
        public void CheckArr_DestCity_RetunStr(List<List<string>> s, string check)
        {
            // Arrange
            var leet = new Leet1436();

            // Act
            var result = leet.DestCity(s);

            // Assert
            Assert.Equal(result, check);
        }
    }
}