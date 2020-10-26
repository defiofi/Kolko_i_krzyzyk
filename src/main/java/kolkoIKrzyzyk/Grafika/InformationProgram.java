package kolkoIKrzyzyk.Grafika;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class InformationProgram {
    /**Klasa odpowiada za treść okienka z powiadomieniem użytkownika o programie */
    public Scene start() {
        Image draw1 = new Image("file:src/main/resources/Usmiech.png");
        ImageView smile = new ImageView(draw1);
        smile.setFitWidth(400);
        smile.setFitHeight(400);
        TextArea text1 = new TextArea();
        text1.setWrapText(true);
        text1.setEditable(false);
        text1.setFont(Font.font(18));
        text1.setText("Program Kolko i Krzyzyk - wersja 1.01 \nAplikacja  powstala w pazdzierniku 2020 roku. Tworzona byla w jezyku programowania: java w wersji 11.0.2 oraz przy uzyciu biblioteki javafx. Aplikacja tworzona byla bez uzycia polskiej czcionki i dlatego w polskich slowach nie ma liter z \"ogonkami\".\nProgram umozliwia gre jak w tytule. Gra toczy sie na planszy o 9 polach (3 x 3). Gracz moze ustawic stopien trudnosci, znak ktorym gra oraz kto ma pierwszy ruch. Mozna rowniez ustawic styl planszy i figur. W programie uzyto kilka darmowych grafik ze strony: https://pixabay.com/pl/ \nAutor zyczy wszystkim graczom duzo radosci z uzytkowania programu. ");
        text1.setMaxSize(720,300);
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(text1, smile);
        Scene scene = new Scene(root);
        return scene;
    }
}
