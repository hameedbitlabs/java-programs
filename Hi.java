import java.util.Scanner;
public class Hi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        int i=0;
           while(i<=num)
        {
            if(i%2==0)
            System.out.println("even numbers are"+i);
            else
            System.out.println("odd numbers are"+i);
            i++;
        }
    }
}