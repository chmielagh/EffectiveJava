package Controller;

import Model.ColorPoint;
import Model.Point;

import java.awt.*;

/**
 * Created by kchmiel on 11.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        ColorPoint cp1 = new ColorPoint(1,2, Color.black);
        ColorPoint cp2 = new ColorPoint(1,2,Color.blue);
        System.out.println("cp1==cp2 " + cp1.equals(cp2));
        System.out.println("cp1==p1 " + cp1.equals(p1));
        System.out.println("cp2==p1 " + cp2.equals(p1));
    }
}
