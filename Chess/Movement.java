package JavaProjects.Chess;

import static JavaProjects.Chess.ValidMoves.isCheck;
import JavaProjects.Chess.PieceArray;

public class Movement {

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

    static void pieceCapture(Piece p , Position next){
            if(p.legalMove(next)){
                if(p.color == Color.BLACK){
                    if(next.getPieceFrom().color == Color.WHITE){
                        Piece n = new Null(p.currentPosition);
                        p.currentPosition.setPieceAt(n);
                        next.setPieceAt(p);
                    }
                }
                if(p.color == Color.WHITE){
                    if(next.getPieceFrom().color == Color.BLACK){
                        Piece n = new Null(p.currentPosition);
                        p.currentPosition.setPieceAt(n);
                        next.setPieceAt(p);
                    }
                }
            }
    }

    static void movePawn(Pawn p , Position next){
        if(p.legalMove(next)){
            if((next.y == p.currentPosition.y + 1 || next.y == p.currentPosition.y - 1) && next.x == p.currentPosition.x + 1){
                pawnCapture(p , next);
            }
        }
        else{
            Piece n = next.getPieceFrom();
            p.currentPosition.setPieceAt(n);
            next.setPieceAt(p);
        }
    }

    static void movePiece(Piece p , Position next){
        if(p.legalMove(next)){
            if(!next.pieceExist()){
                Piece n = next.getPieceFrom();
                p.currentPosition.setPieceAt(n);
                next.setPieceAt(p);
                if(isCheck(p)){if(p.color == Color.BLACK){}}
            }
            else{
                pieceCapture(p, next);
            }
        }
    }


}
