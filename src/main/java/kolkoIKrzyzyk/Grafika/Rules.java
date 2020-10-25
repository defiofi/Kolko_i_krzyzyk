package kolkoIKrzyzyk.Grafika;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class Rules {
    /**Klasa odpowiada za wygląd okienka mówiącego o regułach gry w kółko i krzyżyk */
    public Scene start() {

        StackPane root = new StackPane();
        TextArea textZasad = new TextArea();
        textZasad.setWrapText(true);
        textZasad.setText("Gra odbywa sie na planszy o 9 polach (3 na 3). Gracz wybiera czy chce stawiac kolko czy krzyzyk. Gracze naprzemiennie zaznaczaja upatrzone pola, stawiajac swoja figure. Celem gry jest zaznaczenie 3 pol w jednej linii, przy jednoczesnym uniemozliwieniu tego samego przeciwnikowi. Pole moze byc objete przez jednego gracza i nie zmienia swego wlasciciela przez caly przebieg gry. Gdy ktorys z graczy stworzy linie trzech swoich figur, zostaje ona przekreslona, a gracz lub komputer zostaje zwyciezca. Gdy wszystkie pola sa zajete i nie zostaje utworzona linia, gra konczy sie remisem. W czasie gry nie mozna zmieniac ustawien gry. Mozna to zrobic przed lub po koncu gry.");
        textZasad.setEditable(false);
        textZasad.setFont(new Font("Arial Italic", 16));
        root.getChildren().addAll(textZasad );
        Scene scene = new Scene(root);
        return scene;
    }
}