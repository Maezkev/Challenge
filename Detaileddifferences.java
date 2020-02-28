import java.util.Scanner;
import java.util.Arrays;

public class Detaileddifferences{  
  public static void main(String args[]){  
    Scanner inputuser = new Scanner(System.in);
    int cases = inputuser.nextInt();
    String [] kesatu = new String [cases + 1];
    String [] kedua = new String [cases + 1];
    
    for(int i = 0 ; i < cases ; i++){
      kesatu[i] = inputuser.next();
      kedua[i] = inputuser.next();
    }
    
    for(int c = 0 ; c < cases ; c++){
      System.out.println(kesatu[c]);
      System.out.println(kedua[c]);
      for(int i = 0 ; i < kesatu[c].length() ; i++){
        if(kesatu[c].charAt(i) == kedua[c].charAt(i)){
          System.out.print(".");
        }else{
          System.out.print("*");
        }
      }
      System.out.println("\n");
    }
  }
}
