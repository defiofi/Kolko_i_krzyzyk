package KolkoIKrzyzyk.mechanika;
import org.junit.jupiter.api.*;
import kolkoIKrzyzyk.mechanika.CheckScore;
import kolkoIKrzyzyk.mechanika.WinDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckScoreTestSuite {
    @Test
    void checkWinTestEmptyTable(){
                //Given
        char playBoard[][] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        CheckScore checkScore = new CheckScore();
                //When
        WinDate winDate = checkScore.checkWin(playBoard, 'x','o');
                //Then
        Assertions.assertEquals(0, winDate.getWin());
        Assertions.assertEquals(-1, winDate.getWinLine());
    }
    @DisplayName("sprawdzenie CheckScore dla zwycięstw X ")
    @Test
    void checkWinTestXWinForX(){
        //Given
        char playBoard1[][] = {{'x','x','x'},{' ','o',' '},{' ','o',' '}};
        char playBoard2[][] = {{'o',' ','o'},{'x','x','x'},{' ',' ',' '}};
        char playBoard3[][] = {{' ',' ','o'},{' ','o',' '},{'x','x','x'}};
        char playBoard4[][] = {{'x',' ',' '},{'x','o',' '},{'x','o',' '}};
        char playBoard5[][] = {{' ','x','o'},{' ','x',' '},{'o','x',' '}};
        char playBoard6[][] = {{' ','o','x'},{' ',' ','x'},{' ','o','x'}};
        char playBoard7[][] = {{'x','o',' '},{' ','x',' '},{' ','o','x'}};
        char playBoard8[][] = {{' ','o','x'},{' ','x',' '},{'x','o',' '}};
        CheckScore checkScore = new CheckScore();
        //When
        WinDate winDate1 = checkScore.checkWin(playBoard1, 'x','o');
        WinDate winDate2 = checkScore.checkWin(playBoard2, 'x','o');
        WinDate winDate3 = checkScore.checkWin(playBoard3, 'x','o');
        WinDate winDate4 = checkScore.checkWin(playBoard4, 'x','o');
        WinDate winDate5 = checkScore.checkWin(playBoard5, 'x','o');
        WinDate winDate6 = checkScore.checkWin(playBoard6, 'x','o');
        WinDate winDate7 = checkScore.checkWin(playBoard7, 'x','o');
        WinDate winDate8 = checkScore.checkWin(playBoard8, 'x','o');
        System.out.println("win= "+winDate1.getWin()+" ; winLine="+winDate1.getWinLine());

        //Then
        Assertions.assertEquals(1, winDate1.getWin());
        Assertions.assertEquals(0, winDate1.getWinLine());

        Assertions.assertEquals(1, winDate2.getWin());
        Assertions.assertEquals(1, winDate2.getWinLine());

        Assertions.assertEquals(1, winDate3.getWin());
        Assertions.assertEquals(2, winDate3.getWinLine());

        Assertions.assertEquals(1, winDate4.getWin());
        Assertions.assertEquals(3, winDate4.getWinLine());

        Assertions.assertEquals(1, winDate5.getWin());
        Assertions.assertEquals(4, winDate5.getWinLine());

        Assertions.assertEquals(1, winDate6.getWin());
        Assertions.assertEquals(5, winDate6.getWinLine());

        Assertions.assertEquals(1, winDate7.getWin());
        Assertions.assertEquals(6, winDate7.getWinLine());

        Assertions.assertEquals(1, winDate8.getWin());
        Assertions.assertEquals(7, winDate8.getWinLine());
    }
    @DisplayName("sprawdzenie CheckScore dla zwycięstw Y ")
    @Test
    void checkWinTestXWinForY(){
        //Given
        char playBoard1[][] = {{'o','o','o'},{' ','x',' '},{' ','x',' '}};
        char playBoard2[][] = {{'x',' ','x'},{'o','o','o'},{' ',' ',' '}};
        char playBoard3[][] = {{' ',' ','x'},{' ','x',' '},{'o','o','o'}};
        char playBoard4[][] = {{'o',' ',' '},{'o','x',' '},{'o','x',' '}};
        char playBoard5[][] = {{' ','o','x'},{' ','o',' '},{'x','o',' '}};
        char playBoard6[][] = {{' ','x','o'},{' ',' ','o'},{' ','x','o'}};
        char playBoard7[][] = {{'o','x',' '},{' ','o',' '},{' ','x','o'}};
        char playBoard8[][] = {{' ','x','o'},{' ','o',' '},{'o','x',' '}};
        CheckScore checkScore = new CheckScore();
        //When
        WinDate winDate1 = checkScore.checkWin(playBoard1, 'x','o');
        WinDate winDate2 = checkScore.checkWin(playBoard2, 'x','o');
        WinDate winDate3 = checkScore.checkWin(playBoard3, 'x','o');
        WinDate winDate4 = checkScore.checkWin(playBoard4, 'x','o');
        WinDate winDate5 = checkScore.checkWin(playBoard5, 'x','o');
        WinDate winDate6 = checkScore.checkWin(playBoard6, 'x','o');
        WinDate winDate7 = checkScore.checkWin(playBoard7, 'x','o');
        WinDate winDate8 = checkScore.checkWin(playBoard8, 'x','o');
        System.out.println("win= "+winDate1.getWin()+" ; winLine="+winDate1.getWinLine());

        //Then
        Assertions.assertEquals(-1, winDate1.getWin());
        Assertions.assertEquals(0, winDate1.getWinLine());

        Assertions.assertEquals(-1, winDate2.getWin());
        Assertions.assertEquals(1, winDate2.getWinLine());

        Assertions.assertEquals(-1, winDate3.getWin());
        Assertions.assertEquals(2, winDate3.getWinLine());

        Assertions.assertEquals(-1, winDate4.getWin());
        Assertions.assertEquals(3, winDate4.getWinLine());

        Assertions.assertEquals(-1, winDate5.getWin());
        Assertions.assertEquals(4, winDate5.getWinLine());

        Assertions.assertEquals(-1, winDate6.getWin());
        Assertions.assertEquals(5, winDate6.getWinLine());

        Assertions.assertEquals(-1, winDate7.getWin());
        Assertions.assertEquals(6, winDate7.getWinLine());

        Assertions.assertEquals(-1, winDate8.getWin());
        Assertions.assertEquals(7, winDate8.getWinLine());
    }

    @DisplayName("sprawdzenie CheckScore gdy linie sa zapisane , ale nie ma zwyciestwa. ")
    @Test
    void checkWritenLinesTest(){
        //Given
        char playBoard1[][] = {{'o','x','o'},{'x','o','o'},{'x','o','x'}};
        char playBoard2[][] = {{'x','o','x'},{'o','x','x'},{'o','x','o'}};

        CheckScore checkScore = new CheckScore();
        //When
        WinDate winDate1 = checkScore.checkWin(playBoard1, 'x','o');
        WinDate winDate2 = checkScore.checkWin(playBoard2, 'x','o');

        //Then
        Assertions.assertEquals(0, winDate1.getWin());
        Assertions.assertEquals(-1, winDate1.getWinLine());

        Assertions.assertEquals(0, winDate2.getWin());
        Assertions.assertEquals(-1, winDate2.getWinLine());
    }
    @Test
    void possibilityOfMovementTestEmpty(){
        //Given
        char playBoard1[][] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        CheckScore checkScore = new CheckScore();
        //When
        boolean score = checkScore.possibilityOfMovement(playBoard1);
        //Then
        Assertions.assertEquals(true, score);
    }
    @Test
    void possibilityOfMovementTestFull(){
        //Given
        char playBoard1[][] = {{'o','x','o'},{'x','o','o'},{'x','o','x'}};
        char playBoard2[][] = {{'x','o','x'},{'o','x','x'},{'o','x','o'}};
        CheckScore checkScore = new CheckScore();
        //When
        boolean score1 = checkScore.possibilityOfMovement(playBoard1);
        boolean score2 = checkScore.possibilityOfMovement(playBoard2);
        //Then
        Assertions.assertEquals(false, score1);
        Assertions.assertEquals(false, score2);
    }
}