package basic.java;
import java.util.Scanner;
public class array{
  public static void main (String [] args){
    int [] y = new int [5];
    int x=0;
    Scanner key= new Scanner (System.in);
    while (x<5){
    y[x]= key.nextInt();
    x++;
    }
    x--;
    while (x>=0){
      System.out.println(y[x]);
      x--;
    }
  }
}