package Model;

/**
 * Created by kchmiel on 11.04.2017.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point)) return false;
        return ((Point) o).x==this.x && ((Point) o).y==y;
    }

}
