import java.util.Scanner;
class E7{
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}