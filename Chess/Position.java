package JavaProjects.Chess;

import JavaProjects.Chess.Piece;
import JavaProjects.Chess.PieceArray;

public class Position {
    int x;
    int y;

    Position( int x , int y ){
        if(x<8 && x>=0 && y<8 && y>=0){
        this.x = x;
        this.y = y;
        }
    }

    Piece pieceAt(int x , int y  , Piece[][] board ){

        return board[x][y];
    }

    Piece pieceAt(){
       return pieceAt(this.x , this.y , PieceArray.chessBoard);
    }

    boolean isEqual(Position p) {
        if (p.x == this.x && p.y == this.y) {
            return true;
        }
        return false;
    }

    boolean pieceExist(){
        if(pieceAt().type == Pieces.NULL){
            return false;
        }
        else{
            return true;
        }
    }

}

