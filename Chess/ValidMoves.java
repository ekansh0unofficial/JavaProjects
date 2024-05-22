package JavaProjects.Chess;

import static java.lang.Math.abs;

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
                    if (next.getPieceFrom().color == Color.WHITE) {
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
                    if (next.getPieceFrom().color == Color.BLACK) {
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

        if(p.color == Color.BLACK){
            if (next.x == p.currentPosition.x + 2) {
                if (PieceArray.chessBoard[p.currentPosition.x + 1][p.currentPosition.y].type == Pieces.NULL) {
                    if (PieceArray.chessBoard[p.currentPosition.x + 2][p.currentPosition.y].type == Pieces.NULL) {
                        return true;
                    }
                }
            }
            if (next.x == p.currentPosition.x + 1) {
                if (PieceArray.chessBoard[p.currentPosition.x + 1][p.currentPosition.y].type == Pieces.NULL) {
                    return true;
                }
            }
        }

        if(p.color == Color.WHITE){
            if (next.x == p.currentPosition.x - 2) {
                if (PieceArray.chessBoard[p.currentPosition.x - 1][p.currentPosition.y].type == Pieces.NULL) {
                    if (PieceArray.chessBoard[p.currentPosition.x - 2][p.currentPosition.y].type == Pieces.NULL) {
                        return true;
                    }
                }
            }
            if (next.x == p.currentPosition.x - 1) {
                if (PieceArray.chessBoard[p.currentPosition.x - 1][p.currentPosition.y].type == Pieces.NULL) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean validBishop(Piece b , Position next){
        if (next.x >= 8 || next.x < 0 || next.y >= 8 || next.y < 0) {
            return false; // Next position is out of Board
        }
        if (abs(b.currentPosition.x - next.x) != abs(b.currentPosition.y - next.y)) {
            return false;  // Not a diagonal move
        }
        else{
            boolean p;
            if(!emptyBishopPath(b , next)){p = false;}
            if(next.getPieceFrom().color == b.color ){p = false;}
            else{p = true;}
            return p;
        }
    }

    static boolean emptyBishopPath(Piece b , Position next) {
        int cx = b.currentPosition.x;
        int nx = next.x;
        int cy = b.currentPosition.y;
        int ny = next.y;

        int xD = (nx > cx) ? 1 : -1;
        int yD = (ny > cy) ? 1 : -1;

        for (int x = cx + xD, y = cy + yD; x != nx; x += xD, y += yD) {
            if (PieceArray.chessBoard[x][y].type != Pieces.NULL) {
                return false;
            }
        }
        if(next.getPieceFrom().color == b.color){return false;}

        return  true;
    }

      static boolean validRook(Piece r , Position next){
        if (next.x >= 8 || next.x < 0 || next.y >= 8 || next.y < 0) {
            return false;
        }

        if(r.currentPosition.x != next.x && r.currentPosition.y != next.y ){return false;}
        if(!emptyRookPath(r, next)){return false;}
        return true;
    }

    static boolean emptyRookPath(Piece r, Position next){
        int cx = r.currentPosition.x;
        int nx = next.x;
        int cy = r.currentPosition.y;
        int ny = next.y;

        int xD = (nx > cx) ? 1 : -1;
        int yD = (ny > cy) ? 1 : -1;

        if(cx -nx == 0){
            for(int i = cy +yD ; i != ny ; i+=yD){
                if (PieceArray.chessBoard[cx][i].type != Pieces.NULL) {
                    return false;
                }
            }
        }

        if(cy -ny == 0){
            for(int i = cx +xD ; i != nx ; i+=xD){
                if (PieceArray.chessBoard[i][cy].type != Pieces.NULL) {
                    return false;
                }
            }
        }
        if(next.getPieceFrom().color == r.color){return false;}
        return true;
    }

    static boolean validKnight(Knight k , Position next){

        int cx = k.currentPosition.x ;
        int nx = next.x;
        int cy = k.currentPosition.y;
        int ny = next.y;

        if((abs(cx - nx) == 1 && abs(cy - ny) == 2) || (abs(cx - nx) == 2 && abs(cy - ny) == 1) ){return true;}
        return false;
    }

    static boolean validQueen(Queen q, Position next){
        if(validRook(q,next) || validBishop(q,next)){return true;}
        return false;
    }



}