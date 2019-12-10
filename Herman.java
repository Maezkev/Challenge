import java.util.Scanner;

public class Herman{
  public static void main(String args[]){
    Scanner inputuser = new Scanner(System.in);
    double rad = inputuser.nextDouble();
    System.out.println(Math.PI * rad * rad);
    System.out.println(2 * rad * rad);
  }
}