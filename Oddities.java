import java.util.Scanner;

public class triv {
  public static void main(String[] args) {
    Scanner inputuser = new Scanner(System.in);
    int much = inputuser.nextInt();
    int [] inpt = new int[much];
    for(int i = 0 ; i <= much-1 ; i++){
      inpt[i] = inputuser.nextInt();
    }
    for(int j = 0 ; j <= much-1 ; j++){
      if(inpt[j] % 2 == 0){
        System.out.println(inpt[j] + " Is even");
      }else{
        System.out.println(inpt[j] + " Is odd");
      }
    }
  }   
}