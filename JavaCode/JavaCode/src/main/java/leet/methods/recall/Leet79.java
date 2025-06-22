package leet.methods.recall;

public class Leet79 {


    public boolean exist(char[][] board, String word) {
        //转换字符数组
        char[] chars = word.toCharArray();
        //从每一个字符开始遍历
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(backtracking(board,chars,i,j,0)) return true;
            }
        }
        return false;
    }

    boolean backtracking(char[][] board, char[] chars, int i,int j, int index) {
        //边界判断 判断是否为目标字符
        if(i>=board.length || i<0 || j>= board[i].length || j<0 || board[i][j]==chars[index]) return false;
        //判断是否找到目标元素
        if(index == chars.length-1)return true;
        //避免重复使用
        board[i][j]='\0';
        //递归上下左右
        boolean res = backtracking(board,chars,i+1,j,index+1) || backtracking(board,chars,i-1,j,index+1)||
                      backtracking(board,chars,i,j-1,index+1) || backtracking(board,chars,i,j+1,index+1) ;
        //退回状态
        board[i][j] = chars[index];
        return res;
    }
}
