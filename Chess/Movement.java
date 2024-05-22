package JavaProjects.Chess;

public class Capture {

    static void pawnCapture(Pawn p , Position next){
        if(p.legalMove(next)){
            if(p.color == Color.BLACK){
                if((next.y == p.currentPosition.y + 1 || next.y == p.currentPosition.y - 1) && next.x == p.currentPosition.x + 1) {
                    if (next.getPieceFrom().color == Color.WHITE) {
                        Piece n = new Null(p.currentPosition);
                        p.currentPosition.setPieceAt(n);
                        next.setPieceAt(p);
                    }
                }
            }
            if(p.color == Color.WHITE){
                if((next.y == p.currentPosition.y + 1 || next.y == p.currentPosition.y - 1) && next.x == p.currentPosition.x + 1) {
                    if (next.getPieceFrom().color == Color.BLACK) {
                        Piece n = new Null(p.currentPosition);
                        p.currentPosition.setPieceAt(n);
                        next.setPieceAt(p);
                    }
                }
            }
        }
    }

    static void bishopCapture(Bishop b , Position next){
            if(b.legalMove(next)){
                if(b.color == Color.BLACK){
                    if(next.getPieceFrom().color == Color.WHITE){
                        Piece n = new Null(b.currentPosition);
                        b.currentPosition.setPieceAt(n);
                        next.setPieceAt(b);
                    }
                }
                if(b.color == Color.WHITE){
                    if(next.getPieceFrom().color == Color.BLACK){
                        Piece n = new Null(b.currentPosition);
                        b.currentPosition.setPieceAt(n);
                        next.setPieceAt(b);
                    }
                }
            }
    }

    static void rookCapture(Rook r , Position next){

    }
}
