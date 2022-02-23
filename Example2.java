/*2. WAP read employee salary and 3 shopping bills.and find total shopping amount, and find how much % of amount he/she spent on shopping on his/her salary.




Salary: 200000
s1 : 23000
s2 : 7000
s3 : 20000*/
import java.util.Scanner;
 class Example2 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int salary =s.nextInt();
        int s1=s.nextInt();
        int s2=s.nextInt();
        int s3=s.nextInt();
        int sum=s1+s2+s3;
        int per=((sum*100)/salary);
        System.out.println(per);
    }
}
