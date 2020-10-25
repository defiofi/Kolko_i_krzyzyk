package kolkoIKrzyzyk.Grafika.Rysowanie;

import javafx.scene.Group;
import kolkoIKrzyzyk.mechanika.Style;

public class DrawFigure {
    Shape shape;
    /** Klasa odpowiada za rysowanie figury korzystając z interfajsu Shape
     * Dostępne kształty to:
     * - WinLine - rysowanie lini pokazującej w którym miejscu nastąpiło ułozenie trzech takich samych figur.
     * - Circle - rysowanie koła w rządanym miejscu.
     * - Cross - rysowanie krzyżyka w rządanym miejscu.
     * - Triangle - rysowanie trójkąta w rządanym miejscu
     * - CrossLines - rysowanie lini planszy    */
    public DrawFigure( Shape shape ){
        this.shape = shape;
    }
    public void changeShape(Shape shape){
        this.shape = shape;
    }
    public void drawShape(Style style, int place , Group group, char playerPiece){
        /** style informuje o wybranym stylu przez użytkownika
         * place - w którym miejscu ma być narysowany kształt
         * group to kontener , do którego ma trafić rysowany kształt
         * playerPiece mówi o tym jaką figurę / znak wybrał gracz   */
        shape.draw(style, place, group, playerPiece);
    }
}
