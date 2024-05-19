package JavaProjects.Chess;

public class PieceArray {

        static Piece[][] chessBoard = new Piece[8][8];

        void initialiseArray(){

                chessBoard[0][0] = new Rook(Color.BLACK , Pieces.ROOK , true , new Position(0,0));
                chessBoard[0][1] = new Knight(Color.BLACK , Pieces.KNIGHT , true , new Position(0,1));
                chessBoard[0][2] = new Bishop(Color.BLACK , Pieces.BISHOP , true , new Position(0,2 ));
                chessBoard[0][3] = new Queen(Color.BLACK , Pieces.QUEEN , true , new Position(0,3));
                chessBoard[0][4] = new King(Color.BLACK , Pieces.KING , true , new Position(0,4));
                chessBoard[0][5] = new Bishop(Color.BLACK , Pieces.BISHOP , true , new Position(0,5));
                chessBoard[0][6] = new Knight(Color.BLACK , Pieces.KNIGHT , true , new Position(0,6));
                chessBoard[0][7] = new Rook(Color.BLACK , Pieces.ROOK , true , new Position(0,7));

                for (int i = 0;   i <8; i++) {
                        chessBoard[1][i] = new Pawn(Color.BLACK, Pieces.PAWN, true, new Position(1, i));
                }

                for(int i = 2 ; i<6 ; i++ ){
                        for (int j = 0; j < 8; j++) {
                                chessBoard[i][j] = new Null(new Position(i,j));
                        }
                }

                for (int i = 6;   i <8; i++) {
                        chessBoard[1][i] = new Pawn(Color.WHITE, Pieces.PAWN, true, new Position(6, i));
                }

                chessBoard[7][0] = new Rook(Color.WHITE , Pieces.ROOK , true , new Position(7,0));
                chessBoard[7][1] = new Knight(Color.WHITE , Pieces.KNIGHT , true , new Position(7,1));
                chessBoard[7][2] = new Bishop(Color.WHITE , Pieces.BISHOP , true , new Position(7,2 ));
                chessBoard[7][3] = new Queen(Color.WHITE , Pieces.QUEEN , true , new Position(7,3));
                chessBoard[7][4] = new King(Color.WHITE , Pieces.KING , true , new Position(7,4));
                chessBoard[7][5] = new Bishop(Color.WHITE , Pieces.BISHOP , true , new Position(7,5));
                chessBoard[7][6] = new Knight(Color.WHITE , Pieces.KNIGHT , true , new Position(7,6));
                chessBoard[7][7] = new Rook(Color.WHITE, Pieces.ROOK , true , new Position(7,7));
        }
}
