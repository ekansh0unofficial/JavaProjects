package JavaProjects.Chess;

import java.util.ArrayList;


public class PieceArray {

        static Piece[][] chessBoard = new Piece[8][8];
        static final ArrayList<Piece> blackPiece = getAllBlackPieces();
        static final  ArrayList<Piece> whitePiece = getAllWhitePieces();
        static Position kingBlackPosition = new Position(0,4);
        static Position kingWhitePosition = new Position(7,4);

        void initialiseArray() {

                chessBoard[0][0] = PieceData.rookBL;
                chessBoard[0][1] = PieceData.knightBL;
                chessBoard[0][2] = PieceData.bishopBL;
                chessBoard[0][3] = PieceData.queenB;
                chessBoard[0][4] = PieceData.kingB;
                chessBoard[0][5] = PieceData.bishopBR;
                chessBoard[0][6] = PieceData.knightBR;
                chessBoard[0][7] = PieceData.rookBR;

                for (int i = 0; i < 8; i++) {
                        chessBoard[1][i] = PieceData.pawnB[i];
                }

                for (int i = 2; i < 6; i++) {
                        for (int j = 0; j < 8; j++) {
                                chessBoard[i][j] = new Null(new Position(i, j));
                        }
                }

                for (int i = 6; i < 8; i++) {
                        chessBoard[1][i] = PieceData.pawnW[i];
                }

                chessBoard[7][0] = PieceData.rookWL;
                chessBoard[7][1] = PieceData.knightWL;
                chessBoard[7][2] = PieceData.bishopWL;
                chessBoard[7][3] = PieceData.queenW;
                chessBoard[7][4] = PieceData.kingW;
                chessBoard[7][5] = PieceData.bishopWR;
                chessBoard[7][6] = PieceData.knightWR;
                chessBoard[7][7] = PieceData.rookWR;
        }

        public static ArrayList<Piece> getAllBlackPieces() {
                ArrayList<Piece> blackPieces = new ArrayList<>();

                for (int row = 0; row < 2; row++) {
                    for (int col = 0; col < 8; col++) {
                        Piece piece = chessBoard[row][col];
                        blackPieces.add(piece);
                    }
                }
                return blackPieces;
        }
        public static ArrayList<Piece> getAllWhitePieces() {
                ArrayList<Piece> whitePieces = new ArrayList<>();

                for (int row = 6; row < 8; row++) {
                        for (int col = 0; col < 8; col++) {
                                Piece piece = chessBoard[row][col];
                                whitePieces.add(piece);
                        }
                }

                return whitePieces;
        }

        static public void updateWhiteKing(Position p){
                kingWhitePosition =p;
        }

        static public void updateBlackKing(Position p){
                kingBlackPosition =p;
        }

        static public Position whiteKing(){
                return kingWhitePosition;
        }

        static public Position blackKing(){
                return kingWhitePosition;
        }

}