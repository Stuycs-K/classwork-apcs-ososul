public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt((a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY())*(a.getY() - b.getY()));
  }

  public static void main(String[]args){
    Point p1 = new Point(1, 1);
        Point p2 = new Point(-1, -1);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(0, 0);

        System.out.println(Point.distance(p1, p2));
        System.out.println(p1.distanceTo(p2));
        System.out.println(Point.distance(p3, p4));
        System.out.println(p1.distanceTo(p1));

        // Equilateral Triangle
        Point pA = new Point(0, 0);
        Point pB = new Point(1, 0);
        Point pC = new Point(0.5, Math.sqrt(3) / 2);

        System.out.println(Point.distance(pA, pB));
        System.out.println(Point.distance(pB, pC));
        System.out.println(Point.distance(pC, pA));
  }
}