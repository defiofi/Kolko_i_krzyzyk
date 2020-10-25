package kolkoIKrzyzyk.Grafika.Rysowanie;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import kolkoIKrzyzyk.mechanika.Style;

public class Circle implements Shape {
    /** Klasa Circle odpowiada za rysowanie koła we wskazanym miejscu. Jest 9 miejsc gdzie może być figura narysowana.
     * miejsce występowania koła liczone jest w następujacy sposób:
     *      |0|1|2|
     *      |3|4|5|
     *      |6|7|8| */
    private double figureThickness ;
    private double radius;
    private double centerCoordinateX[] = new double[10];
    private double centerCoordinateY[] = new double[10];
    private double maxHeight;
    private double maxWidth;
    public Circle(double maxHeight , double maxWidth){
        this.figureThickness = maxHeight/37.5;
        this.radius = maxHeight/9;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        double lineThickness = maxHeight/50;
        double place_width = ((maxWidth/3)-2*lineThickness/3);
        double place_height = ((maxHeight-30)/3-2*lineThickness/3);
        /** Obliczenie współrzędnych środka koła dla obecnego miejsca w scenie*/
        centerCoordinateX[0] = centerCoordinateX[3] = centerCoordinateX[6] = place_width/2;
        centerCoordinateX[1] = centerCoordinateX[4] = centerCoordinateX[7] = lineThickness+3*place_width/2;
        centerCoordinateX[2] = centerCoordinateX[5] = centerCoordinateX[8] = 2*lineThickness+5*place_width/2;
        centerCoordinateX[9] = maxWidth/2;
        centerCoordinateY[0] = centerCoordinateY[1] = centerCoordinateY[2] = 30 + place_height/2;
        centerCoordinateY[3] = centerCoordinateY[4] = centerCoordinateY[5] = 30 + lineThickness + 3*place_height/2;
        centerCoordinateY[6] = centerCoordinateY[7] = centerCoordinateY[8] = 30 + 2*lineThickness + 5*place_height/2;
        centerCoordinateY[9] = maxHeight/2;
    }
    @Override
    public void draw(Style style , int place , Group group, char playerPiece) {
        /** style informuje o wybranym stylu przez użytkownika
         * place - w którym miejscu wyświetlić kształt
         * group to kontener , do którego ma trafić rysowany kształt*/
        if (place>= 0 &&  place < 9) {
            javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle(centerCoordinateX[place],
                    centerCoordinateY[place], radius);
            /** Ustawienie kolorów koła zgodnie z wybranym stylem przez użytkownika*/
            circle.setFill(style.getBackground());
            if (playerPiece == 'o') {
                circle.setStroke(style.getFirstPieceStroke());
            }
            else {
                circle.setStroke(style.getSecondPieceStroke());
            }
            circle.setStrokeWidth(figureThickness);
            group.getChildren().add(circle);
            circle.setCursor(Cursor.CLOSED_HAND);
        }
        else if (place == -1) {
            javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle(centerCoordinateX[9],
                    centerCoordinateY[9], 3*radius);
            circle.setFill(style.getBackground());
            if (playerPiece == 'o') {
                circle.setStroke(style.getFirstPieceStroke());
            }
            else {
                circle.setStroke(style.getSecondPieceStroke());
            }
            circle.setStrokeWidth(3*figureThickness);
            Rectangle rectangle = new Rectangle(0,0, maxHeight , maxWidth);
            rectangle.setFill(style.getBackground());
            group.getChildren().add(rectangle);
            group.getChildren().add(circle);
        }
    }
}
