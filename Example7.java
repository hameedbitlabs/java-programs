/*

5. WAP to read 3 numbers from user and find big numbers.*/
import java.util.Scanner;
public class Example7 {
    public static void main(String args[]){
        int num1=0,num2=0,num3=0;
        Scanner s = new Scanner(System.in);
        num1 =s.nextInt();
        num2 =s.nextInt();
        num3 =s.nextInt();
        if (num1>num2){
            System.out.println(num1);
        }else if(num1>num3){
            System.out.println( num2);
        }else if(num3>num2){
            System.out.println(num3);
        }
    }
}
