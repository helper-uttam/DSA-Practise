
public class Main
{
    
    static boolean isSafe( boolean[][] board, int row, int col ){
        //for horizontal row
        for (int i = 0; i < board.length; i++){
            if(board[row][i]){
                return false;
            }
        } 
        
        //for vertical row
        for (int i = 0; i < board[0].length; i++){
            if(board[i][col]){
                return false;
            }
        } 
        
        //for left diagonal
        int min = Math.min(row, col);
        for (int i = 1; i<=min; i++ ){
            if(board[row-i][col-i]){
                return false; 
            }
        } 
        
        //for right diagonal
        int max = Math.min(row, board[0].length - col - 1);
        for (int i = 1; i<=max; i++ ){
            if(board[row-i][col+i]){
                return false; 
            }
        } 
        
        return true;
    }
    
    static void display( boolean[][] board){
        for(boolean[] arr: board){
            for(boolean element: arr){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    
    
    static int nQueen( boolean[][] board, int r){
        
        if( r == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        
        int count = 0;
        for (int col = 0; col < board.length; col++ ){
            if(isSafe(board, r, col)){
                board[r][col] = true;
                count += nQueen(board, r+1);
                board[r][col] = false;
            }
        }
        
        return count;
    }
    
	public static void main(String[] args) {
		
		int n = 4;
		boolean[][] board = new boolean[n][n];
		
		System.out.println(nQueen(board, 0));
	}
}
