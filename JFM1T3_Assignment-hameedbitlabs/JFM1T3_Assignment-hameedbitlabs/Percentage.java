//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Percentage {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("enter maximum marks :-");
    double max=s.nextDouble();
    System.out.print("enter obtained marks :-");
    int total=s.nextInt();
    double per=(total/max)*100;
    System.out.println(Math.round(per)+"%");
  }
}