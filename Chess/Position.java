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
    Piece pieceAt(int x , int y){
       return pieceAt(x , y , PieceArray.chessBoard);
    }
}

