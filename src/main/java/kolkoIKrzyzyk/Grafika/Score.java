package kolkoIKrzyzyk.Grafika;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import kolkoIKrzyzyk.mechanika.WinDate;

public class Score {

    public Scene start(WinDate winDate) {
        /** Klasa odpowiedzialna za wyświetlenie informacji o zwycięstwie/porażce czy remisie
         *  Trzeba uwzględnić dane winDate , ale też jaką figurę wybrał gracz*/
        VBox root = new VBox();
        Text text = new Text();
        text.setFont(new Font("Tachoma", 72));
        if (winDate.getWin() == 0){
            text.setText("REMIS");
            text.setFill(Color.GOLD);
        }
        else if (winDate.getWin() == 1){
            text.setText("WYGRALES");
            text.setFill(Color.GREEN);
        }
        else {
            text.setText("PRZEGRALES");
            text.setFill(Color.RED);
        }
        root.getChildren().add(text);
        Scene scene = new Scene(root);
        return scene;
    }
}
