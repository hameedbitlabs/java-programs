import java.util.Scanner;
class MobileNumber{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String input=s.next();
    String lastfivedigits;
    if (input.length()>4){
      lastfivedigits=input.substring(5,10);
    }else{
      lastfivedigits=input;
    }
    System.out.println("*****"+lastfivedigits);
  }
}
