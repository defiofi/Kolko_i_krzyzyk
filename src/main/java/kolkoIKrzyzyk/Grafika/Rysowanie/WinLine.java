package kolkoIKrzyzyk.Grafika.Rysowanie;

import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import kolkoIKrzyzyk.mechanika.Style;

public class WinLine implements Shape{
    /** Klasa WinLine za rysowanie lini pokazującej w którym miejscu nastąpiło ułozenie trzech takich samych figur
     * Linie liczone są od 0 do 7
     * Sposób liczenia lini:      3 4 5
     *                          0| | | |                  \             /
     *                          1| | | | linie skośne to 6 \   oraz 7  /
     *                          2| | | |                    \         /   */
    private double placeBeginingX[] = new double[8];
    private double placeBeginingY[] = new double[8];
    private double placeEndingX[] = new double[8];
    private double placeEndingY[] = new double[8];
    double thickness;
    public WinLine(double maxHeight , double maxWidth ){
        this.thickness = maxHeight/50;
        /** Obliczenie współrzędnych X początku zwycięskiej lini */
        placeBeginingX[0] = placeBeginingX[1] = placeBeginingX[2] = (maxWidth/20);
        placeBeginingX[3] = (maxWidth/6-thickness/3);
        placeBeginingX[4] = (maxWidth/2);
        placeBeginingX[5] = (5*maxWidth/6+thickness/3);
        placeBeginingX[6] = placeBeginingX[7] = (maxWidth/20);
        /** Obliczenie współrzędnych Y początku zwycięskiej lini */
        placeBeginingY[0] = (maxHeight-30)/6 +30-thickness/3;
        placeBeginingY[1] = (maxHeight-30)/2 +30;
        placeBeginingY[2] = 5*(maxHeight-30)/6 +30+thickness/3;
        placeBeginingY[3] = placeBeginingY[4] = placeBeginingY[5] = placeBeginingY[6]  = (maxHeight-30)/20 +30;
        placeBeginingY[7] = 19*(maxHeight-30)/20 +30;
        /** Obliczenie współrzędnych X końca zwycięskiej lini */
        placeEndingX[3] = (maxWidth/6-thickness/3);
        placeEndingX[4] = (maxWidth/2);
        placeEndingX[5] = (5*maxWidth/6+thickness/3);
        placeEndingX[0] = placeEndingX[1] = placeEndingX[2] = (19*maxWidth/20);
        placeEndingX[6] = placeEndingX[7] = (19*maxWidth/20);
        /** Obliczenie współrzędnych Y końca zwycięskiej lini */
        placeEndingY[0] = (maxHeight-30)/6 +30-thickness/3;
        placeEndingY[1] = (maxHeight-30)/2 +30;
        placeEndingY[2] = 5*(maxHeight-30)/6 +30+thickness/3;
        placeEndingY[3] = placeEndingY[4] = placeEndingY[5] = placeEndingY[6] = 19*(maxHeight-30)/20 +30;
        placeEndingY[7] = (maxHeight-30)/20 +30;
    }
    @Override
    public void draw(Style style , int numberWinLine , Group group, char playerPiece) {
        /** style informuje o wybranym stylu przez użytkownika
         * numberWinLine - w którym miejscu wyświetlić kształt
         * group to kontener , do którego ma trafić rysowany kształt*/
        if (numberWinLine < 8) {
            Line aWinLine = new Line(placeBeginingX[numberWinLine], placeBeginingY[numberWinLine], placeEndingX[numberWinLine], placeEndingY[numberWinLine]);
            aWinLine.setStrokeWidth(thickness);
            aWinLine.setStrokeLineCap(StrokeLineCap.ROUND);
            aWinLine.setStroke(style.getWinLine());
            group.getChildren().add(aWinLine);
        }
    }
}
