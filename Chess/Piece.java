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
}

class Knight extends Piece{
    public Knight(Color color, Pieces type, boolean alive, Position currentPosition) {
        super(color, type, alive, currentPosition);
    }
}

class Rook extends Piece{

     Rook(Color color, Pieces type, boolean alive, Position currentPosition) {
        super(color, type, alive, currentPosition);
    }
}

class King extends Piece{
    public King(Color color, Pieces type, boolean alive, Position currentPosition) {
        super(color, type, alive, currentPosition);
    }
}

class Queen extends Piece{
    public Queen(Color color, Pieces type, boolean alive, Position currentPosition) {
        super(color, type, alive, currentPosition);
    }
}

class Null extends Piece{
     Null(Position currentPosition) {
        super(Color.NULL, Pieces.NULL, true, currentPosition);
    }


}


