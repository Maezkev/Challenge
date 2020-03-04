import java.util.Scanner;

public class Quadrantselection{
  public static void main(String args[]){
    Scanner inputuser = new Scanner(System.in);
    int bila = inputuser.nextInt();
    int bilb = inputuser.nextInt();
    if(bila > 0 && bilb > 0){
      System.out.println("1");
    }else if(bila < 0 && bilb > 0){
      System.out.println("2");    
    }else if(bila < 0 && bilb < 0){
      System.out.println("3");
    }else{
      System.out.println("4");
    }
  }
}