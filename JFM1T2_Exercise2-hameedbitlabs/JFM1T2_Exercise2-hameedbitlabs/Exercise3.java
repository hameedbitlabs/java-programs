// Write a program to initialize your marks for 3 subjects and print the highest marks
import java.util.Scanner;
class Exercise3 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int sub1=s.nextInt();
        int sub2=s.nextInt();
        int sub3=s.nextInt();
        if (sub1>sub2){
            System.out.println(sub1);
        }else if (sub2>sub3){
            System.out.println(sub2);
        }else{
            System.out.println(sub3);
        }
    }




}