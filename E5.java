//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
import java.unil.Scanner;
public class E5{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for(int i=0; i<=n;i++){
            sum=n*i;
            
        }System.out.println(sum);
    }
}