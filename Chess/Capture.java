package JavaProjects.Chess;

public class Capture {

    static void pawnCapture(Pawn p , Position next){
        if(ValidMoves.validPawn(p , next)){
            if(p.color == Color.BLACK){
                if((next.y == p.currentPosition.y + 1 || next.y == p.currentPosition.y - 1) && next.x == p.currentPosition.x + 1) {
                    if (next.getPieceFrom().color == Color.WHITE) {

                    }
                }
            }
        }
    }
}
