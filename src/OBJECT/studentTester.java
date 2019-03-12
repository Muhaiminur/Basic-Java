package OBJECT;
/*Task One
 * Write a class called StudentTester to write a main() method:
� public static void main(String[] args){

}
� Inside the main() method 
o Create 3 objects/instances of Student called john, mike and carol
o Set their fields to some value using the public methods.
o Print the information of each Student using System.out.println()
*/
import java.util.Scanner;
public class studentTester{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    Student john=new Student();
    Student mike=new Student();
    Student carol=new Student();
    john.setName("abir");
    john.setId("12301019");
    john.setCgpa(2.960);
    mike.setName("ratul");
    mike.setId("14");
    mike.setCgpa(5.0);
    carol.setName("Carol");
    carol.setId("115");
    carol.setCgpa(3.90);
    System.out.println(john.getName());
    System.out.println(john.getId());
    System.out.println(john.getCgpa());
    System.out.println(mike.getName());
    System.out.println(mike.getId());
    System.out.println(mike.getCgpa());
    System.out.println(carol.getName());
    System.out.println(carol.getId());
    System.out.println(carol.getCgpa());
  }
}