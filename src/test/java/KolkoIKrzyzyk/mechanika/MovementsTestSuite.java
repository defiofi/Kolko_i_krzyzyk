package KolkoIKrzyzyk.mechanika;

import kolkoIKrzyzyk.mechanika.Move;
import kolkoIKrzyzyk.mechanika.Movement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovementsTestSuite {
    @Test
    void movementTestSuiteForEasyModePieceO() {
        //Given
        char playBoard1[][] = {{' ', 'x', 'o'},
                               {'x', 'o', 'o'},
                               {'x', 'o', 'x'}};

        char playBoard2[][] = {{'o', ' ', 'x'},
                               {'x', 'o', 'o'},
                               {'x', 'o', 'x'}};

        char playBoard3[][] = {{'o', 'x', ' '},
                               {'x', 'o', 'x'},
                               {'o', 'o', 'x'}};

        char playBoard4[][] = {{'x', 'x', 'o'},
                               {' ', 'o', 'x'},
                               {'x', 'o', 'o'}};

        char playBoard5[][] = {{'o', 'x', 'o'},
                               {'o', ' ', 'x'},
                               {'x', 'o', 'x'}};

        char playBoard6[][] = {{'o', 'x', 'o'},
                               {'x', 'o', ' '},
                               {'x', 'o', 'x'}};

        char playBoard7[][] = {{'o', 'x', 'o'},
                               {'x', 'o', 'x'},
                               {' ', 'o', 'x'}};

        char playBoard8[][] = {{'o', 'x', 'o'},
                               {'x', 'o', 'x'},
                               {'x', ' ', 'x'}};

        char playBoard9[][] = {{'o', 'x', 'o'},
                               {'o', 'x', 'x'},
                               {'x', 'o', ' '}};
        Movement movement = new Movement();
        //When

    Move move1 = new Move(movement.getMove(playBoard1, 1, 'x', 'o'));
    Move move2 = new Move(movement.getMove(playBoard2, 1, 'x', 'o'));
    Move move3 = new Move(movement.getMove(playBoard3, 1, 'x', 'o'));
    Move move4 = new Move(movement.getMove(playBoard4, 1, 'x', 'o'));
    Move move5 = new Move(movement.getMove(playBoard5, 1, 'x', 'o'));
    Move move6 = new Move(movement.getMove(playBoard6, 1, 'x', 'o'));
    Move move7 = new Move(movement.getMove(playBoard7, 1, 'x', 'o'));
    Move move8 = new Move(movement.getMove(playBoard8, 1, 'x', 'o'));
    Move move9 = new Move(movement.getMove(playBoard9, 1, 'x', 'o'));

        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(1, move2.getY());

        Assertions.assertEquals(0, move3.getX());
        Assertions.assertEquals(2, move3.getY());

        Assertions.assertEquals(1, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(1, move5.getX());
        Assertions.assertEquals(1, move5.getY());

        Assertions.assertEquals(1, move6.getX());
        Assertions.assertEquals(2, move6.getY());

        Assertions.assertEquals(2, move7.getX());
        Assertions.assertEquals(0, move7.getY());

        Assertions.assertEquals(2, move8.getX());
        Assertions.assertEquals(1, move8.getY());

        Assertions.assertEquals(2, move9.getX());
        Assertions.assertEquals(2, move9.getY());
    }
    @Test
    void movementTestSuiteForEasyModePieceX(){
        //Given
        char playBoard1[][] = {{' ','x','o'},
                               {'x','o','o'},
                               {'x','o','x'}};

        char playBoard2[][] = {{'o',' ','x'},
                               {'x','o','o'},
                               {'x','o','x'}};

        char playBoard3[][] = {{'o','x',' '},
                               {'x','o','x'},
                               {'o','o','x'}};

        char playBoard4[][] = {{'x','x','o'},
                               {' ','o','x'},
                               {'x','o','o'}};

        char playBoard5[][] = {{'o','x','o'},
                               {'o',' ','x'},
                               {'x','o','x'}};

        char playBoard6[][] = {{'o','x','o'},
                               {'x','o',' '},
                               {'x','o','x'}};

        char playBoard7[][] = {{'o','x','o'},
                               {'x','o','x'},
                               {' ','o','x'}};

        char playBoard8[][] = {{'o','x','o'},
                               {'x','o','x'},
                               {'x',' ','x'}};

        char playBoard9[][] = {{'o','x','o'},
                               {'o','x','x'},
                               {'x','o',' '}};
        Movement movement = new Movement();
        //When
        Move move1 = new Move(movement.getMove(playBoard1, 1 , 'o', 'x'));
        Move move2 = new Move(movement.getMove(playBoard2, 1 , 'o', 'x'));
        Move move3 = new Move(movement.getMove(playBoard3, 1 , 'o', 'x'));
        Move move4 = new Move(movement.getMove(playBoard4, 1 , 'o', 'x'));
        Move move5 = new Move(movement.getMove(playBoard5, 1 , 'o', 'x'));
        Move move6 = new Move(movement.getMove(playBoard6, 1 , 'o', 'x'));
        Move move7 = new Move(movement.getMove(playBoard7, 1 , 'o', 'x'));
        Move move8 = new Move(movement.getMove(playBoard8, 1 , 'o', 'x'));
        Move move9 = new Move(movement.getMove(playBoard9, 1 , 'o', 'x'));
        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(1, move2.getY());

        Assertions.assertEquals(0, move3.getX());
        Assertions.assertEquals(2, move3.getY());

        Assertions.assertEquals(1, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(1, move5.getX());
        Assertions.assertEquals(1, move5.getY());

        Assertions.assertEquals(1, move6.getX());
        Assertions.assertEquals(2, move6.getY());

        Assertions.assertEquals(2, move7.getX());
        Assertions.assertEquals(0, move7.getY());

        Assertions.assertEquals(2, move8.getX());
        Assertions.assertEquals(1, move8.getY());

        Assertions.assertEquals(2, move9.getX());
        Assertions.assertEquals(2, move9.getY());
    }
    @Test
    void movementTestSuiteForEasyModeAllPlaceBusy(){
        //Given
        char playBoard1[][] = {{'o','x','o'},
                               {'x','o','o'},
                               {'x','o','x'}};
        Movement movement = new Movement();
        //When

        //Then
        assertThrows(RuntimeException.class , () -> movement.getMove(playBoard1, 1 , 'o', 'x'));
        assertThrows(RuntimeException.class , () -> movement.getMove(playBoard1, 1 , 'x', 'o'));
    }
    @Test
    void movementTestSuiteForMediumModeAllPlaceBusy(){
        //Given
        char playBoard1[][] = {{'o','x','o'},
                               {'x','o','o'},
                               {'x','o','x'}};
        Movement movement = new Movement();
        //When

        //Then
        assertThrows(RuntimeException.class , () -> movement.getMove(playBoard1, 2 , 'o', 'x'));
        assertThrows(RuntimeException.class , () -> movement.getMove(playBoard1, 2 , 'x', 'o'));
    }
    @Test
    void movementTestSuiteForHardModeAllPlaceBusy(){
        //Given
        char playBoard1[][] = {{'o','x','o'},
                               {'x','o','o'},
                               {'x','o','x'}};
        Movement movement = new Movement();
        //When

        //Then
        assertThrows(RuntimeException.class , () -> movement.getMove(playBoard1, 3 , 'o', 'x'));
        assertThrows(RuntimeException.class , () -> movement.getMove(playBoard1, 3 , 'x', 'o'));
    }
    @Test
    void movementTestSuiteForMediumModePieceOWin() {
        //Given
        char playBoard1[][] = {{' ', 'o', 'o'},
                               {' ', ' ', ' '},
                               {'x', ' ', 'x'}};

        char playBoard2[][] = {{' ', ' ', ' '},
                               {'x', 'o', ' '},
                               {' ', 'o', 'x'}};

        char playBoard3[][] = {{' ', ' ', ' '},
                               {' ', 'o', 'x'},
                               {'o', ' ', 'x'}};

        char playBoard4[][] = {{'o', 'x', ' '},
                               {' ', ' ', 'x'},
                               {'o', ' ', ' '}};

        char playBoard5[][] = {{'o', ' ', ' '},
                               {' ', ' ', 'x'},
                               {'x', ' ', 'o'}};

        char playBoard6[][] = {{' ', 'x', 'o'},
                               {' ', ' ', ' '},
                               {'x', ' ', 'o'}};

        char playBoard7[][] = {{' ', 'x', ' '},
                               {' ', ' ', 'x'},
                               {' ', 'o', 'o'}};

        char playBoard8[][] = {{' ', 'o', ' '},
                               {' ', 'o', 'x'},
                               {'x', ' ', ' '}};

        char playBoard9[][] = {{' ', 'x', ' '},
                               {' ', 'x', ' '},
                               {'o', 'o', ' '}};
        Movement movement = new Movement();
        //When

        Move move1 = new Move(movement.getMove(playBoard1, 2, 'x', 'o'));
        Move move2 = new Move(movement.getMove(playBoard2, 2, 'x', 'o'));
        Move move3 = new Move(movement.getMove(playBoard3, 2, 'x', 'o'));
        Move move4 = new Move(movement.getMove(playBoard4, 2, 'x', 'o'));
        Move move5 = new Move(movement.getMove(playBoard5, 2, 'x', 'o'));
        Move move6 = new Move(movement.getMove(playBoard6, 2, 'x', 'o'));
        Move move7 = new Move(movement.getMove(playBoard7, 2, 'x', 'o'));
        Move move8 = new Move(movement.getMove(playBoard8, 2, 'x', 'o'));
        Move move9 = new Move(movement.getMove(playBoard9, 2, 'x', 'o'));

        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(1, move2.getY());

        Assertions.assertEquals(0, move3.getX());
        Assertions.assertEquals(2, move3.getY());

        Assertions.assertEquals(1, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(1, move5.getX());
        Assertions.assertEquals(1, move5.getY());

        Assertions.assertEquals(1, move6.getX());
        Assertions.assertEquals(2, move6.getY());

        Assertions.assertEquals(2, move7.getX());
        Assertions.assertEquals(0, move7.getY());

        Assertions.assertEquals(2, move8.getX());
        Assertions.assertEquals(1, move8.getY());

        Assertions.assertEquals(2, move9.getX());
        Assertions.assertEquals(2, move9.getY());
    }
    @Test
    void movementTestSuiteForMediumModePieceXWin() {
        //Given
        char playBoard1[][] = {{' ', 'x', 'x'},
                               {' ', ' ', ' '},
                               {'o', ' ', 'o'}};

        char playBoard2[][] = {{' ', ' ', ' '},
                               {'o', 'x', ' '},
                               {' ', 'x', 'o'}};

        char playBoard3[][] = {{' ', ' ', ' '},
                               {' ', 'x', 'o'},
                               {'x', ' ', 'o'}};

        char playBoard4[][] = {{'x', 'o', ' '},
                               {' ', ' ', 'o'},
                               {'x', ' ', ' '}};

        char playBoard5[][] = {{'x', ' ', ' '},
                               {' ', ' ', 'o'},
                               {'o', ' ', 'x'}};

        char playBoard6[][] = {{' ', 'o', 'x'},
                               {' ', ' ', ' '},
                               {'o', ' ', 'x'}};

        char playBoard7[][] = {{' ', 'o', ' '},
                               {' ', ' ', 'o'},
                               {' ', 'x', 'x'}};

        char playBoard8[][] = {{' ', 'x', ' '},
                               {' ', 'x', 'o'},
                               {'o', ' ', ' '}};

        char playBoard9[][] = {{' ', 'o', ' '},
                               {' ', 'o', ' '},
                               {'x', 'x', ' '}};
        Movement movement = new Movement();
        //When

        Move move1 = new Move(movement.getMove(playBoard1, 2, 'o', 'x'));
        Move move2 = new Move(movement.getMove(playBoard2, 2, 'o', 'x'));
        Move move3 = new Move(movement.getMove(playBoard3, 2, 'o', 'x'));
        Move move4 = new Move(movement.getMove(playBoard4, 2, 'o', 'x'));
        Move move5 = new Move(movement.getMove(playBoard5, 2, 'o', 'x'));
        Move move6 = new Move(movement.getMove(playBoard6, 2, 'o', 'x'));
        Move move7 = new Move(movement.getMove(playBoard7, 2, 'o', 'x'));
        Move move8 = new Move(movement.getMove(playBoard8, 2, 'o', 'x'));
        Move move9 = new Move(movement.getMove(playBoard9, 2, 'o', 'x'));

        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(1, move2.getY());

        Assertions.assertEquals(0, move3.getX());
        Assertions.assertEquals(2, move3.getY());

        Assertions.assertEquals(1, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(1, move5.getX());
        Assertions.assertEquals(1, move5.getY());

        Assertions.assertEquals(1, move6.getX());
        Assertions.assertEquals(2, move6.getY());

        Assertions.assertEquals(2, move7.getX());
        Assertions.assertEquals(0, move7.getY());

        Assertions.assertEquals(2, move8.getX());
        Assertions.assertEquals(1, move8.getY());

        Assertions.assertEquals(2, move9.getX());
        Assertions.assertEquals(2, move9.getY());
    }
    @Test
    void movementTestSuiteForMediumModePieceODefence() {
        //Given
        char playBoard1[][] = {{' ', 'x', 'x'},
                               {'o', ' ', ' '},
                               {' ', ' ', 'o'}};

        char playBoard2[][] = {{' ', ' ', ' '},
                               {'o', 'x', ' '},
                               {' ', 'x', 'o'}};

        char playBoard3[][] = {{' ', ' ', ' '},
                               {' ', 'x', 'o'},
                               {'x', 'o', ' '}};

        char playBoard4[][] = {{'x', 'o', ' '},
                               {' ', ' ', 'o'},
                               {'x', ' ', ' '}};

        char playBoard5[][] = {{'x', ' ', ' '},
                               {' ', ' ', 'o'},
                               {'o', ' ', 'x'}};

        char playBoard6[][] = {{' ', 'o', 'x'},
                               {' ', ' ', ' '},
                               {'o', ' ', 'x'}};

        char playBoard7[][] = {{' ', 'o', ' '},
                               {' ', ' ', 'o'},
                               {' ', 'x', 'x'}};

        char playBoard8[][] = {{' ', 'x', ' '},
                               {' ', 'x', 'o'},
                               {'o', ' ', ' '}};

        char playBoard9[][] = {{' ', 'o', ' '},
                               {' ', 'o', ' '},
                               {'x', 'x', ' '}};
        Movement movement = new Movement();
        //When

        Move move1 = new Move(movement.getMove(playBoard1, 2, 'x', 'o'));
        Move move2 = new Move(movement.getMove(playBoard2, 2, 'x', 'o'));
        Move move3 = new Move(movement.getMove(playBoard3, 2, 'x', 'o'));
        Move move4 = new Move(movement.getMove(playBoard4, 2, 'x', 'o'));
        Move move5 = new Move(movement.getMove(playBoard5, 2, 'x', 'o'));
        Move move6 = new Move(movement.getMove(playBoard6, 2, 'x', 'o'));
        Move move7 = new Move(movement.getMove(playBoard7, 2, 'x', 'o'));
        Move move8 = new Move(movement.getMove(playBoard8, 2, 'x', 'o'));
        Move move9 = new Move(movement.getMove(playBoard9, 2, 'x', 'o'));

        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(1, move2.getY());

        Assertions.assertEquals(0, move3.getX());
        Assertions.assertEquals(2, move3.getY());

        Assertions.assertEquals(1, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(1, move5.getX());
        Assertions.assertEquals(1, move5.getY());

        Assertions.assertEquals(1, move6.getX());
        Assertions.assertEquals(2, move6.getY());

        Assertions.assertEquals(2, move7.getX());
        Assertions.assertEquals(0, move7.getY());

        Assertions.assertEquals(2, move8.getX());
        Assertions.assertEquals(1, move8.getY());

        Assertions.assertEquals(2, move9.getX());
        Assertions.assertEquals(2, move9.getY());
    }
    @Test
    void movementTestSuiteForMediumModePieceXDefence() {
        //Given
        char playBoard1[][] = {{' ', 'o', 'o'},
                               {'x', ' ', ' '},
                               {' ', ' ', 'x'}};

        char playBoard2[][] = {{' ', ' ', ' '},
                               {'x', 'o', ' '},
                               {' ', 'o', 'x'}};

        char playBoard3[][] = {{' ', ' ', ' '},
                               {' ', 'o', 'x'},
                               {'o', 'x', ' '}};

        char playBoard4[][] = {{'o', 'x', ' '},
                               {' ', ' ', 'x'},
                               {'o', ' ', ' '}};

        char playBoard5[][] = {{'o', ' ', ' '},
                               {' ', ' ', 'x'},
                               {'x', ' ', 'o'}};

        char playBoard6[][] = {{' ', 'x', 'o'},
                               {' ', ' ', ' '},
                               {'x', ' ', 'o'}};

        char playBoard7[][] = {{' ', 'x', ' '},
                               {' ', ' ', 'x'},
                               {' ', 'o', 'o'}};

        char playBoard8[][] = {{' ', 'o', ' '},
                               {' ', 'o', 'x'},
                               {'x', ' ', ' '}};

        char playBoard9[][] = {{' ', 'x', ' '},
                               {' ', 'x', ' '},
                               {'o', 'o', ' '}};
        Movement movement = new Movement();
        //When

        Move move1 = new Move(movement.getMove(playBoard1, 2, 'o', 'x'));
        Move move2 = new Move(movement.getMove(playBoard2, 2, 'o', 'x'));
        Move move3 = new Move(movement.getMove(playBoard3, 2, 'o', 'x'));
        Move move4 = new Move(movement.getMove(playBoard4, 2, 'o', 'x'));
        Move move5 = new Move(movement.getMove(playBoard5, 2, 'o', 'x'));
        Move move6 = new Move(movement.getMove(playBoard6, 2, 'o', 'x'));
        Move move7 = new Move(movement.getMove(playBoard7, 2, 'o', 'x'));
        Move move8 = new Move(movement.getMove(playBoard8, 2, 'o', 'x'));
        Move move9 = new Move(movement.getMove(playBoard9, 2, 'o', 'x'));

        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(1, move2.getY());

        Assertions.assertEquals(0, move3.getX());
        Assertions.assertEquals(2, move3.getY());

        Assertions.assertEquals(1, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(1, move5.getX());
        Assertions.assertEquals(1, move5.getY());

        Assertions.assertEquals(1, move6.getX());
        Assertions.assertEquals(2, move6.getY());

        Assertions.assertEquals(2, move7.getX());
        Assertions.assertEquals(0, move7.getY());

        Assertions.assertEquals(2, move8.getX());
        Assertions.assertEquals(1, move8.getY());

        Assertions.assertEquals(2, move9.getX());
        Assertions.assertEquals(2, move9.getY());
    }
    @Test
    void movementTestSuiteForHardModePieceOWin() {
        //Given
        char playBoard1[][] = {{' ', 'o', 'o'},
                               {'x', ' ', ' '},
                               {'x', ' ', 'x'}};

        char playBoard2[][] = {{' ', ' ', 'x'},
                               {'x', 'o', ' '},
                               {' ', 'o', 'x'}};

        char playBoard3[][] = {{' ', ' ', ' '},
                               {' ', 'o', 'x'},
                               {'o', ' ', 'x'}};

        char playBoard4[][] = {{'o', ' ', 'x'},
                               {' ', ' ', ' '},
                               {'o', ' ', 'x'}};

        char playBoard5[][] = {{'o', ' ', 'x'},
                               {' ', ' ', ' '},
                               {'x', ' ', 'o'}};

        char playBoard6[][] = {{' ', 'x', 'o'},
                               {' ', 'x', ' '},
                               {'x', ' ', 'o'}};

        char playBoard7[][] = {{' ', 'x', ' '},
                               {' ', 'x', 'x'},
                               {' ', 'o', 'o'}};

        char playBoard8[][] = {{' ', 'o', 'x'},
                               {' ', 'o', ' '},
                               {'x', ' ', 'x'}};

        char playBoard9[][] = {{' ', 'x', ' '},
                               {'x', 'x', ' '},
                               {'o', 'o', ' '}};
        Movement movement = new Movement();
        //When

        Move move1 = new Move(movement.getMove(playBoard1, 3, 'x', 'o'));
        Move move2 = new Move(movement.getMove(playBoard2, 3, 'x', 'o'));
        Move move3 = new Move(movement.getMove(playBoard3, 3, 'x', 'o'));
        Move move4 = new Move(movement.getMove(playBoard4, 3, 'x', 'o'));
        Move move5 = new Move(movement.getMove(playBoard5, 3, 'x', 'o'));
        Move move6 = new Move(movement.getMove(playBoard6, 3, 'x', 'o'));
        Move move7 = new Move(movement.getMove(playBoard7, 3, 'x', 'o'));
        Move move8 = new Move(movement.getMove(playBoard8, 3, 'x', 'o'));
        Move move9 = new Move(movement.getMove(playBoard9, 3, 'x', 'o'));

        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(1, move2.getY());

        Assertions.assertEquals(0, move3.getX());
        Assertions.assertEquals(2, move3.getY());

        Assertions.assertEquals(1, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(1, move5.getX());
        Assertions.assertEquals(1, move5.getY());

        Assertions.assertEquals(1, move6.getX());
        Assertions.assertEquals(2, move6.getY());

        Assertions.assertEquals(2, move7.getX());
        Assertions.assertEquals(0, move7.getY());

        Assertions.assertEquals(2, move8.getX());
        Assertions.assertEquals(1, move8.getY());

        Assertions.assertEquals(2, move9.getX());
        Assertions.assertEquals(2, move9.getY());
    }
    @Test
    void movementTestSuiteForHardModePieceXWin() {
        //Given
        char playBoard1[][] = {{' ', 'x', 'x'},
                               {' ', 'o', ' '},
                               {'o', ' ', 'o'}};

        char playBoard2[][] = {{' ', ' ', 'o'},
                               {'o', 'x', ' '},
                               {' ', 'x', 'o'}};

        char playBoard3[][] = {{' ', ' ', ' '},
                               {' ', 'x', 'o'},
                               {'x', ' ', 'o'}};

        char playBoard4[][] = {{'x', 'o', ' '},
                               {' ', 'o', 'o'},
                               {'x', ' ', ' '}};

        char playBoard5[][] = {{'x', ' ', 'o'},
                               {' ', ' ', ' '},
                               {'o', ' ', 'x'}};

        char playBoard6[][] = {{' ', 'o', 'x'},
                               {' ', 'o', ' '},
                               {'o', ' ', 'x'}};

        char playBoard7[][] = {{' ', 'o', ' '},
                               {' ', 'o', 'o'},
                               {' ', 'x', 'x'}};

        char playBoard8[][] = {{' ', 'x', ' '},
                               {'o', 'x', ' '},
                               {'o', ' ', 'o'}};

        char playBoard9[][] = {{'o', 'o', ' '},
                               {' ', 'o', ' '},
                               {'x', 'x', ' '}};
        Movement movement = new Movement();
        //When

        Move move1 = new Move(movement.getMove(playBoard1, 3, 'o', 'x'));
        Move move2 = new Move(movement.getMove(playBoard2, 3, 'o', 'x'));
        Move move3 = new Move(movement.getMove(playBoard3, 3, 'o', 'x'));
        Move move4 = new Move(movement.getMove(playBoard4, 3, 'o', 'x'));
        Move move5 = new Move(movement.getMove(playBoard5, 3, 'o', 'x'));
        Move move6 = new Move(movement.getMove(playBoard6, 3, 'o', 'x'));
        Move move7 = new Move(movement.getMove(playBoard7, 3, 'o', 'x'));
        Move move8 = new Move(movement.getMove(playBoard8, 3, 'o', 'x'));
        Move move9 = new Move(movement.getMove(playBoard9, 3, 'o', 'x'));

        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(1, move2.getY());

        Assertions.assertEquals(0, move3.getX());
        Assertions.assertEquals(2, move3.getY());

        Assertions.assertEquals(1, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(1, move5.getX());
        Assertions.assertEquals(1, move5.getY());

        Assertions.assertEquals(1, move6.getX());
        Assertions.assertEquals(2, move6.getY());

        Assertions.assertEquals(2, move7.getX());
        Assertions.assertEquals(0, move7.getY());

        Assertions.assertEquals(2, move8.getX());
        Assertions.assertEquals(1, move8.getY());

        Assertions.assertEquals(2, move9.getX());
        Assertions.assertEquals(2, move9.getY());
    }
    @Test
    void movementTestSuiteForHardModePieceODefence() {
        //Given
        char playBoard1[][] = {{' ', 'x', 'x'},
                               {'o', ' ', ' '},
                               {' ', ' ', 'o'}};

        char playBoard2[][] = {{' ', ' ', ' '},
                               {'o', 'x', ' '},
                               {' ', 'x', 'o'}};

        char playBoard3[][] = {{' ', ' ', ' '},
                               {' ', 'x', 'o'},
                               {'x', 'o', ' '}};

        char playBoard4[][] = {{'x', 'o', ' '},
                               {' ', ' ', 'o'},
                               {'x', ' ', ' '}};

        char playBoard5[][] = {{'x', ' ', ' '},
                               {' ', ' ', 'o'},
                               {'o', ' ', 'x'}};

        char playBoard6[][] = {{' ', 'o', 'x'},
                               {' ', ' ', ' '},
                               {'o', ' ', 'x'}};

        char playBoard7[][] = {{' ', 'o', ' '},
                               {' ', ' ', 'o'},
                               {' ', 'x', 'x'}};

        char playBoard8[][] = {{' ', 'x', ' '},
                               {' ', 'x', 'o'},
                               {'o', ' ', ' '}};

        char playBoard9[][] = {{' ', 'o', ' '},
                               {' ', 'o', ' '},
                               {'x', 'x', ' '}};
        Movement movement = new Movement();
        //When

        Move move1 = new Move(movement.getMove(playBoard1, 3, 'x', 'o'));
        Move move2 = new Move(movement.getMove(playBoard2, 3, 'x', 'o'));
        Move move3 = new Move(movement.getMove(playBoard3, 3, 'x', 'o'));
        Move move4 = new Move(movement.getMove(playBoard4, 2, 'x', 'o'));
        Move move5 = new Move(movement.getMove(playBoard5, 3, 'x', 'o'));
        Move move6 = new Move(movement.getMove(playBoard6, 3, 'x', 'o'));
        Move move7 = new Move(movement.getMove(playBoard7, 3, 'x', 'o'));
        Move move8 = new Move(movement.getMove(playBoard8, 3, 'x', 'o'));
        Move move9 = new Move(movement.getMove(playBoard9, 3, 'x', 'o'));

        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(1, move2.getY());

        Assertions.assertEquals(0, move3.getX());
        Assertions.assertEquals(2, move3.getY());

        Assertions.assertEquals(1, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(1, move5.getX());
        Assertions.assertEquals(1, move5.getY());

        Assertions.assertEquals(1, move6.getX());
        Assertions.assertEquals(2, move6.getY());

        Assertions.assertEquals(2, move7.getX());
        Assertions.assertEquals(0, move7.getY());

        Assertions.assertEquals(2, move8.getX());
        Assertions.assertEquals(1, move8.getY());

        Assertions.assertEquals(2, move9.getX());
        Assertions.assertEquals(2, move9.getY());
    }
    @Test
    void movementTestSuiteForHardModePieceXDefence() {
        //Given
        char playBoard1[][] = {{' ', 'o', 'o'},
                               {'x', ' ', ' '},
                               {' ', ' ', 'x'}};

        char playBoard2[][] = {{' ', ' ', ' '},
                               {'x', 'o', ' '},
                               {' ', 'o', 'x'}};

        char playBoard3[][] = {{' ', ' ', ' '},
                               {' ', 'o', 'x'},
                               {'o', 'x', ' '}};

        char playBoard4[][] = {{'o', 'x', ' '},
                               {' ', ' ', ' '},
                               {'o', ' ', 'x'}};

        char playBoard5[][] = {{'o', ' ', ' '},
                               {' ', ' ', 'x'},
                               {'x', ' ', 'o'}};

        char playBoard6[][] = {{' ', 'x', 'o'},
                               {' ', ' ', ' '},
                               {'x', ' ', 'o'}};

        char playBoard7[][] = {{' ', 'x', ' '},
                               {' ', ' ', 'x'},
                               {' ', 'o', 'o'}};

        char playBoard8[][] = {{' ', 'o', ' '},
                               {' ', 'o', 'x'},
                               {'x', ' ', ' '}};

        char playBoard9[][] = {{' ', 'x', ' '},
                               {' ', 'x', ' '},
                               {'o', 'o', ' '}};
        Movement movement = new Movement();
        //When

        Move move1 = new Move(movement.getMove(playBoard1, 3, 'o', 'x'));
        Move move2 = new Move(movement.getMove(playBoard2, 3, 'o', 'x'));
        Move move3 = new Move(movement.getMove(playBoard3, 3, 'o', 'x'));
        Move move4 = new Move(movement.getMove(playBoard4, 3, 'o', 'x'));
        Move move5 = new Move(movement.getMove(playBoard5, 3, 'o', 'x'));
        Move move6 = new Move(movement.getMove(playBoard6, 3, 'o', 'x'));
        Move move7 = new Move(movement.getMove(playBoard7, 3, 'o', 'x'));
        Move move8 = new Move(movement.getMove(playBoard8, 3, 'o', 'x'));
        Move move9 = new Move(movement.getMove(playBoard9, 3, 'o', 'x'));

        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(1, move2.getY());

        Assertions.assertEquals(0, move3.getX());
        Assertions.assertEquals(2, move3.getY());

        Assertions.assertEquals(1, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(1, move5.getX());
        Assertions.assertEquals(1, move5.getY());

        Assertions.assertEquals(1, move6.getX());
        Assertions.assertEquals(2, move6.getY());

        Assertions.assertEquals(2, move7.getX());
        Assertions.assertEquals(0, move7.getY());

        Assertions.assertEquals(2, move8.getX());
        Assertions.assertEquals(1, move8.getY());

        Assertions.assertEquals(2, move9.getX());
        Assertions.assertEquals(2, move9.getY());
    }
    @Test
    void movementTestSuiteForHardModeGoodMove() {
        //Given
        char playBoard1[][] = {{' ', ' ', 'x'},
                               {' ', ' ', 'x'},
                               {'o', 'x', 'o'}};

        char playBoard2[][] = {{' ', ' ', 'o'},
                               {' ', 'x', ' '},
                               {'o', ' ', 'x'}};

        char playBoard3[][] = {{'x', 'o', 'o'},
                               {' ', ' ', 'x'},
                               {' ', ' ', ' '}};

        char playBoard4[][] = {{'x', ' ', 'o'},
                               {' ', ' ', 'x'},
                               {' ', ' ', 'o'}};

        char playBoard5[][] = {{'x', ' ', 'o'},
                               {' ', 'x', ' '},
                               {' ', 'o', ' '}};

        Movement movement = new Movement();
        //When
        Move move1 = new Move(movement.getMove(playBoard1, 3, 'x', 'o'));
        Move move2 = new Move(movement.getMove(playBoard2, 3, 'x', 'o'));
        Move move3 = new Move(movement.getMove(playBoard3, 3, 'x', 'o'));
        Move move4 = new Move(movement.getMove(playBoard4, 3, 'x', 'o'));
        Move move5 = new Move(movement.getMove(playBoard5, 3, 'x', 'o'));

        //Then
        Assertions.assertEquals(0, move1.getX());
        Assertions.assertEquals(0, move1.getY());

        Assertions.assertEquals(0, move2.getX());
        Assertions.assertEquals(0, move2.getY());

        Assertions.assertEquals(1, move3.getX());
        Assertions.assertEquals(1, move3.getY());

        Assertions.assertEquals(2, move4.getX());
        Assertions.assertEquals(0, move4.getY());

        Assertions.assertEquals(2, move5.getX());
        Assertions.assertEquals(2, move5.getY());
    }
    @Test
    void movementTestSuiteForHardModeAdvancedDefence() {
        //Given
        char playBoard1[][] = {{'x', ' ', ' '},
                               {' ', ' ', ' '},
                               {' ', ' ', ' '}};

        Movement movement = new Movement();
        //When
        Move move1 = new Move(movement.getMove(playBoard1, 3, 'x', 'o'));

        //Then
        Assertions.assertEquals(1, move1.getX());
        Assertions.assertEquals(1, move1.getY());
    }
}


