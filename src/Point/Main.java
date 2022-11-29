package Point;

public class Main {
    public static void main(String[]args) {
        Point p = new Point(3,4);
        p.Translate(1,3);
        p.Scale(0.5);
        System.out.println(p.getPoint());
    }
}
