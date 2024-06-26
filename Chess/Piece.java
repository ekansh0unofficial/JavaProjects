package JavaProjects.Chess;

public abstract class Piece {

    Color color;
    Pieces type ;
    boolean alive;
    Position currentPosition;

    public Piece(Color color, Pieces type, boolean alive, Position currentPosition) {
        this.color = color;
        this.type = type;
        this.alive = alive;
        this.currentPosition = currentPosition;
    }

    abstract boolean legalMove(Position p);

}


class Pawn extends Piece{
    Position initial_position;
    public Pawn(Color color, Pieces type, boolean alive, Position currentPosition) {
        super(color, type, alive, currentPosition);
        initial_position = currentPosition;
    }

    @Override
    boolean legalMove(Position p) {
        return ValidMoves.validPawn(this ,p);
    }
}

class Bishop extends Piece{
    public Bishop(Color color, Pieces type, boolean alive, Position currentPosition) {
        super(color, type, alive, currentPosition);
    }

    boolean legalMove(Position p){
       return ValidMoves.validBishop(this , p );
    }
}

class Knight extends Piece{
    public Knight(Color color, Pieces type, boolean alive, Position currentPosition) {
        super(color, type, alive, currentPosition);
    }

    @Override
    boolean legalMove(Position p) {
        return ValidMoves.validKnight(this , p);
    }
}

class Rook extends Piece{

     Rook(Color color, Pieces type, boolean alive, Position currentPosition) {
        super(color, type, alive, currentPosition);
    }

    @Override
    boolean legalMove(Position p) {
        return ValidMoves.validRook(this , p);
    }
}

class King extends Piece{

    boolean check = false;
    boolean checkMate = false;
    public King(Color color, Pieces type, boolean alive, Position currentPosition) {
        super(color, type, alive, currentPosition);
    }
    void setCheck(boolean b){this.check = b;}
    void getCheckStatus(boolean b){this.check = b;}
    void setCheckMate(boolean b){this.checkMate =b; }
    boolean legalMove(Position p){
        return false;
    }
}

class Queen extends Piece{
    public Queen(Color color, Pieces type, boolean alive, Position currentPosition) {
        super(color, type, alive, currentPosition);
    }
    @Override
    boolean legalMove(Position p){
        return ValidMoves.validQueen(this , p);
    }
}

class Null extends Piece{
     Null(Position currentPosition) {
        super(Color.NULL, Pieces.NULL, true, currentPosition);
    }

    @Override
    boolean legalMove(Position p){
         return false;
    }

}


