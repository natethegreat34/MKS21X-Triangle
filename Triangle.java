public class Triangle{
  public static void main(String[]args){
  }
private Point p1, p2, p3;
public Triangle (Point v1, Point v2, Point v3){
  p1 = new Point (v1.getX(),v1.getY());
  p2 = new Point (v2.getX(),v3.getY());
  p3 = new Point (v2.getX(),v3.getY());
}
public Triangle (double a, double a1, double b, double b1, double c, double c1){
  p1 = new Point (a, a1);
  p2 = new Point (b, b1);
  p3 = new Point (c, c1);
                 }
public getPerimeter (){
  return distance (p1, p2) + distance (p1, p3) + distance (p2, p3);
}

public getVertex (int index){
  if (index == 1){return p1};
  if (index == 2){return p2};
  if (index == 3){return p3};
}

public setVertex(int index, Point newP){
  if (index == 1){p1 = newP};
  if (index == 2){p2 = newP};
  if (index == 3){p3 = newP};
}

public toString(){
  return "Triangle: " + "A (" + p1.getX() + "," + p1.getY() + ")" +
                        "B (" + p2.getX() + "," + p2.getY() + ")" +
                        "C (" + p3.getX() + "," + p3.getY() + ")" ;
}
}
