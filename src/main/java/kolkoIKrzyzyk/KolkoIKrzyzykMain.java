package kolkoIKrzyzyk;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import kolkoIKrzyzyk.Grafika.*;
import kolkoIKrzyzyk.Grafika.Rysowanie.*;
import kolkoIKrzyzyk.mechanika.*;
import java.util.HashMap;
import java.util.Map;

public class KolkoIKrzyzykMain extends Application {
    private final Image icon = new Image("file:src/main/resources/ikonka2.png");
    private Image draw1 = new Image("file:src/main/resources/Czlowiek1.png");
    private Image draw2 = new Image("file:src/main/resources/IkonaKomputera.png");
    private Image draw3 = new Image("file:src/main/resources/Prosto.png");
    private Image draw4 = new Image("file:src/main/resources/Srednio.png");
    private Image draw5 = new Image("file:src/main/resources/Trudno.jpg");
    private Image draw6 = new Image("file:src/main/resources/KiK_zdjecie1.jpg");
    private TypesOfStyle typesOfStyle = new TypesOfStyle();     // Zawiera zdefiniowane typy stylów
    private int numberOfStyle = 0;
    private boolean firstMove = true;                   /**false - komputer pierwszy ; true - gracz pierwszy się rusza */
    private int difficulty = 1;                         /**1 - łatwy poziom; 2- średni poziom; 3 - trudny */
    private char playerPiece = 'x';                     /**'o' = koło ; 'x' = krzyżyk ; 't' = trójkąt ; 'r' = kwadrat */
    private char computerPiece = 'o';
    private boolean playerMovement = true;              /**false = ruch komputera ; true = ruch gracza */
    private boolean newChanges = false;                     /** false = bez zmian , true = nowa zmiana*/
    //private boolean showCouresGame = false;                 //Pokazać przebieg gry czy nie
    private char playBoard[][] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};       //Tablica gry
    private Group root = new Group();
    private VBox vBox = new VBox();
    private HBox hBox = new HBox();
    private Scene scene = new Scene(vBox, 450, 480);
    private CheckScore checkScore = new CheckScore();
    private WinDate winDate= new WinDate(0,0);
    private Movement movement = new Movement();
    private Move move = new Move(-1,-1);

    public class Option{
        /**Odpowiada za okno opcji */
        public Scene option(Stage optionsStage){
            VBox vBox2 = new VBox(5);
            Text text1 = new Text(" ");
            text1.setFont(new Font("Tachoma" , 24));
            Text text2 = new Text(" ");
            text2.setFont(new Font("Tachoma" , 24));
            ImageView icon21 = new ImageView(draw1);
            icon21.setFitHeight(120);
            icon21.setFitWidth(120);
            Text text3 = new Text(" ");
            text3.setFont(new Font("Tachoma" , 20));
            Text text4 = new Text(" ");
            text4.setFont(new Font("Tachoma" , 10));
            ImageView icon22 = new ImageView(draw3);
            icon22.setFitHeight(120);
            icon22.setFitWidth(120);
            Group aGroup1 = new Group();
            Group aGroup2 = new Group();
            Group aicon1 = new Group();
            Group aicon10 = new Group();
            aGroup1.prefWidth(120);
            aGroup1.prefHeight(120);
            Label label1 = new Label("Wybor figury gracza:");
            label1.setFont(new Font("Tachoma",20));
            ToggleGroup group1 = new ToggleGroup();
            Circle aCircle = new Circle(120,120);
            Cross aCross = new Cross(120,120);
            Triangle aTriangle = new Triangle(120,120);
            RectangleKK aRectangleKK = new RectangleKK(120,120);
            DrawFigure drawFigure1 = new DrawFigure(aCross);
            drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup1, playerPiece);
            Circle aiconCircle = new Circle(30,30);
            drawFigure1.changeShape(aiconCircle);
            drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aicon1, playerPiece);
            drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aicon10, playerPiece);
            RadioButton radioButtonCircle1 = new RadioButton("Kolko");
            radioButtonCircle1.setFont(new Font("Tachoma" , 20));
            radioButtonCircle1.setGraphic(aicon1);
            radioButtonCircle1.setToggleGroup(group1);
            if (playerPiece == 'o'){radioButtonCircle1.setSelected(true);}
            Group aicon2 = new Group();
            Group aicon11 = new Group();
            Cross aiconCross = new Cross(30,30);
            drawFigure1.changeShape(aiconCross);
            drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aicon2, playerPiece);
            drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aicon11, playerPiece);
            RadioButton radioButtonCross1 = new RadioButton("Krzyzyk");
            radioButtonCross1.setFont(new Font("Tachoma", 20));
            radioButtonCross1.setGraphic(aicon2);
            radioButtonCross1.setToggleGroup(group1);
            if (playerPiece == 'x'){radioButtonCross1.setSelected(true);}
            Group aicon3 = new Group();
            Group aicon12 = new Group();
            Triangle triangleIcon = new Triangle(30,30);
            drawFigure1.changeShape(triangleIcon);
            drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aicon3, playerPiece);
            drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aicon12, playerPiece);
            RadioButton radioButtonTriangle1 = new RadioButton("Trojkat");
            radioButtonTriangle1.setFont(new Font("Tachoma", 20));
            radioButtonTriangle1.setGraphic(aicon3);
            radioButtonTriangle1.setToggleGroup(group1);
            if (playerPiece == 't'){radioButtonTriangle1.setSelected(true);}
            Group aicon4 = new Group();
            Group aicon13 = new Group();
            RectangleKK rectangleIcon = new RectangleKK(30,30);
            drawFigure1.changeShape(rectangleIcon);
            drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aicon4, playerPiece);
            drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aicon13, playerPiece);
            RadioButton radioButtonRectangle1 = new RadioButton("Kwadrat");
            radioButtonRectangle1.setFont(new Font("Tachoma", 20));
            radioButtonRectangle1.setGraphic(aicon4);
            radioButtonRectangle1.setToggleGroup(group1);
            if (playerPiece == 'r'){radioButtonRectangle1.setSelected(true);}
            Label label2 = new Label("Wybor figury dla komputera:");
            label2.setFont(new Font("Tachoma",20));
            ToggleGroup group2 = new ToggleGroup();
            RadioButton radioButtonCircle2 = new RadioButton("Kolko");
            radioButtonCircle2.setFont(new Font("Tachoma" , 20));
            radioButtonCircle2.setGraphic(aicon10);
            radioButtonCircle2.setToggleGroup(group2);
            if (computerPiece == 'o'){radioButtonCircle2.setSelected(true);}
            RadioButton radioButtonCross2 = new RadioButton("Krzyzyk");
            radioButtonCross2.setFont(new Font("Tachoma", 20));
            radioButtonCross2.setGraphic(aicon11);
            radioButtonCross2.setToggleGroup(group2);
            if (computerPiece == 'x'){radioButtonCross2.setSelected(true);}
            RadioButton radioButtonTriangle2 = new RadioButton("Trojkat");
            radioButtonTriangle2.setFont(new Font("Tachoma", 20));
            radioButtonTriangle2.setGraphic(aicon12);
            radioButtonTriangle2.setToggleGroup(group2);
            if (computerPiece == 't'){radioButtonTriangle2.setSelected(true);}
            RadioButton radioButtonRectangle2 = new RadioButton("Kwadrat");
            radioButtonRectangle2.setFont(new Font("Tachoma", 20));
            radioButtonRectangle2.setGraphic(aicon13);
            radioButtonRectangle2.setToggleGroup(group2);
            if (computerPiece == 'r'){radioButtonRectangle2.setSelected(true);}
            radioButtonCircle1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    playerPiece = 'o';
                    drawFigure1.changeShape(aCircle);
                    drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup1, playerPiece);
                    if (computerPiece == 'o'){
                        computerPiece = 'x';
                        radioButtonCross2.setSelected(true);
                        drawFigure1.changeShape(aCross);
                        drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup2, playerPiece);
                    }
                }
            });
            radioButtonCross1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    playerPiece = 'x';
                    drawFigure1.changeShape(aCross);
                    drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup1, playerPiece);
                    if (computerPiece == 'x'){
                        computerPiece = 'o';
                        radioButtonCircle2.setSelected(true);
                        drawFigure1.changeShape(aCircle);
                        drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup2, playerPiece);
                    }
                }
            });
            radioButtonTriangle1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    playerPiece = 't';
                    drawFigure1.changeShape(aTriangle);
                    drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup1, playerPiece);
                    if (computerPiece == 't'){
                        computerPiece = 'x';
                        radioButtonCross2.setSelected(true);
                        drawFigure1.changeShape(aCross);
                        drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup2, playerPiece);
                    }
                }
            });
            radioButtonRectangle1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    playerPiece = 'r';
                    drawFigure1.changeShape(aRectangleKK);
                    drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup1, playerPiece);
                    if (computerPiece == 'r'){
                        computerPiece = 'x';
                        radioButtonCross2.setSelected(true);
                        drawFigure1.changeShape(aCross);
                        drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup2, playerPiece);
                    }
                }
            });
            radioButtonCircle2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    computerPiece = 'o';
                    drawFigure1.changeShape(aCircle);
                    drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup2, playerPiece);
                    if (playerPiece == 'o'){
                        playerPiece = 'x';
                        radioButtonCross1.setSelected(true);
                        drawFigure1.changeShape(aCross);
                        drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup1, playerPiece);
                    }
                }
            });
            radioButtonCross2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    computerPiece = 'x';
                    drawFigure1.changeShape(aCross);
                    drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup2, playerPiece);
                    if (playerPiece == 'x'){
                        playerPiece = 'o';
                        radioButtonCircle1.setSelected(true);
                        drawFigure1.changeShape(aCircle);
                        drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup1, playerPiece);
                    }
                }
            });
            radioButtonTriangle2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    computerPiece = 't';
                    drawFigure1.changeShape(aTriangle);
                    drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup2, playerPiece);
                    if (playerPiece == 't'){
                        playerPiece = 'x';
                        radioButtonCross1.setSelected(true);
                        drawFigure1.changeShape(aCross);
                        drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup1, playerPiece);
                    }
                }
            });
            radioButtonRectangle2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    computerPiece = 'r';
                    drawFigure1.changeShape(aRectangleKK);
                    drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup2, playerPiece);
                    if (playerPiece == 'r'){
                        playerPiece = 'x';
                        radioButtonCross1.setSelected(true);
                        drawFigure1.changeShape(aCross);
                        drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup1, playerPiece);
                    }
                }
            });
            drawFigure1.changeShape(aCircle);
            drawFigure1.drawShape(typesOfStyle.getStyle(numberOfStyle), -1, aGroup2, playerPiece);
            vBox2.getChildren().addAll( text1, aGroup1,text2, aGroup2, text3, icon21, text4, icon22);

            Label label3 = new Label("Wybor kto rozpoczyna gre:");
            label3.setFont(new Font("Tachoma",20));
            ToggleGroup group3 = new ToggleGroup();
            RadioButton radioButtonPlayer = new RadioButton("Gracz");
            radioButtonPlayer.setFont(new Font("Tachoma", 20));
            ImageView icon4 = new ImageView(draw1);
            icon4.setFitHeight(30);
            icon4.setFitWidth(30);
            radioButtonPlayer.setGraphic(icon4);
            radioButtonPlayer.setToggleGroup(group3);
            radioButtonPlayer.setSelected(true);
            radioButtonPlayer.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    firstMove = true;
                    icon21.setImage(draw1);
                }
            });
            RadioButton radioButtonComputer = new RadioButton("Komputer");
            radioButtonComputer.setFont(new Font("Tachoma", 20));
            ImageView icon5 = new ImageView(draw2);
            icon5.setFitHeight(30);
            icon5.setFitWidth(30);
            radioButtonComputer.setGraphic(icon5);
            radioButtonComputer.setToggleGroup(group3);
            radioButtonComputer.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    firstMove = false;
                    icon21.setImage(draw2);
                }
            });
            Label label4 = new Label("Wybor poziomu trudnosci:");
            label4.setFont(new Font("Tachoma",20));
            ToggleGroup group4 = new ToggleGroup();
            RadioButton radioButtonEasy = new RadioButton("Latwy");
            radioButtonEasy.setFont(new Font("Tachoma", 20));
            radioButtonEasy.setToggleGroup(group4);
            radioButtonEasy.setSelected(true);
            radioButtonEasy.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    difficulty = 1;
                    icon22.setImage(draw3);
                }
            });
            RadioButton radioButtonMedium = new RadioButton("Sredni");
            radioButtonMedium.setFont(new Font("Tachoma", 20));
            radioButtonMedium.setToggleGroup(group4);
            radioButtonMedium.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    difficulty = 2;
                    icon22.setImage(draw4);
                }
            });
            RadioButton radioButtonHard = new RadioButton("Trudny");
            radioButtonHard.setFont(new Font("Tachoma", 20));
            radioButtonHard.setToggleGroup(group4);
            radioButtonHard.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    difficulty = 3;
                    icon22.setImage(draw5);
                }
            });
           /* Label label5 = new Label("Nauka:");
            label5.setFont(Font.font("Tachoma" , 20));
            CheckBox checkBoxLearn = new CheckBox("Wyswietl przebieg gry");
            checkBoxLearn.setFont(Font.font("Tachoma" , 20));
            checkBoxLearn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    showCouresGame = !showCouresGame;
                }
            });*/
            Group group = new Group();
            Ok iconOk = new Ok(40, 40);
            DrawFigure iconButton = new DrawFigure(iconOk);
            iconButton.drawShape(new Style(), 0 ,group , playerPiece);
            Button buttonOk = new Button("OK", group );
            buttonOk.setMinSize(70 , 50);
            buttonOk.setFont(Font.font(24));
            buttonOk.setTextFill(Color.DARKGREEN);
            buttonOk.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {

                    optionsStage.close();
                }
            });
            VBox vBox1 = new VBox(5);
            HBox hBox = new HBox(5);
            vBox1.getChildren().addAll(label1, radioButtonCross1,radioButtonCircle1, radioButtonTriangle1, radioButtonRectangle1,
                    label2, radioButtonCross2, radioButtonCircle2, radioButtonTriangle2, radioButtonRectangle2, label3,
                    radioButtonPlayer, radioButtonComputer, label4, radioButtonEasy, radioButtonMedium, radioButtonHard,
                    buttonOk);
            hBox.getChildren().addAll(vBox1,vBox2);
            Scene optionScene = new Scene(hBox);
            return optionScene;
        }
    }
    public class PlayStyle {
        /**Odpowiada za okno wyboru stylu */
        public void start(Stage playStyle) {
            ListView<String> list = new ListView<>();
            ObservableList<String> items= FXCollections.observableArrayList();

            for (int i = 0 ; i< typesOfStyle.getSize() ; i++) {
                items.add(typesOfStyle.getStyle(i).getNameOfStyle());
            }
            list.setItems(items);
            list.setPrefWidth(150);
            list.setPrefHeight(200);
            Label label = new Label("Dostepne style:");
            label.setLayoutX(10);
            label.setLayoutY(115);
            label.setFont(Font.font("Verdana", 16));
            Ok iconOk = new Ok(40, 40);
            Style style = new Style();
            Group group = new Group();
            DrawFigure iconButton = new DrawFigure(iconOk);
            iconButton.drawShape(style, 0 ,group , playerPiece);
            Button buttonOk = new Button("OK", group );
            buttonOk.setMinSize(70 , 50);
            buttonOk.setFont(Font.font(24));
            buttonOk.setTextFill(Color.DARKGREEN);

            VBox root = new VBox(5);
            root.getChildren().addAll(label , list , buttonOk);
            playStyle.setScene(new Scene(root, 280, 250));
            playStyle.setTitle("Wybor stylu gry");
            list.edit(4);

            buttonOk.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    ObservableList<String> a = list.getSelectionModel().getSelectedItems() ;
                    if (a.size()>0){
                        numberOfStyle = items.indexOf(a.get(0));
                    }
                    newChanges = true;
                    playStyle.close();
                }
            });
            playStyle.show();
        }
    }
    public class Board {
        /**Klasa odpowiada za główną planszę gry */
        private Rectangle boxes[] = new Rectangle[9];
        public void getBr(char[][] pB){             /** Metoda może wyświetlić w stan planszy na ekranie tekstowym */
            String a;
            for (int i = 0 ; i < 3 ; i++){
                a = " ";
                a += pB[i][0]+" | ";
                a += pB[i][1]+" | ";
                a += pB[i][2];
                System.out.println(a);
            }
        }
        public void drawBoard(double maxHeight , double maxWidth , Stage primaryStage , TypesOfStyle typesOfStyle, MenuItem add4){
            /** Główna metoda do rysowania przebiegu gry*/
            Stage score = new Stage();                              /**OKNO WYNIKU GRY */
            score.initOwner(primaryStage);
            score.initModality(Modality.APPLICATION_MODAL);
            score.setOpacity(0.70);
            Map<Character , Shape> shapeMap = new HashMap<>();      /** Mapa używanych figur 'o', 'x', 't', 'r'*/
            WinLine winLine = new WinLine( maxHeight, maxWidth );   /**Obiekty moich klas  implementujace  Shape */
            Circle aCircle = new Circle(maxHeight, maxWidth);
            shapeMap.put('o',aCircle);
            Cross aCross = new Cross(maxHeight, maxWidth);
            shapeMap.put('x',aCross);
            Triangle aTriangle = new Triangle(maxHeight, maxWidth);
            shapeMap.put('t', aTriangle);
            RectangleKK aRectangle = new RectangleKK(maxHeight, maxWidth);
            shapeMap.put('r',aRectangle);
            CrossLines aCrossLines = new CrossLines(maxHeight, maxWidth);
            shapeMap.put('1',aCrossLines);
            DrawFigure drawFigure = new DrawFigure(winLine);        /**Obiekt do rysowania do którego wkłada się obiekty typu Shape*/
            /** Rysowanie planszy do gry*/
            drawFigure.changeShape(aCrossLines);
            drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 0 , root, playerPiece);
            /** Utworzenie boxów wykrywajacych zamiary gracza. Gracz klikając w nie wstawia swoją figurę.*/
            double beginingX[] = new double[9];
            double beginingY[] = new double[9];
            double lineThickness = maxHeight/50;

            /** Obliczenie współrzędnych początkowych boxów*/
            beginingX[0] = beginingX[3] = beginingX[6] = 0;                                 //wspX obrazków 1,4,7 takie same
            beginingX[1] = beginingX[4] = beginingX[7] = maxWidth/3+lineThickness/3;        //wspX obrazków 2;5;8 takie same
            beginingX[2] = beginingX[5] = beginingX[8] = 2*maxWidth/3+2*lineThickness/3;    //wspX obrazków 3;6;9 takie same

            beginingY[0] = beginingY[1] = beginingY[2] = 30;                                        //wspY obrazków 1,2,3 takie same
            beginingY[3] = beginingY[4] = beginingY[5] = ((maxHeight-30)/3)+30+lineThickness/3;     //wspY obrazków 4,5,6 takie same
            beginingY[6] = beginingY[7] = beginingY[8] = (2*(maxHeight-30)/3)+30+2*lineThickness/3; //wspY obrazków 7,8,9 takie same
            /** Obliczenie długosci i szerokosci boxów*/
            double width = ((maxWidth/3)-2*lineThickness/3);
            double height = ((maxHeight-30)/3-2*lineThickness/3);;
            for(int i = 0 ; i < boxes.length; i++){
                boxes[i] = new Rectangle(beginingX[i],beginingY[i],width,height);
                boxes[i].setOpacity(0.0);
                root.getChildren().add(boxes[i]);
                boxes[i].setCursor(Cursor.HAND);
            }
            /** działanie boxów na kliknięcie*/
            boxes[0].setOnMousePressed(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (playBoard[0][0] == ' ' && playerMovement) {
                        drawFigure.changeShape(shapeMap.get(playerPiece));
                        playBoard[0][0] = playerPiece;
                        drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 0 , root, playerPiece);
                        playerMovement = false;
                        boxes[0].setCursor(Cursor.CLOSED_HAND);
                    }
                }
            });
            boxes[1].setOnMousePressed(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (playBoard[0][1] == ' ' && playerMovement) {
                        drawFigure.changeShape(shapeMap.get(playerPiece));
                        playBoard[0][1] = playerPiece;
                        drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 1 , root, playerPiece);
                        playerMovement = false;
                        boxes[1].setCursor(Cursor.CLOSED_HAND);
                    }
                }
            });
            boxes[2].setOnMousePressed(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (playBoard[0][2] == ' ' && playerMovement) {
                        drawFigure.changeShape(shapeMap.get(playerPiece));
                        playBoard[0][2] = playerPiece;
                        drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 2 , root, playerPiece);
                        playerMovement = false;
                        boxes[2].setCursor(Cursor.CLOSED_HAND);
                    }
                }
            });
            boxes[3].setOnMousePressed(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (playBoard[1][0] == ' ' && playerMovement) {
                        drawFigure.changeShape(shapeMap.get(playerPiece));
                        playBoard[1][0] = playerPiece;
                        drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 3 , root, playerPiece);
                        playerMovement = false;
                        boxes[3].setCursor(Cursor.CLOSED_HAND);
                    }
                }
            });
            boxes[4].setOnMousePressed(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (playBoard[1][1] == ' ' && playerMovement) {
                        drawFigure.changeShape(shapeMap.get(playerPiece));
                        playBoard[1][1] = playerPiece;
                        drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 4 , root, playerPiece);
                        playerMovement = false;
                        boxes[4].setCursor(Cursor.CLOSED_HAND);
                    }
                }
            });
            boxes[5].setOnMousePressed(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (playBoard[1][2] == ' ' && playerMovement) {
                        drawFigure.changeShape(shapeMap.get(playerPiece));
                        playBoard[1][2] = playerPiece;
                        drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 5 , root, playerPiece);
                        playerMovement = false;
                        boxes[5].setCursor(Cursor.CLOSED_HAND);
                    }
                }
            });
            boxes[6].setOnMousePressed(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (playBoard[2][0] == ' ' && playerMovement) {
                        drawFigure.changeShape(shapeMap.get(playerPiece));
                        playBoard[2][0] = playerPiece;
                        drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 6 , root, playerPiece);
                        playerMovement = false;
                        boxes[6].setCursor(Cursor.CLOSED_HAND);
                    }
                }
            });
            boxes[7].setOnMousePressed(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (playBoard[2][1] == ' ' && playerMovement) {
                        drawFigure.changeShape(shapeMap.get(playerPiece));
                        playBoard[2][1] = playerPiece;
                        drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 7 , root, playerPiece);
                        playerMovement = false;
                        boxes[7].setCursor(Cursor.CLOSED_HAND);
                    }
                }
            });
            boxes[8].setOnMousePressed(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (playBoard[2][2] == ' ' && playerMovement) {
                        drawFigure.changeShape(shapeMap.get(playerPiece));
                        playBoard[2][2] = playerPiece;
                        drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 8 , root, playerPiece);
                        playerMovement = false;
                        boxes[8].setCursor(Cursor.CLOSED_HAND);
                    }
                }
            });
            root.setOnMouseReleased(new EventHandler<MouseEvent>() {
                /**Miejsce gdzie komputer wykonuje ruch i analizuje sytuację na planszy
                Analiza występuje zaraz po ruchu człowieka, a potem po ruchu komputera */
                @Override
                public void handle(MouseEvent event) {
                    if(newChanges){         /**przerysowanie planszy na nowo jeżeli gracz wybrał nowy styl w czasie gry*/
                        reDraw(shapeMap, drawFigure,typesOfStyle);
                        for(int i = 0 ; i < boxes.length; i++){
                            root.getChildren().remove(boxes[i]);
                            root.getChildren().add(boxes[i]);
                            if (playBoard[i/3][i%3] == ' '){
                                boxes[i].setCursor(Cursor.HAND);
                            }
                            else {
                                boxes[i].setCursor(Cursor.CLOSED_HAND);
                            }
                        }
                        newChanges = false;
                    }
                    if (!playerMovement) {
                        winDate = checkScore.checkWin(playBoard , playerPiece, computerPiece);
                        if ((winDate.getWin() == 0)&&(checkScore.possibilityOfMovement(playBoard))) {
                            move = movement.getMove(playBoard, difficulty, playerPiece, computerPiece);
                            playBoard[move.getX()][move.getY()] = computerPiece ;
                            drawFigure.changeShape(shapeMap.get(computerPiece));
                            drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), move.getX()*3+move.getY(), root, playerPiece);
                            boxes[3*move.getX()+move.getY()].setCursor(Cursor.CLOSED_HAND);
                            winDate = checkScore.checkWin(playBoard , playerPiece, computerPiece);
                            if ((winDate.getWin() == 0)&&(checkScore.possibilityOfMovement(playBoard))) {   //Analiza tego co po ruchu komputera
                                playerMovement = true;
                            }
                            else if (winDate.getWin() != 0) {                           //komputer wygrał
                                drawFigure.changeShape(winLine);
                                drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), winDate.getWinLine(), root, playerPiece);
                                score.setScene(new Score().start(winDate));
                                score.show();
                                primaryStage.setResizable(true);
                                add4.setDisable(false);
                            }
                            else {                                                      //Remis po ruchu komputera
                                score.setScene(new Score().start(winDate));
                                score.show();
                                primaryStage.setResizable(true);
                                add4.setDisable(false);
                            }
                        }
                        else if (winDate.getWin() != 0){                                //człowiek wygrał
                            drawFigure.changeShape(winLine);
                            drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), winDate.getWinLine(), root, playerPiece);
                            score.setScene(new Score().start(winDate));
                            score.show();
                            primaryStage.setResizable(true);
                            add4.setDisable(false);
                        }
                        else{                                                           //Remis po ruchu człowieka
                            score.setScene(new Score().start(winDate));
                            score.show();
                            primaryStage.setResizable(true);
                            add4.setDisable(false);
                        }
                    }
                }
            });
        }
        public void setBoxesCursor(int number){
            boxes[number].setCursor(Cursor.CLOSED_HAND);
        }
        private void reDraw(Map<Character , Shape> shapeMap, DrawFigure drawFigure, TypesOfStyle typesOfStyle){
            /** Przerysowanie planszy po zmianach stylu w czasie gry*/
            drawFigure.changeShape(shapeMap.get('1'));
            drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle),0,root,playerPiece);
            for (int i = 0 ; i<3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (playBoard[i][j] != ' ') {
                        drawFigure.changeShape(shapeMap.get(playBoard[i][j]));
                        drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), 3 * i + j, root, playerPiece);
                    }
                }
            }
        }
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Kolko i krzyzyk");
        primaryStage.setMinWidth(250);
        primaryStage.setMinHeight(280);
        Stage rulesStage = new Stage();
        rulesStage.initOwner(primaryStage);
        Stage howPlayWindow = new Stage();
        howPlayWindow.initOwner(primaryStage);
        Stage informationProgram = new Stage();
        informationProgram.initOwner(primaryStage);
        Rules windowRules = new Rules();
        HowPlay windowHowPlay = new HowPlay();
        Stage optionsStage = new Stage();
        optionsStage.initOwner(primaryStage);
        Stage playStyle = new Stage();
        InformationProgram windowInfoProgram = new InformationProgram();

        rulesStage.setTitle("Zasady gry w Kolko i krzyzyk");
        rulesStage.setScene(windowRules.start());
        howPlayWindow.setTitle("Jak grac w kolko i krzyzyk");
        howPlayWindow.setScene(windowHowPlay.start());
        informationProgram.setTitle("Informacje o programie");
        informationProgram.setScene(windowInfoProgram.start());
        optionsStage.setTitle("Opcje gry");
        Option gameOption = new Option();
        optionsStage.setScene(gameOption.option(optionsStage));
        Circle circle = new Circle(scene.getHeight(), scene.getWidth());
        Cross cross = new Cross(scene.getHeight(), scene.getWidth());
        Triangle triangle = new Triangle(scene.getHeight(), scene.getWidth());
        DrawFigure drawFigure = new DrawFigure(circle);
        Board board = new Board();
        MenuBar menuBar = new MenuBar();
        menuBar.setMinWidth(1000);
        Menu menuInfo = new Menu("Informacje");
        Menu menuPlay = new Menu("Gra");
        Menu menuStyle = new Menu("Styl");
        MenuItem add1 = new MenuItem("Zasady gry w kolko i krzyzyk");
        MenuItem add2 = new MenuItem("Jak grac w kolko i krzyzyk?");
        MenuItem add3 = new MenuItem("Informacje o programie");
        MenuItem add4 = new MenuItem("Nowa gra");
        MenuItem add5 = new MenuItem("Opcje gry");
        MenuItem add7 = new MenuItem("Wybor stylu");
        add1.setOnAction((ActionEvent t) -> {
            rulesStage.show();
        });
        add2.setOnAction((ActionEvent t) -> {
            howPlayWindow.show();
        });
        add3.setOnAction((ActionEvent t) -> {
            informationProgram.show();
        });
        add4.setOnAction((ActionEvent t) -> {                /**Start Gry W Kółko i krzyżyk */
            primaryStage.setResizable(false);
            for(int i = 0; i < 3 ; i++) {
                for(int j = 0 ; j < 3; j++) {
                    playBoard[i][j] = ' ';
                }
            }
            add5.setDisable(true);
            playerMovement = firstMove ? true : false ;
            board.drawBoard(scene.getHeight(), scene.getWidth() ,primaryStage , typesOfStyle, add5 );
            if (!playerMovement) {      /**Pierwszy ruch komputera - gdy gracz wybrał ruch komputera jako pierwszy */
                move = movement.getMove(playBoard, difficulty, playerPiece, computerPiece);
                playBoard[move.getX()][move.getY()] = computerPiece;
                board.setBoxesCursor(3*move.getX()+move.getY());
                if (computerPiece == 'o') {
                    drawFigure.changeShape(circle);
                }
                else if (computerPiece == 'x'){
                    drawFigure.changeShape(cross);
                }
                else if (computerPiece == 't'){
                    drawFigure.changeShape(triangle);
                }
                else if (computerPiece == 'r'){
                    drawFigure.changeShape(triangle);
                }
                drawFigure.drawShape(typesOfStyle.getStyle(numberOfStyle), (3*move.getX()+move.getY()), root, playerPiece);
                playerMovement = true;
                /**Dalsza część gry toczy się w klasie Board po akcji powrotu przycisku myszy -> ruch komputera */
            }
        });
        add5.setOnAction((ActionEvent t) -> {
            optionsStage.show();
        });
        add7.setOnAction((ActionEvent t) -> {
            PlayStyle windowStyle = new PlayStyle();
            windowStyle.start(playStyle);
        });
        menuBar.getMenus().addAll(menuInfo, menuPlay, menuStyle);
        menuInfo.getItems().addAll(add1, add2, add3);
        menuPlay.getItems().addAll(add4, add5);
        menuStyle.getItems().add(add7);
        BackgroundImage backgroundImage = new BackgroundImage(draw6,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        vBox.setBackground(background);
        vBox.getChildren().add(menuBar);
        vBox.getChildren().add(root);
        vBox.getChildren().add(hBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){

        launch();
    }
}
