package kolkoIKrzyzyk.Grafika.Rysowanie;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import kolkoIKrzyzyk.mechanika.Style;

public class Cross implements Shape{    //implementacja mojego interfejsu Shape
    /** Klasa Cross odpowiada za rysowanie krzyżyka we wskazanym miejscu. Jest 9 miejsc gdzie może być figura narysowana.
     * miejsce występowania krzyżyka liczone jest w następujacy sposób:
     *      |0|1|2|
     *      |3|4|5|
     *      |6|7|8| */
    private double figureThickness ;
    private double maxHeight ;
    private double maxWidth ;
    private double line1BeginningX[] = new double[10];
    private double line1BeginningY[] = new double[10];
    private double line1EndX[] = new double[10];
    private double line1EndY[] = new double[10];
    private double line2BeginningX[] = new double[10];
    private double line2BeginningY[] = new double[10];
    private double line2EndX[] = new double[10];
    private double line2EndY[] = new double[10];
    public Cross(double maxHeight , double maxWidth){
        this.figureThickness = maxHeight/30;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        double lineThickness = maxHeight/50;
        double place_width = ((maxWidth/3)-2*lineThickness/3);
        double place_height = ((maxHeight-30)/3-2*lineThickness/3);
        /** Obliczenie współrzędnych początku i końca linii krzyzyka dla obecnego miejsca w scenie*/
        line1BeginningX[0] = line1BeginningX[3] = line1BeginningX[6] = place_width/5;
        line1BeginningX[1] = line1BeginningX[4] = line1BeginningX[7] = lineThickness + 6*place_width/5;
        line1BeginningX[2] = line1BeginningX[5] = line1BeginningX[8] = 2*lineThickness + 11*place_width/5;
        line1BeginningX[9] = maxWidth/5;

        line1BeginningY[0] = line1BeginningY[1] = line1BeginningY[2] = 30 + place_height/5;
        line1BeginningY[3] = line1BeginningY[4] = line1BeginningY[5] = 30 + lineThickness + 6*place_height/5;
        line1BeginningY[6] = line1BeginningY[7] = line1BeginningY[8] = 30 + 2*lineThickness + 11*place_height/5;
        line1BeginningY[9] = maxHeight/5;

        line1EndX[0] = line1EndX[3] = line1EndX[6] = 4*place_width/5;
        line1EndX[1] = line1EndX[4] = line1EndX[7] = lineThickness + 9*place_width/5;
        line1EndX[2] = line1EndX[5] = line1EndX[8] = 2*lineThickness + 14*place_width/5;
        line1EndX[9] = 4*maxWidth/5;

        line1EndY[0] = line1EndY[1] = line1EndY[2] = 30 + 4*place_height/5;
        line1EndY[3] = line1EndY[4] = line1EndY[5] = 30 + lineThickness + 9*place_height/5;
        line1EndY[6] = line1EndY[7] = line1EndY[8] = 30 + 2*lineThickness + 14*place_height/5;
        line1EndY[9] = 4*maxHeight/5;

        line2BeginningX[0] = line2BeginningX[3] = line2BeginningX[6] = place_width/5;
        line2BeginningX[1] = line2BeginningX[4] = line2BeginningX[7] = lineThickness + 6*place_width/5;
        line2BeginningX[2] = line2BeginningX[5] = line2BeginningX[8] = 2*lineThickness + 11*place_width/5;
        line2BeginningX[9] = maxWidth/5;

        line2BeginningY[0] = line2BeginningY[1] = line2BeginningY[2] = 30 + 4*place_height/5;
        line2BeginningY[3] = line2BeginningY[4] = line2BeginningY[5] = 30 + lineThickness + 9*place_height/5;
        line2BeginningY[6] = line2BeginningY[7] = line2BeginningY[8] = 30 + 2*lineThickness + 14*place_height/5;
        line2BeginningY[9] = 4*maxHeight/5;

        line2EndX[0] = line2EndX[3] = line2EndX[6] = 4*place_width/5;
        line2EndX[1] = line2EndX[4] = line2EndX[7] = lineThickness + 9*place_width/5;
        line2EndX[2] = line2EndX[5] = line2EndX[8] = 2*lineThickness + 14*place_width/5;
        line2EndX[9] = 4*maxWidth/5;

        line2EndY[0] = line2EndY[1] = line2EndY[2] = 30 + place_height/5;
        line2EndY[3] = line2EndY[4] = line2EndY[5] = 30 + lineThickness + 6*place_height/5;
        line2EndY[6] = line2EndY[7] = line2EndY[8] = 30 + 2*lineThickness + 11*place_height/5;
        line2EndY[9] = maxHeight/5;

    }
    @Override
    public void draw(Style style , int place , Group group , char playerPiece) {
        /** style informuje o wybranym stylu przez użytkownika
         * place - w którym miejscu wyświetlić kształt
         * group to kontener , do którego ma trafić rysowany kształt*/
        if (place >= 0 && place < 9) {
            Line line1 = new Line(line1BeginningX[place], line1BeginningY[place], line1EndX[place], line1EndY[place]);
            if(playerPiece == 'x'){
                line1.setStroke(style.getFirstPieceStroke());
            }
            else {
                line1.setStroke(style.getSecondPieceStroke());
            }
            line1.setStrokeWidth(figureThickness);
            Line line2 = new Line(line2BeginningX[place], line2BeginningY[place], line2EndX[place], line2EndY[place]);
            if(playerPiece == 'x'){
                line2.setStroke(style.getFirstPieceStroke());
            }
            else {
                line2.setStroke(style.getSecondPieceStroke());
            }
            line2.setStrokeWidth(figureThickness);
            group.getChildren().add(line1);
            group.getChildren().add(line2);
            line1.setCursor(Cursor.CLOSED_HAND);
            line2.setCursor(Cursor.CLOSED_HAND);
        }
        else if (place == -1){
            Rectangle rectangle = new Rectangle(0,0,maxWidth,maxHeight);
            rectangle.setFill(style.getBackground());
            Line line1 = new Line(line1BeginningX[9], line1BeginningY[9], line1EndX[9], line1EndY[9]);
            if(playerPiece == 'x'){
                line1.setStroke(style.getFirstPieceStroke());
            }
            else {
                line1.setStroke(style.getSecondPieceStroke());
            }
            line1.setStrokeWidth(3*figureThickness);
            Line line2 = new Line(line2BeginningX[9], line2BeginningY[9], line2EndX[9], line2EndY[9]);
            if(playerPiece == 'x'){
                line2.setStroke(style.getFirstPieceStroke());
            }
            else {
                line2.setStroke(style.getSecondPieceStroke());
            }
            line2.setStrokeWidth(3*figureThickness);
            group.getChildren().add(rectangle);
            group.getChildren().add(line1);
            group.getChildren().add(line2);
        }
    }
}
