/* 1. WAP to read basic salary and find gross salary.
gs= hra+da+bs;
hra is 56% on basic
da is 90% on basic*/
import java.util.Scanner;
 class Example {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bs");1000
        int bs=sc.nextInt();
        int hra=((bs/100)*56);
        int da=((bs/100)*90);
        int sum=(hra+da+bs);
        System.out.println("gs=" +sum);

        
    }
    
}
