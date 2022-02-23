/*WAP to read project score, internal score, external score from student.
==> check student got pass in 3 subjects (Project+external+internal) : pass marks=50
==> if student got pass in 3 subjects then find total score
total = 70% on project +20% on external +10 % on internal
==> Print grade based on total score
90+ A grade
75--90 B
50-75 C

==> if student got failed in subjects, print failed subject subname along with score.*/
import java.util.Scanner;
class E1{
    public static void main(String args[]){
        int a=0,b=0,c=0;
        Scanner s= new Scanner(System.in);
        System.out.print("enter your project marks");
        int project =s.nextInt();
        System.out.print("enter your internal marks");
        int internal =s.nextInt();
        System.out.print("enter your external marks");
        int external =s.nextInt();
        if(project>=50 && external>=50 && internal>=50){
            a=project*70/100;
            b=external*20/100;
            c=internal*10/100;
            int total=a+b+c;
            System.out.println("your total marks = "+total);
            if (total>=90 && total<=100){
                System.out.println("you got A grade");
            }
            if (total>=75 && total<=90){
                System.out.println("you got B grade");
            }
            if (total>=50 && total<=75){
                System.out.println("you got C grade");
            }
            
            
            
            
            
            if (project<50 || )
            
            
            
        }else{
            System.out.println("failed");
        }
    }
}
