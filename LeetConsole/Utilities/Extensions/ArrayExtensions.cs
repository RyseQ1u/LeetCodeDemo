using System.Linq;

namespace LeetCode.Utilities.Extensions
{
    public static class ArrayExtensions
    {
        // 扩展方法，用于数组
        public static string CustomToString<T>(this T[] arr)
        {
            return string.Join(", ", arr.Select(x => x.ToString()));
        }
    }
}