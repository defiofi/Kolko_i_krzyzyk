package kolkoIKrzyzyk.mechanika;

public class CheckScore {

    public WinDate checkWin(char[][] pB, char playerPiece, char computerPiece){
        WinDate win = new WinDate(0,-1);
        /** 0 - brak wygranej ; 1 - gracz wygrywa ; -1 - komputer wygrywa
         Linie liczone są od 0 do 7
         Sposób liczenia lini:        3 4 5
         *                          0| | | |                  \             /
         *                          1| | | | linie skośne to 6 \   oraz 7  /
         *                          2| | | |                    \         /   */
        for (int i = 0 ; i < 3 ; i++) {             // sprawdzenie trzech lini w poziomie
            if ((pB[i][0] == pB[i][1]) && (pB[i][0] == pB[i][2])){
                if(pB[i][0] == playerPiece ){
                    win.setWin(1);
                    win.setWinLine(i);
                    return win;
                }
                else if (pB[i][0] == computerPiece){
                    win.setWin(-1);
                    win.setWinLine(i);
                    return win;
                }
            }
        }
        for (int i = 0 ; i < 3 ; i++) {             // sprawdzenie trzech lini w pionie
            if ((pB[0][i] == pB[1][i]) && (pB[0][i] == pB[2][i])){
                if(pB[0][i] == playerPiece ){
                    win.setWin(1);
                    win.setWinLine(i+3);
                    return win;
                }
                else if (pB[0][i] == computerPiece){
                    win.setWin(-1);
                    win.setWinLine(i+3);
                    return win;
                }
            }
        }
        if((pB[0][0] == pB[1][1]) && (pB[0][0] == pB[2][2])){           //przekątna 1
            if (pB[0][0] == playerPiece){
                win.setWin(1);
                win.setWinLine(6);
                return win;
            }
            else if (pB[0][0] == computerPiece){
                win.setWin(-1);
                win.setWinLine(6);
                return win;
            }
        }
        if((pB[2][0] == pB[1][1]) && (pB[2][0] == pB[0][2])){           //przekątna 2
            if (pB[2][0] == playerPiece){
                win.setWin(1);
                win.setWinLine(7);
                return win;
            }
            else if (pB[2][0] == computerPiece){
                win.setWin(-1);
                win.setWinLine(7);
                return win;
            }
        }
        return win;
    }
    public boolean possibilityOfMovement(char[][] pB){
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                if (pB[i][j] == ' ') {return true;}
            }
        }
        return false;
    }
}
