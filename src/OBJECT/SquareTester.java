package OBJECT;
/*Hint: If I take your class and use it following would be the code and the output.
Code Output
double h, w, a;
Square s1 = new Square();
s1.setHeight(3);
s1.setWidth(4);
h = s1.getHeight();
w = s1.getWidth();
a = s1.getArea();
System.out.println(�Height = �+ h); 
System.out.println(�Width = �+ w);
System.out.println(�Area = �+ a); Height = 3.0
Width = 4.0
Area = 12.0 
*/
public class SquareTester{
  public static void main(String[]args){
    double h, w, a;
    Square s1 = new Square();
    s1.setHeight(3);
    s1.setWidth(4);
    h = s1.getHeight();
    w = s1.getWidth();
    a = s1.getArea();
    System.out.println("Height = "+ h); 
    System.out.println("Width = "+ w);
    System.out.println("Area = "+ a);
  }
}