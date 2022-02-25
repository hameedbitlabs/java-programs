/*Write a program to print numbers from 1 to 10.*/

import java.util.Scanner;
class Forloope1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
}