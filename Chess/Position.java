package JavaProjects.Chess;

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
       return getPieceFrom(this.x , this.y , PieceArray.chessBoard);
    }

    void setPieceAt(Piece p , int x , int y , Piece[][] board ){
         board[x][y] = p;
    }

    void setPieceAt(Piece p ){
        setPieceAt(p , this.x , this.y , PieceArray.chessBoard);
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

}

