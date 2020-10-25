package kolkoIKrzyzyk.mechanika;

import javafx.scene.paint.Color;

public class Style {
    private Color line = Color.BLACK;
    private Color background = Color.WHEAT;
    private Color winLine = Color.RED;
    private Color FirstPieceStroke = Color.BLACK;
    private Color SecondPieceStroke = Color.BLACK;

    private String nameOfStyle = "Podstawowy";

    public String getNameOfStyle() {
        return nameOfStyle;
    }

    public void setNameOfStyle(String nameOfStyle) {
        this.nameOfStyle = nameOfStyle;
    }

    public Color getLine() {
        return line;
    }

    public void setLine(Color line) {
        this.line = line;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public Color getWinLine() {
        return winLine;
    }

    public void setWinLine(Color winLine) {
        this.winLine = winLine;
    }

    public Color getSecondPieceStroke() {
        return SecondPieceStroke;
    }

    public void setSecondPieceStroke(Color SecondPieceStroke) {
        this.SecondPieceStroke = SecondPieceStroke;
    }

    public Color getFirstPieceStroke() {
        return FirstPieceStroke;
    }

    public void setFirstPieceStroke(Color FirstPieceStroke) {
        this.FirstPieceStroke = FirstPieceStroke;
    }
}
