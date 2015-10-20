package connect4;
import java.awt.*;

public class Piece {
    private Color color;
    private int value;
    Piece(Color _color)
    {
        value = (int)(Math.random()*4+1);
        color = _color;
    }
    Color getColor()
    {
        return (color);
    }
    public int getValue()
    {
        return (value);
    }
    void setColor(Color _color)
    {
        color = _color;
    }    
}
