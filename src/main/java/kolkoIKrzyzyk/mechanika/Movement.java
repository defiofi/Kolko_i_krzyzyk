package kolkoIKrzyzyk.mechanika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Movement  {
    /** Klasa odpowiada za ruchy komputerowego gracza
     * są realizowane 3 poziomy trudności gry. 1 - łatwy ; 2 - średni ; 3 - trudny*/
    Random fate = new Random();
    Move move = new Move(-1,-1);
    public Move getMove(char[][] pB, int difficulty, char playerPiece, char computerPiece) throws RuntimeException{
        if (possibilityOfMovement(pB)) {
            if (difficulty == 1) {                          /**Poziom trudności łatwy */

                do {
                    move.setX(fate.nextInt(3));
                    move.setY(fate.nextInt(3));
                } while ((pB[move.getX()][move.getY()] != ' '));
                return move;
            } else if (difficulty == 2) {                       /**Poziom trudności średni */
                char copyPB[][] = new char[3][3];       /**kopia tablicy z uwagi na to ze są wstawiane figury */
                for (int ix = 0; ix < 3; ix++) {
                    for (int iy = 0; iy < 3; iy++) {
                        copyPB[ix][iy] = pB[ix][iy];
                    }
                }
                CheckScore checkScore = new CheckScore();
                List<Move> list = new ArrayList<>();
                for (int ix = 0; ix < 3; ix++) {
                    for (int iy = 0; iy < 3; iy++) {
                        if (copyPB[ix][iy] == ' ') {
                            copyPB[ix][iy] = computerPiece;     /**Sprawdzenie co mogą przynieść ruchy komputera */
                            if ((checkScore.checkWin(copyPB, playerPiece, computerPiece).getWin() == -1) || (!checkScore.possibilityOfMovement(copyPB))) {
                                move.setY(iy);
                                move.setX(ix);
                                return move;
                            } else if (!canWinNextMove(copyPB, playerPiece, computerPiece)) {
                                list.add(new Move(ix, iy));
                            } else {
                                copyPB[ix][iy] = ' ';
                            }
                            copyPB[ix][iy] = ' ';
                        }
                    }
                }
                if (list.size() > 0) {
                    move = list.get(fate.nextInt(list.size()));
                    return move;
                } else {
                    do {
                        move.setX(fate.nextInt(3));
                        move.setY(fate.nextInt(3));
                    } while ((pB[move.getX()][move.getY()] != ' '));
                    return move;
                }
            } else if (difficulty == 3) {                       /**Poziom trudności trudny */
                List<Move> goodMove = new ArrayList<>();    /** tablica zbiera wszystkie dobre ruchy (pewne zwycięstwo) */
                List<Move> averageMove = new ArrayList<>(); /** tablica zbiera wszystkie przeciętne ruchy (na remis)*/
                Move move = new Move(-1, -1);
                int rate;
                char copyPB[][] = new char[3][3];       /**kopia tablicy z uwagi na to że są wstawiane figury */
                for (int ix = 0; ix < 3; ix++) {
                    for (int iy = 0; iy < 3; iy++) {
                        copyPB[ix][iy] = pB[ix][iy];
                    }
                }
                for (int ix = 0; ix < 3; ix++) {
                    for (int iy = 0; iy < 3; iy++) {
                        if (pB[ix][iy] == ' ') {
                            move.setX(ix);
                            move.setY(iy);
                            rate = rateMove(move, copyPB, playerPiece, computerPiece);
                            if (rate == 2) {
                                goodMove.add(new Move(ix, iy));
                            } else if (rate == 1) {
                                averageMove.add(new Move(ix, iy));
                            }
                        }
                    }
                }
                if (goodMove.size() > 0) {
                    System.out.println("Dobre ruchy: ");
                    for (int i = 0; i < goodMove.size(); i++) {
                        System.out.println((i + 1) + ": x:" + goodMove.get(i).getX() + " y:" + goodMove.get(i).getY());
                    }
                    return goodMove.get(fate.nextInt(goodMove.size()));
                } else if (averageMove.size() > 0) {
                    System.out.println("Przeciętne ruchy: ");
                    for (int i = 0; i < averageMove.size(); i++) {
                        System.out.println((i + 1) + ": x:" + averageMove.get(i).getX() + " y:" + averageMove.get(i).getY());
                    }
                    return averageMove.get(fate.nextInt(averageMove.size()));
                }
            }
            else {
                return move;
            }          //zwróci błędne wartości - nigdy nie powinien program dojść do tego miejsca
            return move;
        }
        else throw new RuntimeException("Brak mozliwosci wykonania ruchu.");
    }
    private boolean canWinNextMove(char[][] pB , char playerPiece, char computerPiece){
        char copyPB[][] = new char[3][3];       /**kopia tablicy z uwagi na to ze są wstawiane figury */
        for (int ix = 0 ; ix < 3 ; ix++){
            for (int iy = 0 ; iy < 3 ; iy++) {
                copyPB[ix][iy] = pB[ix][iy];
            }
        }
        CheckScore checkScore = new CheckScore();
        for (int ix = 0 ; ix < 3 ; ix++) {
            for (int iy = 0; iy < 3; iy++) {
                if (copyPB[ix][iy] == ' ') {
                    copyPB[ix][iy] = playerPiece;
                    if (checkScore.checkWin(copyPB, playerPiece, computerPiece).getWin() == 1 ) {return true;}
                    else {copyPB[ix][iy] = ' ';}
                }
            }
        }
        return false;
    }
    public int rateMove(Move move , char[][] pB, char playerPiece, char computerPiece){
        CheckScore checkScore = new CheckScore();

        int rate;
        char copyPB[][] = new char[3][3];       /**kopia tablicy bo metoda wstawia swoje figury*/
        for (int ix = 0 ; ix < 3 ; ix++){
            for (int iy = 0 ; iy < 3 ; iy++) {
                copyPB[ix][iy] = pB[ix][iy];
            }
        }
        copyPB[move.getX()][move.getY()] = computerPiece ;
        if(checkScore.checkWin(copyPB, playerPiece, computerPiece).getWin() == -1){
            return 2;
        }
        else if (checkScore.possibilityOfMovement(copyPB)) {
            double average = 0;
            int quantityMoves = 0;
            for (int ix = 0 ; ix < 3 ; ix++) {
                for (int iy = 0; iy < 3; iy++) {
                    if (copyPB[ix][iy] ==' ') {
                        move.setX(ix);
                        move.setY(iy);
                        quantityMoves++;
                        rate = rateMove(move, copyPB, computerPiece, playerPiece);  /** negacja figur gracza i komputera */
                        if (rate == 2){return 0;}           /**Jeżeli chociaż raz wygrywa przeciwna strona jedno to porażka */
                        else if (rate == 0){average += 2;}
                        else if (rate == 1){average += 1;}
                    }
                }
            }
            average = average/quantityMoves;
            if (average == 2){return 2;}
            else {return 1;}
        }
        else if (!checkScore.possibilityOfMovement(copyPB)) {
            return 1;
        }
        return -1;          //zwróci błąd
    }
    public void getBr(char[][] pB){
        String a;
        for (int i = 0 ; i < 3 ; i++){
            a = " ";
            a += pB[i][0]+" | ";
            a += pB[i][1]+" | ";
            a += pB[i][2];
            System.out.println(a);
        }
        System.out.println();
    }
    private boolean possibilityOfMovement(char[][] pB){
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                if (pB[i][j] == ' ') {return true;}
            }
        }
        return false;
    }
}
