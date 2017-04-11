package Model;

import java.awt.*;

/**
 * Created by kchmiel on 11.04.2017.
 */
public class ColorPoint extends Point {

    private Color color;

    public ColorPoint(int x, int y) {
        super(x, y);
    }

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point)) return false;
        if(!(o instanceof ColorPoint)) return o.equals(this);
        return ((ColorPoint) o).color == this.color && o.equals(this);
    }
}
