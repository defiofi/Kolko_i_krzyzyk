package kolkoIKrzyzyk.Grafika.Rysowanie;

import javafx.scene.Group;
import kolkoIKrzyzyk.mechanika.Style;

public interface Shape {
    public void draw(Style style, int place, Group group, char playerPiece);
}
