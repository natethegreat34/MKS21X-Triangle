public class Driver{
  public static void main(String[]args){

    Point p1 = new Point (0,0);
    Point p2 = new Point (10,0);
    Point p3 = new Point (0,10);

    Triangle Illum = new Triangle (p1, p2, p3);

    System.out.println (Illum.toString());
    System.out.println (Illum.getPerimeter ());
    System.out.println (Illum.getVertex (1));
    System.out.println (Illum.getVertex (2));
    System.out.println (Illum.getVertex (3));
  }
}
