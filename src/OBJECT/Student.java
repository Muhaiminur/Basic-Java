package OBJECT;
/*Task One
Create a class called Student as described below:
� Fields: 
name, id, address, cgpa
� Methods: 
public String getName()
public void setName(String n)
public String getID()
public void setID(String i)
public String getAddress()
public void setAddress(String a)
public double getCGPA()
public void setCGPA(double c)
*/
public class Student{
  String name;
  String id;
  String address;
  double cgpa;
  public void setName(String n){
    name=n;
  }
  public String getName(){
    return name;
  }
  public void setId(String i){
    id=i;
  }
  public String getId(){
    return id;
  }
  public void setAddress(String a){
    address=a;
  }
  public String getAddress(){
    return address;
  }
  public void setCgpa(double c){
    cgpa=c;
  }
  public double getCgpa(){
    return cgpa;
  }
}