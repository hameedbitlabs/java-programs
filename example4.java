import java.util.Scanner;
public class example4 {
    public static void main(String[] args){
        double units=0,bill=0,total=0,gst=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter units    =20
        ");
        units=sc.nextInt();
        bill=units*34.50;
        System.out.println("bill before gst="+bill);
        gst=(bill*18)/100;
        System.out.println("gst amount=     "+gst);
        total=gst+bill;
        System.out.println("total bill=     "+total);
    }
    
}
