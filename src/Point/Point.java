package Point;



/*

maak een immutable class Point aan dat een punt in een vliegtuig aanduidt.
maak een constructor aan om het tot een specifiek punt te zetten,
 een lege constructor om het tot een leeg punt te zetten,
 en de methoden getX, getY, translate en scale.
 de translate methode beweegt het punt door een gegeven hoeveelheid in de x- en y- richting.
 de scale methode scaled beide coordinaten aan de hand van een gegeven factor.
 implementeer deze methoden zodat ze de nieuwe punten weergeven met de resultaten.

          bv:
        Point p = new Point(3,4).translate(1,3).scale(0.5);
        p zou nu de coordinaten (2,3.5) hebben.

 */
public class Point {
    public int point, x, y;
    public static double scale;

    public void setPoint(int x, int y) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public int translate(int pointX, int pointY) {
        setPoint(x, y) = new Point(x+pointX, y+pointY);

    }

    public double scale(double s) {
        scale = new Point(x*s, y*s);
        return scale;

    }

    public static void main (String[]args) {
        int point = getPoint(3, 4);
        Point p = new Point(3, 4);
        p.translate(1, 3);
        p.scale(0.5);
    }
}
