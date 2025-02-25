namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 999
    /// </summary>
    public class Leet999
    {
        public int NumRookCaptures(char[][] board)
        {
            var res = 0;
            //找到位置R
            (int x, int y) local = (0, 0);
            var n = board.Length;
            var f = false;
            for (int i = 0; i < n; i++)
            {
                if (f) break;
                for (int j = 0; j < board[i].Length; j++)
                {
                    if (board[i][j] == 'R')
                    {
                        local = (i, j);
                        f = true;
                        break;
                    }
                }
            }
            //行->
            for (int i = local.y; i < n; i++)
            {
                var x = local.x;
                if (board[x][i] == 'p')
                {
                    res++;
                    break;
                }
                else if (board[x][i] == 'B')
                {
                    break;
                }
            }
            //行<-
            for (int i = local.y; i >= 0; i--)
            {
                var x = local.x;
                if (board[x][i] == 'p')
                {
                    res++;
                    break;
                }
                else if (board[x][i] == 'B')
                {
                    break;
                }
            }
            //列->
            for (int i = local.x; i < n; i++)
            {
                var y = local.y;
                if (board[i][y] == 'p')
                {
                    res++;
                    break;
                }
                else if (board[i][y] == 'B')
                {
                    break;
                }
            }
            //列<-
            for (int i = local.y; i >= 0; i--)
            {
                var y = local.y;
                if (board[i][y] == 'p')
                {
                    res++;
                    break;
                }
                else if (board[i][y] == 'B')
                {
                    break;
                }
            }
            return res;
        }
    }
}