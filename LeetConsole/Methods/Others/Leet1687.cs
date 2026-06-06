namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1687
    /// </summary>
    public class Leet1687
    {
        public int Action()
        {
            var boxes = new int[][] { new int[] { 1, 1 }, new int[] { 2, 1 }, new int[] { 1, 1 } };
            int portsCount = 2;
            int maxBoxes = 3;
            int maxWeight = 3;
            return Function1(boxes, portsCount, maxBoxes, maxWeight);
        }

        public int Function1(int[][] boxes, int portsCount, int maxBoxes, int maxWeight)
        {
            int count = 0;
            for (int i = 0; i < boxes.Length; i++)
            {
                if (boxes[i][1] == 1)
                {
                }
            }
            return count;
        }

        public int[] Function2(string s)
        {
            var arr = new int[s.Length];
            for (int j = 0; j < arr.Length; j++)
            {
                for (int i = 0; i < s.Length; i++)
                {
                    if (s[i] == '1')
                    {
                        arr[j] = i >= j ? arr[j] += i - j : arr[j] += j - i;
                    }
                }
            }
            return arr;
        }
    }
}