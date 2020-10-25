package kolkoIKrzyzyk.Grafika.Rysowanie;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import kolkoIKrzyzyk.mechanika.Style;

public class RectangleKK implements Shape{
    /** Klasa Rectangle odpowiada za rysowanie prostokąta/kwadratu we wskazanym miejscu. Jest 9 miejsc gdzie może być
     * figura narysowana.Miejsce występowania prostokąta/kwadratu liczone jest w następujacy sposób:
     *      |0|1|2|
     *      |3|4|5|
     *      |6|7|8|
     *begining   ____
     *          |   |
     *          |   |
     *          ---- end */
    private double beginingX[] = new double[10];
    private double beginingY[] = new double[10];
    private double maxHeight;
    private double maxWidth;
    private double figureThickness;
    private double place_width;
    private double place_height;
    public RectangleKK(double maxHeight , double maxWidth){
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.figureThickness = maxHeight/35;
        double lineThickness = maxHeight/50;
        this.place_width = ((maxWidth/3)-2*lineThickness/3);
        this.place_height = ((maxHeight-30)/3-2*lineThickness/3);
        /** Obliczenie współrzędnych początku i końca kwadratu dla obecnego miejsca w scenie:*/
        beginingX[0] = beginingX[3] = beginingX[6] = 0.2*place_width;
        beginingX[1] = beginingX[4] = beginingX[7] = 1.2*place_width+lineThickness;
        beginingX[2] = beginingX[5] = beginingX[8] = 2.2*place_width+2*lineThickness;
        beginingX[9] = 0.2*maxWidth;

        beginingY[0] = beginingY[1] = beginingY[2] = 0.2*place_height+30;
        beginingY[3] = beginingY[4] = beginingY[5] = 1.2*place_height+lineThickness+30;
        beginingY[6] = beginingY[7] = beginingY[8] = 2.2*place_height+2*lineThickness+30;
        beginingY[9] = 0.2*maxHeight;

    }
    @Override
    public void draw(Style style , int place , Group group, char playerPiece) {
        /** style informuje o wybranym stylu przez użytkownika
         * place - w którym miejscu wyświetlić kształt
         * group to kontener , do którego ma trafić rysowany kształt*/
        if (place >= 0 && place < 9) {
        Rectangle rectangle = new Rectangle(beginingX[place], beginingY[place],
                0.6*place_width, 0.6*place_height);
        rectangle.setStrokeWidth(figureThickness);
        rectangle.setFill(style.getBackground());
            if (playerPiece == 'r') {
                rectangle.setStroke(style.getFirstPieceStroke());
            }
            else {
                rectangle.setStroke(style.getSecondPieceStroke());
            }
            group.getChildren().add(rectangle);
            rectangle.setCursor(Cursor.CLOSED_HAND);
        }
        else if (place == -1) {
            Rectangle rectangle1 = new Rectangle(0,0,maxWidth,maxHeight);
            rectangle1.setFill(style.getBackground());
            Rectangle rectangle2 = new Rectangle(beginingX[9], beginingY[9], 0.6*maxWidth, 0.6*maxHeight);
            rectangle2.setStrokeWidth(3*figureThickness);
            rectangle2.setFill(style.getBackground());
            if (playerPiece == 'r') {
                rectangle2.setStroke(style.getFirstPieceStroke());
            }
            else {
                rectangle2.setStroke(style.getSecondPieceStroke());
            }
            group.getChildren().add(rectangle1);
            group.getChildren().add(rectangle2);
        }
    }
}
