package kolkoIKrzyzyk.Grafika.Rysowanie;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import kolkoIKrzyzyk.mechanika.Style;

public class Ok implements Shape{
    private double centerCoordinateX;
    private double centerCoordinateY;
    private double radius;
    private double maxHeight;
    private double maxWidth;

    public Ok(double maxHeight , double maxWidth){
        this.centerCoordinateX = maxWidth/2;
        this.centerCoordinateY = maxHeight/2;
        this.radius = maxHeight*0.45;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
    }
    public void draw(Style style , int place , Group group , char playerPiece){
        double thickness = maxHeight/10;
        Circle circle = new Circle(centerCoordinateX, centerCoordinateY, radius);
        circle.setFill(Color.YELLOWGREEN);
        group.getChildren().add(circle);

        Line line1 = new Line(0.25*maxWidth,0.45*maxHeight,0.43*maxWidth,0.75*maxHeight);
        Line line2 = new Line(0.43*maxWidth,0.75*maxHeight,0.75*maxWidth,0.25*maxHeight);
        line1.setStrokeWidth(thickness);
        line1.setStroke(Color.WHITE);
        line1.setStrokeLineCap(StrokeLineCap.ROUND);
        line2.setStrokeWidth(thickness);
        line2.setStroke(Color.WHITE);
        line2.setStrokeLineCap(StrokeLineCap.ROUND);
        group.getChildren().addAll(line1, line2);
    }
}
