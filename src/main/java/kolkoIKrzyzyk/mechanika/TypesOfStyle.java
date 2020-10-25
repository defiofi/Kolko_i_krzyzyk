package kolkoIKrzyzyk.mechanika;

import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;

public class TypesOfStyle {
    /** Klasa odpowiada za zdefiniowane typy stylów w jakich wyświetlana jest plansza i figury*/
    List<Style> arrayStyle = new ArrayList<>();
    public TypesOfStyle(){
        Style style1 = new Style();
        style1.setBackground(Color.WHITE);
        style1.setLine(Color.BLACK);
        style1.setWinLine(Color.RED);
        style1.setSecondPieceStroke(Color.BLACK);
        style1.setFirstPieceStroke(Color.BLACK);
        style1.setNameOfStyle("Podstawowy");
        arrayStyle.add(style1);

        Style style2 = new Style();
        style2.setBackground(Color.WHITE);
        style2.setLine(Color.BLACK);
        style2.setWinLine(Color.RED);
        style2.setSecondPieceStroke(Color.GREEN);
        style2.setFirstPieceStroke(Color.GREEN);
        style2.setNameOfStyle("Podstawowy z zielonymi figurami");
        arrayStyle.add(style2);

        Style style3 = new Style();
        style3.setBackground(Color.WHITE);
        style3.setLine(Color.BLACK);
        style3.setWinLine(Color.GREEN);
        style3.setSecondPieceStroke(Color.RED);
        style3.setFirstPieceStroke(Color.RED);
        style3.setNameOfStyle("Podstawowy z czerwonymi figurami");
        arrayStyle.add(style3);

        Style style4 = new Style();
        style4.setBackground(Color.WHITE);
        style4.setLine(Color.BLACK);
        style4.setWinLine(Color.GREEN);
        style4.setSecondPieceStroke(Color.GREEN);
        style4.setFirstPieceStroke(Color.RED);
        style4.setNameOfStyle("Podstawowy z zielono - czerwonymi figurami");
        arrayStyle.add(style4);

        Style style5 = new Style();
        style5.setBackground(Color.WHITE);
        style5.setLine(Color.BLACK);
        style5.setWinLine(Color.DARKBLUE);
        style5.setSecondPieceStroke(Color.RED);
        style5.setFirstPieceStroke(Color.GREEN);
        style5.setNameOfStyle("Podstawowy z czerwono - zielonymi figurami");
        arrayStyle.add(style5);

        Style style6 = new Style();
        style6.setBackground(Color.BLACK);
        style6.setLine(Color.WHITE);
        style6.setWinLine(Color.RED);
        style6.setSecondPieceStroke(Color.WHITE);
        style6.setFirstPieceStroke(Color.WHITE);
        style6.setNameOfStyle("Negatyw");
        arrayStyle.add(style6);

        Style style7 = new Style();
        style7.setBackground(Color.BLACK);
        style7.setLine(Color.WHITE);
        style7.setWinLine(Color.RED);
        style7.setSecondPieceStroke(Color.YELLOW);
        style7.setFirstPieceStroke(Color.YELLOW);
        style7.setNameOfStyle("Negatyw i zolte figury");
        arrayStyle.add(style7);

        Style style8 = new Style();
        style8.setBackground(Color.BLACK);
        style8.setLine(Color.WHITE);
        style8.setWinLine(Color.YELLOW);
        style8.setSecondPieceStroke(Color.RED);
        style8.setFirstPieceStroke(Color.RED);
        style8.setNameOfStyle("Negatyw i czerwone figury");
        arrayStyle.add(style8);

        Style style9 = new Style();
        style9.setBackground(Color.BLACK);
        style9.setLine(Color.WHITE);
        style9.setWinLine(Color.RED);
        style9.setSecondPieceStroke(Color.GREEN);
        style9.setFirstPieceStroke(Color.GREEN);
        style9.setNameOfStyle("Negatyw i zielone figury");
        arrayStyle.add(style9);

        Style style10 = new Style();
        style10.setBackground(Color.BLACK);
        style10.setLine(Color.WHITE);
        style10.setWinLine(Color.GREEN);
        style10.setSecondPieceStroke(Color.YELLOW);
        style10.setFirstPieceStroke(Color.RED);
        style10.setNameOfStyle("Negatyw i zolto - czerone figury");
        arrayStyle.add(style10);

        Style style11 = new Style();
        style11.setBackground(Color.BLACK);
        style11.setLine(Color.WHITE);
        style11.setWinLine(Color.GREEN);
        style11.setSecondPieceStroke(Color.RED);
        style11.setFirstPieceStroke(Color.YELLOW);
        style11.setNameOfStyle("Negatyw i czerwono - zolte figury");
        arrayStyle.add(style11);

        Style style12 = new Style();
        style12.setBackground(Color.BLACK);
        style12.setLine(Color.WHITE);
        style12.setWinLine(Color.WHITE);
        style12.setSecondPieceStroke(Color.YELLOW);
        style12.setFirstPieceStroke(Color.GREEN);
        style12.setNameOfStyle("Negatyw i zolto - zielone figury");
        arrayStyle.add(style12);

        Style style13 = new Style();
        style13.setBackground(Color.BLACK);
        style13.setLine(Color.WHITE);
        style13.setWinLine(Color.WHITE);
        style13.setSecondPieceStroke(Color.GREEN);
        style13.setFirstPieceStroke(Color.YELLOW);
        style13.setNameOfStyle("Negatyw i zielono - zolte figury");
        arrayStyle.add(style13);

        Style style14 = new Style();
        style14.setBackground(Color.BLACK);
        style14.setLine(Color.WHITE);
        style14.setWinLine(Color.YELLOW);
        style14.setSecondPieceStroke(Color.GREEN);
        style14.setFirstPieceStroke(Color.RED);
        style14.setNameOfStyle("Negatyw i zielono - czerwone figury");
        arrayStyle.add(style14);

        Style style15 = new Style();
        style15.setBackground(Color.BLACK);
        style15.setLine(Color.WHITE);
        style15.setWinLine(Color.YELLOW);
        style15.setSecondPieceStroke(Color.RED);
        style15.setFirstPieceStroke(Color.GREEN);
        style15.setNameOfStyle("Negatyw i czerwono - zielone figury");
        arrayStyle.add(style15);

        Style style16 = new Style();
        style16.setBackground(Color.rgb(0,50,0));
        style16.setLine(Color.WHITE);
        style16.setWinLine(Color.RED);
        style16.setSecondPieceStroke(Color.WHITE);
        style16.setFirstPieceStroke(Color.WHITE);
        style16.setNameOfStyle("Szkolna tablica");
        arrayStyle.add(style16);

        Style style17 = new Style();
        style17.setBackground(Color.rgb(0,50,0));
        style17.setLine(Color.WHITE);
        style17.setWinLine(Color.RED);
        style17.setSecondPieceStroke(Color.YELLOW);
        style17.setFirstPieceStroke(Color.YELLOW);
        style17.setNameOfStyle("Szkolna tablica i zolte figury");
        arrayStyle.add(style17);

        Style style18 = new Style();
        style18.setBackground(Color.rgb(0,50,0));
        style18.setLine(Color.WHITE);
        style18.setWinLine(Color.YELLOW);
        style18.setSecondPieceStroke(Color.RED);
        style18.setFirstPieceStroke(Color.RED);
        style18.setNameOfStyle("Szkolna tablica i czerwone figury");
        arrayStyle.add(style18);

        Style style19 = new Style();
        style19.setBackground(Color.rgb(0,50,0));
        style19.setLine(Color.WHITE);
        style19.setWinLine(Color.RED);
        style19.setSecondPieceStroke(Color.BLUE);
        style19.setFirstPieceStroke(Color.BLUE);
        style19.setNameOfStyle("Szkolna tablica i niebieskie figury");
        arrayStyle.add(style19);

        Style style20 = new Style();
        style20.setBackground(Color.rgb(0,50,0));
        style20.setLine(Color.WHITE);
        style20.setWinLine(Color.WHITE);
        style20.setSecondPieceStroke(Color.YELLOW);
        style20.setFirstPieceStroke(Color.RED);
        style20.setNameOfStyle("Szkolna tablica i zolto - czerone figury");
        arrayStyle.add(style20);

        Style style21 = new Style();
        style21.setBackground(Color.rgb(0,50,0));
        style21.setLine(Color.WHITE);
        style21.setWinLine(Color.WHITE);
        style21.setSecondPieceStroke(Color.RED);
        style21.setFirstPieceStroke(Color.YELLOW);
        style21.setNameOfStyle("Szkolna tablica i czerwono - zolte figury");
        arrayStyle.add(style21);

        Style style22 = new Style();
        style22.setBackground(Color.rgb(0,50,0));
        style22.setLine(Color.WHITE);
        style22.setWinLine(Color.RED);
        style22.setSecondPieceStroke(Color.BLUE);
        style22.setFirstPieceStroke(Color.YELLOW);
        style22.setNameOfStyle("Szkolna tablica i niebiesko - zolte figury");
        arrayStyle.add(style22);

        Style style23 = new Style();
        style23.setBackground(Color.rgb(0,50,0));
        style23.setLine(Color.WHITE);
        style23.setWinLine(Color.RED);
        style23.setSecondPieceStroke(Color.YELLOW);
        style23.setFirstPieceStroke(Color.BLUE);
        style23.setNameOfStyle("Szkolna tablica i zolto - niebieskie figury");
        arrayStyle.add(style23);

        Style style24 = new Style();
        style24.setBackground(Color.rgb(0,50,0));
        style24.setLine(Color.WHITE);
        style24.setWinLine(Color.YELLOW);
        style24.setSecondPieceStroke(Color.BLUE);
        style24.setFirstPieceStroke(Color.RED);
        style24.setNameOfStyle("Szkolna tablica i niebiesko - czerwone figury");
        arrayStyle.add(style24);

        Style style25 = new Style();
        style25.setBackground(Color.rgb(0,50,0));
        style25.setLine(Color.WHITE);
        style25.setWinLine(Color.YELLOW);
        style25.setSecondPieceStroke(Color.RED);
        style25.setFirstPieceStroke(Color.BLUE);
        style25.setNameOfStyle("Szkolna tablica i czerono - niebieskie figury");
        arrayStyle.add(style25);

    }
    public Style getStyle(int x) {

        if (x<arrayStyle.size()) {return arrayStyle.get(x);}
        else {return arrayStyle.get(0);}
    }
    public int getSize(){return arrayStyle.size();}
}
