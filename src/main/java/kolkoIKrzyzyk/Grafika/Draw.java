package kolkoIKrzyzyk.Grafika;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import kolkoIKrzyzyk.Grafika.Rysowanie.DrawFigure;
import kolkoIKrzyzyk.Grafika.Rysowanie.Ok;
import kolkoIKrzyzyk.mechanika.Style;

public class Draw {
    public Scene start(){
        Ok ok = new Ok(150,150);
        DrawFigure drawFigure = new DrawFigure(ok);
        Style style = new Style();
        Group group = new Group();
        drawFigure.drawShape(style,1 ,group, 'o');

        Scene scene = new Scene(group, 150 , 150);
        return scene;
    }
}
