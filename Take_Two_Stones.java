import java.util.Scanner;

public class Take_Two_Stones{
  public static void main(String args[]){
    Scanner inputuser = new Scanner(System.in);
    int jml = inputuser.nextInt();
    if(jml % 2 == 1){
     System.out.println("Alice"); 
    }else{
      System.out.println("Bob");
    }
  }
}