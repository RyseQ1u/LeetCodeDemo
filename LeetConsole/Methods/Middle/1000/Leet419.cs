using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 419
    /// </summary>
    public class Leet419
    {
        #region 方法一遍历

        public int CountBattleships(char[][] board)
        {
            var result = 0;
            var visited = new Dictionary<(int, int), bool>();
            for (int i = 0; i < board.Length; i++)
            {
                for (int j = 0; j < board[i].Length; j++)
                {
                    visited.TryGetValue((i, j), out bool vis);
                    if (!vis)
                    {
                        if (board[i][j] == 'X')
                        {
                            FindNear(visited, board, i, j);
                            result++;
                        }
                        visited[(i, j)] = true;
                    }
                }
            }
            return result;
        }

        public void FindNear(Dictionary<(int, int), bool> visited, char[][] board, int x, int y)
        {
            //由于遍历的关系，只需要往下和右两个方向遍历

            //垂直

            for (int i = x + 1; i < board.Length; i++)
            {
                if (board[i][y] == 'X' && visited.TryAdd((i, y), true))
                {
                }
                else
                {
                    break;
                }
            }
            //水平
            for (int j = y + 1; j < board[x].Length; j++)
            {
                if (board[x][j] == 'X' && visited.TryAdd((x, j), true))
                {
                }
                else
                {
                    break;
                }
            }
        }

        #endregion 方法一遍历

        #region 方法二找船头

        /// <summary>
        /// 找船头 船头不会与其他船体相互连接
        /// </summary>
        /// <param name="board"></param>
        /// <returns></returns>
        public int countBattleships2(char[][] board)
        {
            int row = board.Length;
            int col = board[0].Length;
            int ans = 0;
            for (int i = 0; i < row; ++i)
            {
                for (int j = 0; j < col; ++j)
                {
                    if (board[i][j] == 'X')
                    {
                        if (i > 0 && board[i - 1][j] == 'X')
                        {
                            continue;
                        }
                        if (j > 0 && board[i][j - 1] == 'X')
                        {
                            continue;
                        }
                        ans++;
                    }
                }
            }
            return ans;
        }

        #endregion 方法二找船头
    }
}