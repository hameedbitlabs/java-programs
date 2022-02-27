//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int radius=s.nextInt();
    double c=0;
    c=Math.PI*2*radius;
    System.out.println(c);
  }
}




