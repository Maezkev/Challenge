import java.util.Scanner;

public class Stuckinatimeloop{
  public static void main(String args[]){
    Scanner inputuser = new Scanner(System.in);
    int jml = inputuser.nextInt();
    for(int i = 1 ; i <= jml ; i-=-1){
      System.out.println(i + " Abracadabra");
    }
  }
}