package kolkoIKrzyzyk.Grafika.Rysowanie;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import kolkoIKrzyzyk.mechanika.Style;

public class Triangle implements Shape{
    /** Klasa Triangle odpowiada za rysowanie trójkąta we wskazanym miejscu. Jest 9 miejsc gdzie może być figura narysowana.
     * miejsce występowania trójkąta liczone jest w następujacy sposób:
     *      |0|1|2|
     *      |3|4|5|
     *      |6|7|8| */
    private double figureThickness;
    private double corner1X[] = new double[10];
    private double corner1Y[] = new double[10];
    private double corner2X[] = new double[10];
    private double corner2Y[] = new double[10];
    private double corner3X[] = new double[10];
    private double corner3Y[] = new double[10];
    private double maxHeight;
    private double maxWidth;

    /**rogi trójkąta:           1
     *                          /\
     *                         /  \
     *                        /____\
     *                       2      3   */
    public Triangle(double maxHeight , double maxWidth){
        this.figureThickness = maxHeight/35;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        double lineThickness = maxHeight/50;
        double place_width = ((maxWidth/3)-2*lineThickness/3);
        double place_height = ((maxHeight-30)/3-2*lineThickness/3);
        /** Obliczenie współrzędnych rogów trójkąta dla obecnego miejsca w scenie:*/
        corner1X[0] = corner1X[3] = corner1X[6] = 0.5*place_width;
        corner1X[1] = corner1X[4] = corner1X[7] = lineThickness+1.5*place_width;
        corner1X[2] = corner1X[5] = corner1X[8] = 2*lineThickness+2.5*place_width;
        corner1X[9] = 0.5*maxWidth;

        corner1Y[0] = corner1Y[1] = corner1Y[2] = 0.25*place_height+30 ;
        corner1Y[3] = corner1Y[4] = corner1Y[5] = lineThickness+1.25*place_height+30 ;
        corner1Y[6] = corner1Y[7] = corner1Y[8] = 2*lineThickness+2.25*place_height+30 ;
        corner1Y[9] =  0.25*maxHeight;

        corner2X[0] = corner2X[3] = corner2X[6] = 0.25*place_width;
        corner2X[1] = corner2X[4] = corner2X[7] = lineThickness+1.25*place_width;
        corner2X[2] = corner2X[5] = corner2X[8] = 2*lineThickness+2.25*place_width;
        corner2X[9] = 0.25*maxWidth;

        corner2Y[0] = corner2Y[1] = corner2Y[2] = corner3Y[0] = corner3Y[1] = corner3Y[2] =0.75*place_height+30 ;
        corner2Y[3] = corner2Y[4] = corner2Y[5] = corner3Y[3] = corner3Y[4] = corner3Y[5] =lineThickness+1.75*place_height+30 ;
        corner2Y[6] = corner2Y[7] = corner2Y[8] = corner3Y[6] = corner3Y[7] = corner3Y[8] =2*lineThickness+2.75*place_height+30 ;
        corner2Y[9] = corner3Y[9] = 0.75*maxHeight;

        corner3X[0] = corner3X[3] = corner3X[6] = 0.75*place_width;
        corner3X[1] = corner3X[4] = corner3X[7] = lineThickness+1.75*place_width;
        corner3X[2] = corner3X[5] = corner3X[8] = 2*lineThickness+2.75*place_width;
        corner3X[9] = 0.75*maxWidth;
    }
    @Override
    public void draw(Style style , int place , Group group, char playerPiece) {
        /** style informuje o wybranym stylu przez użytkownika
         * place - w którym miejscu wyświetlić kształt
         * group to kontener , do którego ma trafić rysowany kształt*/
        if (place>= 0 &&  place < 9) {
            Polygon triangle = new Polygon(corner1X[place], corner1Y[place], corner2X[place], corner2Y[place],
                    corner3X[place], corner3Y[place]);
            triangle.setFill(style.getBackground());
            triangle.setStrokeWidth(figureThickness);
            if (playerPiece == 't') {
                triangle.setStroke(style.getFirstPieceStroke());
            }
            else {
                triangle.setStroke(style.getSecondPieceStroke());
            }
            group.getChildren().add(triangle);
            triangle.setCursor(Cursor.CLOSED_HAND);
        }
        else if (place == -1) {
            Rectangle rectangle = new Rectangle(0,0,maxWidth,maxHeight);
            rectangle.setFill(style.getBackground());
            Polygon triangle = new Polygon(corner1X[9], corner1Y[9], corner2X[9], corner2Y[9],
                    corner3X[9], corner3Y[9]);
            triangle.setFill(style.getBackground());
            triangle.setStrokeWidth(3*figureThickness);
            if (playerPiece == 't') {
                triangle.setStroke(style.getFirstPieceStroke());
            }
            else {
                triangle.setStroke(style.getSecondPieceStroke());
            }
            group.getChildren().add(rectangle);
            group.getChildren().add(triangle);
        }
    }
}
