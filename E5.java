import java.util.Scanner;
class E5{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int mul=0;
        for(int i=0;i<11;i++){
            mul=n*i;
            System.out.println(n+"*"+i+"="+mul);
        }
    }
}