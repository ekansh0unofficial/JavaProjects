package JavaProjects.Chess;

public class ValidMoves {

    static boolean validPawn(Pawn p, Position next) {

        if (next.x >= 8 || next.x < 0 || next.y >= 8 || next.y < 0) {
            return false;
        } else {
            if (p.color == Color.BLACK ) {

                //handles when pawn at initial position
                if (p.currentPosition.isEqual(p.initial_position) && emptyPawnPath(p , next)) {
                    return (next.x == p.currentPosition.x + 1 || next.x == p.currentPosition.x + 2) && next.y == p.currentPosition.y;
                }

                //handles the capture scenarrio
                if ((next.y == p.currentPosition.y + 1 || next.y == p.currentPosition.y - 1) && next.x == p.currentPosition.x + 1) {
                    if (next.pieceAt().color == Color.WHITE) {
                        return true;
                    }
                }

                //handles normal movement
                if (next.x == p.currentPosition.x + 1 && next.y == p.currentPosition.y && emptyPawnPath(p , next)) {
                    return true;
                }
            }

            if (p.color == Color.WHITE) {

                //handles when pawn is at initial position
                if (p.currentPosition.isEqual(p.initial_position)) {
                    return (next.x == p.currentPosition.x - 1 || next.x == p.currentPosition.x - 2) && next.y == p.currentPosition.y;
                }

                //handles the capture scenarrio
                if ((next.y == p.currentPosition.y + 1 || next.y == p.currentPosition.y - 1) && next.x == p.currentPosition.x - 1) {
                    if (next.pieceAt().color == Color.BLACK) {
                        return true;
                    }
                }

                //handles normal movement
                if (next.x == p.currentPosition.x - 1 && next.y == p.currentPosition.y && emptyPawnPath(p , next)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean emptyPawnPath(Pawn p , Position next) {

        if(next.x == p.currentPosition.x+2 ){
            if(PieceArray.chessBoard[p.currentPosition.x+1][p.currentPosition.y].type  == Pieces.NULL){
                if(PieceArray.chessBoard[p.currentPosition.x+2][p.currentPosition.y].type  == Pieces.NULL){
                    return true;
                }
            }
        }
        if(next.x == p.currentPosition.x+1 ){
            if(PieceArray.chessBoard[p.currentPosition.x+1][p.currentPosition.y].type  == Pieces.NULL){
                return true;
            }
        }
        if(next.x == p.currentPosition.x-2 ){
            if(PieceArray.chessBoard[p.currentPosition.x-1][p.currentPosition.y].type  == Pieces.NULL){
                if(PieceArray.chessBoard[p.currentPosition.x-2][p.currentPosition.y].type  == Pieces.NULL){
                    return true;
                }
            }
        }
        if(next.x == p.currentPosition.x-1 ){
            if(PieceArray.chessBoard[p.currentPosition.x-1][p.currentPosition.y].type  == Pieces.NULL){
             return true;
            }
        }
        return false;
    }

    static boolean validBishop(Bishop b , Position next){return false; }

}