/*WAP to read units from user and generate bill.

 first 50 units the charges are: 0.50 p/u
next 100 units the charges are: 0.75 p/u
next 100 units the charges are: 1.25 p/u
above 250 units the charges are: 2.25 p/u

 add 18% Gst on bill.

50 50*0.50 ==> 25
51 (50*0.50) + (1*0.75)
80 50*0.50 + 30*0.75

 180 50*0.50+ (100*0.75)+30*1.25*/
 import java.util.Scanner;
 class E2{
     public static void main(String args[]){
         Scanner s= new Scanner(System.in);
         System.out.print("enter units :        ");
         int units = s.nextInt();
         double bill=0,gst=0;
         if (units<=50){
             bill=(units*0.50);
             System.out.println("Bill befor gst :     "+bill);
         } else if(units<=150){
             bill=(50*0.50)+(units-50)*0.75;
             System.out.println("Bill befor gst :     "+bill);
         }else if(units<250){
             bill=(50*0.50)+(100*0.75)+(units-150)*1.25;
             System.out.println("Bill befor gst :     "+bill);
         }else if(units>=250){
             bill=(50*0.50)+(100*0.75)+(100*1.25)+(units-250)*2.25;
             System.out.println("Bill befor gst :     "+bill);
         }
         gst=(bill*18)/100;
         System.out.println("gst amount :         "+gst);
         bill=bill+gst;
         System.out.println("your total bill :    "+bill);
     }
 }
 