package lv;

import lv.figure.*;

public class Chess {

    private Figure[][] board = new Figure[8][8];

    public static void main(String[] args) {
        Chess c = new Chess();
        c.printPawn(true);
        c.printPawn(false);
        c.printRook(true);
        c.printRook(false);
        c.printKnight(true);
        c.printKnight(false);
        c.printBishop(true);
        c.printBishop(false);
        c.printQueen(true);
        c.printQueen(false);
        c.printKing(true);
        c.printKing(false);
        c.print();


    }

    private void print(){
        for (int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(board[i][j] != null){
                    System.out.print(board[i][j]);
                }else if((i%2 == 1 && j%2 == 1) || (i%2 == 0 && j%2 == 0)){
                        System.out.print("\u25A1");

                } else if((i%2 == 1 && j%2 == 0) || (i%2 == 0 && j%2 == 1)){
                    System.out.print("\u25A0");
                }
            }
            System.out.println();
        }
    }

    private void printPawn(boolean isWhite){
        int rowIndex = isWhite ? 1 : 6;

        for (int i = 0; i < 8; i++){
            board[rowIndex][i] = new Pawn(isWhite);
        }
    }

    private void printRook(boolean isWhite){
        int rowIndex = isWhite ? 0 : 7;

        int leftColl = 0;
        int rightColl = 7;
        board[rowIndex][leftColl] = new Rook(isWhite);
        board[rowIndex][rightColl] = new Rook(isWhite);
    }

    private void printKnight(boolean isWhite){
        int rowIndex = isWhite ? 0 : 7;
        int leftColl = 1;
        int rightColl = 6;
        board[rowIndex][leftColl] = new Knight(isWhite);
        board[rowIndex][rightColl] = new Knight(isWhite);
    }

    private void printBishop(boolean isWhite){
        int rowIndex = isWhite ? 0 : 7;
        int leftColl = 2;
        int rightColl = 5;
        board[rowIndex][leftColl] = new Bishop(isWhite);
        board[rowIndex][rightColl] = new Bishop(isWhite);
    }

    private void printQueen(boolean isWhite){
        int rowIndex = isWhite ? 0 : 7;
        board[rowIndex][3] = new Queen(isWhite);
    }

    private void printKing(boolean isWhite){
        int rowIndex = isWhite ? 0 : 7;
        board[rowIndex][4] = new King(isWhite);
    }
}
