package kolkoIKrzyzyk.Grafika.Rysowanie;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import kolkoIKrzyzyk.mechanika.Style;

public class CrossLines implements Shape{
    /** Klasa CrossLines odpowiada za rysowanie lini planszy oraz za tło planszy*/
    double thickness;
    double maxHeight;
    double maxWidth;
    public CrossLines(double maxHeight , double maxWidth ){
        this.thickness = maxHeight/50;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
    }
    @Override
    public void draw(Style style , int nic , Group group, char playerPiece){
        /** style informuje o wybranym stylu przez użytkownika
         * nic - w tym przypadku nie bedzie parametrem w metodzie, ale musi być z uwagi na interface
         * group to kontener , do którego ma trafić rysowany kształt*/
        Rectangle rectangle = new Rectangle(0,30, maxWidth, maxHeight);
        rectangle.setFill(style.getBackground());

        Line line1 = new Line(10,((maxHeight-30)/3)+30-thickness/6,maxWidth-10,((maxHeight-30)/3)+30-thickness/6);
        line1.setStrokeWidth(thickness);
        line1.setStroke(style.getLine());
        line1.setStrokeLineCap(StrokeLineCap.ROUND);
        Line line2 = new Line(10,(2*(maxHeight-30)/3)+30+thickness/6,maxWidth-10,(2*(maxHeight-30)/3)+30+thickness/6);
        line2.setStrokeWidth(thickness);
        line2.setStroke(style.getLine());
        line2.setStrokeLineCap(StrokeLineCap.ROUND);
        Line line3 = new Line(maxWidth/3-thickness/6,40,maxWidth/3-thickness/6,maxHeight-10);
        line3.setStrokeWidth(thickness);
        line3.setStroke(style.getLine());
        line3.setStrokeLineCap(StrokeLineCap.ROUND);
        Line line4 = new Line(2*maxWidth/3+thickness/6,40,2*maxWidth/3+thickness/6,maxHeight-10);
        line4.setStrokeWidth(thickness);
        line4.setStroke(style.getLine());
        line4.setStrokeLineCap(StrokeLineCap.ROUND);
        group.getChildren().addAll(rectangle, line1 , line2 , line3 , line4);
        line1.setCursor(Cursor.CLOSED_HAND);
        line2.setCursor(Cursor.CLOSED_HAND);
        line3.setCursor(Cursor.CLOSED_HAND);
        line4.setCursor(Cursor.CLOSED_HAND);
    }
}
