import java.util.Scanner;

public class TicTacToe {
private static char[][] board = new char[3][3];
private static char currentPlayer = 'X';

  public static void main(String[] args){
  initializeBoard();
  printBoard();

  while (true){
  playerMove();
  printBoard();
  if (checkWinner()){
      System.out.println("Player " + currentPlayer+ "wins!" );
      break;
  }
  if (isBoardfull()) {
      System.out.println("The game is tie!");
  }
  switchPlayer();
  }
  }
  private static void initializeBoard(){
      for (int i =0;i<3;i++){
          for (int j = 0; j<3;j++){
              board[i][j]='-';

          }
      }
  }
  private static void printBoard(){
      for (int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              System.out.print(board[i][j] + " ");
          }
          System.out.println();
      }
  }
  protected static void playerMove(){
      try (Scanner Scanner = new Scanner(System.in)) {
        int row,col;

          while (true){
              System.out.println("Player" + currentPlayer + ", enter your move (row [1-3] and column [1-3]: ");
              row = Scanner.nextInt()-1;
          col= Scanner.nextInt()-1;
              if (row >= 0 && col>= 0 && col <3 && board[row][col]=='-') {
                 board[row][col]= currentPlayer;
                 break;
              }else{
                  System.out.println("This move is not valid");
              }
          }
    }
  }
  private static boolean checkWinner() {
      for (int i = 0;i<3;i++){
          if (board[i][0] == currentPlayer && board[i][1]==currentPlayer && board[i][2]==currentPlayer) {
              return true;
          }
          if (board[0][i] == currentPlayer && board[1][i]==currentPlayer && board[2][i]==currentPlayer){
         return true;
      }
  }
      if (board[0][0] == currentPlayer && board[1][1]==currentPlayer && board[2][2]==currentPlayer){
          return true;
      }
      if (board[0][2] == currentPlayer && board[1][1]==currentPlayer && board[2][0]==currentPlayer){
          return true;
      }
      return false;
}
private static boolean isBoardfull(){
  for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
          if (board[i][j] == '-'){
              return false;
          }
      }
  }
  return true;
  }
  private static void switchPlayer(){
      currentPlayer=(currentPlayer=='X')? '0': 'X';
  }
}