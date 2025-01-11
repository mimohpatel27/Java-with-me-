
public class sudoku{
    public boolean isSafe(char[][] board , int row, int col,int number){
        //column representation 
        for(int i=0;i<board.length;i++){
            if(board[i][col]==(char)(number+'0')){
                return false;
            }
        }
        //row representation 
        for(int j=0;j<board.length;j++){
            if(board[row][j]==(char)(number+'0')){
                return false;
            }
        }
        // grid 
        //sr= starting row
        //sc=starting colomn
        int sr=3*(row/3);
        int sc=3*(col/3);
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==(char)(number + '0')){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][]board, int row, int col){
        //base case
        if(row==board.length){
            return true;
        }
        //nrow=next row and ncol=next colomn
        int nrow=0;
        int ncol=0;
        if(col==board.length-1){
            nrow=row+1;
            ncol=0;
        }else{
            nrow=row;
            ncol=col+1;
        }
        if(board[row][col]!='.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        }else{
            //now we are filling the gaps
            for(int i=1;i<=9;i++){
                if(isSafe(board, row, col,i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board, nrow, ncol))
                    return true;
                    else
                        board[row][col]='.';//back tracking part which is most important for the code ...
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][]board){
        helper(board, 0, 0);
    }
    public static void main(String[] args) {
        sudoku sudokusolver =new sudoku();
        char[][]board={{'1','2','.','8','.','6','.','.','9'}
        ,{'.','.','6','.','7','1','8','2','3'},
        {'7','.','.','.','4','.','.','.','5'},
        {'6','7','1','.','2','3','.','.','8'},
        {'3','.','5','.','.','.','2','1','.'},
        {'.','4','.','1','9','.','6','3','.'},
        {'.','6','.','.','3','.','.','5','.'},
        {'9','.','7','.','.','.','3','.','2'},
        {'5','.','.','.','1','9','.','8','6'}};
            
            System.out.println("Print original solution of sudoku puzzle");
            printBoard(board);
            sudokusolver.solveSudoku(board);
            System.out.println("\nSolved Sudoku Puzzle");
            printBoard(board);//here i got the error thts why i stusked while trying 1st time ...
    }
    public static void printBoard(char[][]board){
        for(char[]row:board){
            for(char cell : row){
                System.out.print(cell +" ");
            }
            System.out.println();
        }
    }
}
