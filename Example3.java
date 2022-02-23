// WAP to accept project marks, internal marks, external marks. find total marks.

// totalmarks:
// 1. 70% on project
// 2. 20% on external
// 3. 10% on internal
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args){
         int pm=0,em=0,im=0,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter project marks");
        pm =s.nextInt();
        int pmp= (pm*70)/100;
        System.out.println("enter external marks");
        em =s.nextInt();
        int emp= (em*20)/100;
        System.out.println("enter internal marks");
        im =s.nextInt();
        int imp= (im*10)/100;
        sum= pmp+emp+imp;
        System.out.println("total marks  " +sum);

    }
}
