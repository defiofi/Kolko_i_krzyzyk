package kolkoIKrzyzyk.Grafika;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;



public class HowPlay {
/**Klasa odpowiada za treść okienka z powiadomieniem użytkownika jak grać... */
    Image draw1 = new Image("file:src/main/resources/JakGrac1.png");
    Image draw2 = new Image("file:src/main/resources/JakGrac2.png");

    public Scene start() {
        ImageView pic1 = new ImageView();
        pic1.setImage(draw1);
        pic1.setFitHeight(70);
        pic1.setPreserveRatio(true);
        ImageView pic2 = new ImageView();
        pic2.setImage(draw2);
        pic2.setFitHeight(70);
        pic2.setPreserveRatio(true);

        Label label1 = new Label(" Wygrana");
        label1.setFont(new Font("Arial Italic", 24));
        label1.setMinWidth(700);
        label1.setTextAlignment(TextAlignment.CENTER);

        TextArea text1 = new TextArea();
        text1.setWrapText(true);
        text1.setEditable(false);
        text1.setText("Gracze na przemian wstawiaja w wolne pola swoje figury. Gra polega na uzyskaniu jako pierwszy w jednej lini trzech swoich figur. Jezeli to sie uda to gracz wygrywa. Jak pokazano to na obrazku ponizej, gdzie grajacy krzyzykiem wygral.");
        text1.setMaxSize(700,70);
        text1.setFont(new Font("Arial Italic", 16));

        Label label2 = new Label(" Remis");
        label2.setFont(new Font("Arial Italic", 24));
        label2.setMinWidth(700);
        label2.setTextAlignment(TextAlignment.CENTER);

        TextArea text2 = new TextArea();
        text2.setWrapText(true);
        text2.setEditable(false);
        text2.setText("Moze zdarzyc sie sytuacja , ze wszystkie pola zostana zajete, a zaden z graczy nie utworzy lini ze swoich figur (krzyzyka lub kolka). W takiej sytuacji jest remis. Pokazano to na rysunku ponizej.");
        text2.setPrefColumnCount(2);
        text2.setFont(new Font("Arial Italic", 16));
        text2.setMaxSize(700,70);

        VBox root = new VBox(10);
        root.getChildren().addAll(label1,text1, pic1 ,label2, text2, pic2 );
        Scene scene = new Scene(root);
        return scene;
    }
}
