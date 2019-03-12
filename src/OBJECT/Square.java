package OBJECT;
/*Task Two

Create a class called Square as described below:

� Fields: 
height, width
� Methods: 
public double getHeight()
public void setHeight(double h)
public double getWidth ()
public void setWidth (double w)
public double getArea ()
*/
public class Square{
  double height;
  double width;
  public void setHeight(double h){
    height=h;
  }
  public double getHeight(){
    return height;
  }
  public void setWidth(double w){
    width=w;
  }
  public double getWidth(){
    return width;
  }
  public double getArea(){
    return getHeight()*getWidth();
  }
  public void saying(){
    System.out.println("HEIGHT="+getHeight());
    System.out.println("WIDTH="+getWidth());
    System.out.println("area="+getArea());
  }
}