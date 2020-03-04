import java.util.Scanner;

public class Lastfactorialdigit {
  public static void main(String[] args) {
    Scanner inputuser = new Scanner(System.in);
    int much = inputuser.nextInt();
    int [] inpt = new int[much+1];
    int [] jwb = new int[much+1];
    for(int i = 1 ; i <= much ; i++){
      inpt[i] = inputuser.nextInt();
    }
    for(int j = 1 ; j <= much ; j++){
      jwb[j] = 1;
      for(int k = 1 ; k <= inpt[j] ; k++){
        jwb[j] *= k;
      }
      System.out.println(jwb[j] % 10); //last digit (% 10), first digit (/10)
    }
  }   
}