package JavaProjects.Chess;

public class PieceData {

    static  Rook rookBL = new Rook(Color.BLACK, Pieces.ROOK, true, new Position(0, 0));
    static  Piece knightBL = new Knight(Color.BLACK, Pieces.KNIGHT, true, new Position(0, 1));
    static  Piece bishopBL = new Bishop(Color.BLACK, Pieces.BISHOP, true, new Position(0, 2));
    static  Piece queenB = new Queen(Color.BLACK, Pieces.QUEEN, true, new Position(0, 3));
    static  Piece kingB = new King(Color.BLACK, Pieces.KING, true, new Position(0, 4));
    static  Piece bishopBR = new Bishop(Color.BLACK, Pieces.BISHOP, true, new Position(0, 5));
    static  Piece knightBR = new Knight(Color.BLACK, Pieces.KNIGHT, true, new Position(0, 6));
    static  Piece rookBR = new Rook(Color.BLACK, Pieces.ROOK, true, new Position(0, 7));



    static  Piece rookWL = new Rook(Color.WHITE, Pieces.ROOK, true, new Position(7, 0));
    static  Piece knightWL = new Knight(Color.WHITE, Pieces.KNIGHT, true, new Position(7, 1));
    static  Piece bishopWL = new Bishop(Color.WHITE, Pieces.BISHOP, true, new Position(7, 2));
    static  Piece queenW = new Queen(Color.WHITE, Pieces.QUEEN, true, new Position(7, 3));
    static  Piece kingW = new King(Color.WHITE, Pieces.KING, true, new Position(7, 4));
    static  Piece bishopWR = new Bishop(Color.WHITE, Pieces.BISHOP, true, new Position(7, 5));
    static  Piece knightWR = new Knight(Color.WHITE, Pieces.KNIGHT, true, new Position(7, 6));
    static  Piece rookWR  = new Rook(Color.WHITE, Pieces.ROOK, true, new Position(7, 7));

    static  Piece[] pawnB = initialiseBlackPawns();
    static  Piece[] pawnW = initialiseWhitePawns();


    static Piece[] initialiseBlackPawns(){
        Piece[] array = new Piece[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Pawn(Color.BLACK, Pieces.PAWN, true, new Position(1, i));
        }
        return array;
    }

    static Piece[] initialiseWhitePawns(){
        Piece[] array = new Piece[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Pawn(Color.BLACK, Pieces.PAWN, true, new Position(6, i));
        }
        return array;
    }
}
