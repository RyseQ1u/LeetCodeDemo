namespace ConsoleApp3.Methods
{
    /// <summary>
    ///Method2397
    /// </summary>
    public class Leet2397
    {
        public int Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8,new ListNode(15))))));
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
            //int[][] ints = new int[][] { new int[] { 0, 0, 0 }, new int[] { 1, 0, 1 }, new int[] { 0, 1, 1 }, new int[] { 0, 0, 1 } };
            int[][] ints = new int[][] { new int[] { 1 }, new int[] { 0 } };
            return MaximumRows(ints, 1);
        }

        public int MaximumRows(int[][] matrix, int numSelect)
        {
            int r = 0;
            int[] ints = new int[matrix[0].Length];
            for (int i = 0; i < matrix[i].Length; i++)
            {
                var c = 0;
                for (int j = 0; j < matrix.Length; j++)
                {
                    c += matrix[j][i];
                }
                ints[i] = c;
            }
            InsertionSort(ints);
            for (int i = 0; i < ints.Length - numSelect; i++)
            {
                r += ints[i];
            }
            return r;
        }

        public static void InsertionSort(int[] arr)
        {
            // 遍历从1到数组长度-1的所有元素（假设第一个元素默认为有序）
            for (int i = 1; i < arr.Length; i++)
            {
                // 记录当前需要插入的元素值
                int key = arr[i];
                // 将当前元素与左侧已排序序列进行比较并找到合适的位置
                int j = i - 1;

                // 当前元素左边的元素大于当前元素时，就将左边的元素后移一位
                while (j >= 0 && arr[j] > key)
                {
                    arr[j + 1] = arr[j];
                    j--;
                }

                // 在找到的正确位置插入当前元素
                arr[j + 1] = key;
            }
        }
    }
}