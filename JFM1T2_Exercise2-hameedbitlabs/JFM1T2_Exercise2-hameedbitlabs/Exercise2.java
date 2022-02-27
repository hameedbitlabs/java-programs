// Write a program to solve the expression w=(x*y)/z with any input values for x,y and z

import java.util.Scanner;
class Exercise2 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float x=s.nextFloat();
        float y=s.nextFloat();
        float z=s.nextFloat();
        float w=0f;
        w=(x*y)/z;
        System.out.println(w);
    }




}