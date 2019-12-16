import java.util.Scanner;

public class triv {
  public static void main(String[] args) {
    Scanner inputuser = new Scanner(System.in);
    int [] inpt = new int[2];
    for(int i = 0 ; i <= 1 ; i++){
      inpt[i] = inputuser.nextInt();
    }
    int hsl = (inpt[1]*2)-inpt[0];
    System.out.println(hsl);
  }   
}