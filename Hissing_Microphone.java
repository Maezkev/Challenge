import java.util.Scanner;

public class triv {
  public static void main(String[] args) {
    Scanner inputuser = new Scanner(System.in);
    
    String tulisan = inputuser.next();
    int pjg = tulisan.length();
    System.out.print(tulisan.contains("ss") ? "hiss" : "no hiss");
  }   
}
