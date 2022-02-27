import java.util.Scanner;
class E2{
    public static void main(String args[]){
        int temp=0,sum=0,rem=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int num=s.nextInt();
        temp=num;
        while(num>0){
            rem=num%10;
            int fact=1;
            for(int i=rem;i<rem;i++){
                fact=fact*i;
            }
            num=num/10;
            sum=sum+fact;
        }
        System.out.println(sum);
        System.out.println(num);
        if(num==sum){
            System.out.println("strong number");
        }else{
            System.out.println("not strong number");
        }
    }    
}