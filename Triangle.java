public class Triangle{
  public static void main(String[]args){
  }
private Point v1, v2, v3;
public Triangle (Point v1a, Point v2a, Point v3a){
  v1 = v1a;
  v2 = v2a;
  v3 = v3a;
}
public Triangle (double a, double a1, double b, double b1, double c, double c1){
  v1 = new Point (a, a1);
  v2 = new Point (b, b1);
  v3 = new Point (c, c1);
                 }
public double getPerimeter (){
double v1v2 = v1.distanceTo (v2);
double v2v3 = v2.distanceTo (v3);
double v1v3 = v1.distanceTo (v3);
return v1v2 + v2v3 + v1v3;
}

public Point getVertex (int index){
  if (index == 0){return v1;}
  if (index == 1){return v2;}
  if (index == 2){return v3;}
  return null;
}

public void setVertex(int index, Point newP){
  if (index == 0){v1 = newP;}
  if (index == 1){v2 = newP;}
  if (index == 2){v3 = newP;}
}

public String toString(){
  return "Triangle: " + "A (" + v1.toString() + ") , B (" + v2.toString() + ", C (" + v3.toString() + ")" ;
}
}
