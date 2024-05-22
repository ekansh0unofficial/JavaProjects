package JavaProjects.Chess;

import static JavaProjects.Chess.PieceArray.chessBoard;

public class Position {
    int x;
    int y;

    Position( int x , int y ){
        if(x<8 && x>=0 && y<8 && y>=0){
        this.x = x;
        this.y = y;
        }
    }

    Piece getPieceFrom(int x , int y  , Piece[][] board ){
        return board[x][y];
    }

    Piece getPieceFrom(){
       return getPieceFrom(this.x , this.y , chessBoard);
    }

    void setPieceAt(Piece p , int x , int y , Piece[][] board ){
         board[x][y] = p;
         p.currentPosition = new Position(x,y);
    }

    void setPieceAt(Piece p ){
        setPieceAt(p , this.x , this.y , chessBoard);
    }

    boolean isEqual(Position p) {
        if (p.x == this.x && p.y == this.y) {
            return true;
        }
        return false;
    }

    boolean pieceExist(){
        if(getPieceFrom().type == Pieces.NULL){
            return false;
        }
        else{
            return true;
        }
    }

    boolean causeCheck(Bishop b){
        int x = this.x;
        int y = this.y;
        if(b.color == Color.BLACK){
            int[][] dir = {{-1,-1} , {-1 ,1} , {1,1} , {1, -1}};

            for (int[] ints : dir) {

                while(true) {

                    x += ints[0];
                    y += ints[1];

                    if (x >= 0 && x < 8 && y >= 0 && y < 8) {
                        if (chessBoard[x][y].type == Pieces.KING && chessBoard[x][y].color == Color.WHITE ) {
                            return true;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        if(b.color == Color.WHITE){
            int[][] dir = {{-1,-1} , {-1 ,1} , {1,1} , {1, -1}};

            for (int[] ints : dir) {

                while(true) {

                    x += ints[0];
                    y += ints[1];

                    if (x >= 0 && x < 8 && y >= 0 && y < 8) {
                        if (chessBoard[x][y].type == Pieces.KING && chessBoard[x][y].color == Color.BLACK ) {
                            return true;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return false;
    }

    boolean causeCheck(Rook r){

        int x = this.x;
        int y = this.y;



        return false;
    }
}

