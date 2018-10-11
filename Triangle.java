public class Triangle{
  public static void main(String[]args){
  }
private Point p1, p2, p3;
public Triangle (Point v1, Point v2, Point v3);
public Triangle (double v1.getX(), double v1.getY(),
                 double v2.getX(), double v2.getY(),
                 double v3.getX(), double v3.getY());
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
