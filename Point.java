public class Point{
  public static void main(String[]args){
  }
  private double x,y;
  public Point(double X, double Y){
  x = X;
  y = Y;
}

public Point(Point p){
  x = p.x;
  y = p.y;
}
public double getX(){
  return x;
}

public double getY(){
  return y;
}

public double distanceTo(Point p){
return Math.pow (Math.pow((this.getX() - p.getX()), 2) + Math.pow((this.getY() - p.getY()), 2), 1/2);

}


public static double distance(Point a, Point b){
return Math.pow (Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2), 1/2);
}

public String toString() {
  return "Horizontal" + x + "" + "Vertical" + y ;
}
}
