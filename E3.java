
/*1 point
WAP to print sum of even elements and sum of odd elements in the given array.*/
import java.util.Scanner;
class E3 {
    public static void main(String args[]){
        int arr[] ={1,3,2,5,6,8};
        int even=0;
        int odd=0;
        for(int i=0; i<arr.length;i++){
            if(i%2==0)
            odd=odd+arr[i];
            else
            even=even+arr[i];
        }
        System.out.println("sum of even = "+even);
        System.out.println("sum of odd = "+odd);
    }
}