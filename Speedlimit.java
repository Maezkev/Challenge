import java.util.Scanner;
import java.util.Arrays;

public class Speedlimit
{  
  public static void main(String args[])
  {  
    Scanner inputuser = new Scanner(System.in);
    int cases = inputuser.nextInt();
    do{
      int [] speed = new int [cases + 2];
      int [] time = new int [cases + 2];
      int distance = 0;
      time [0] = 0;

      for(int i = 1 ; i <= cases ; i++){
        speed[i] = inputuser.nextInt();
        time[i] = inputuser.nextInt();
        distance += speed[i] * (time[i] - time[i - 1]);
      }
      System.out.println(distance + " miles");
      cases = inputuser.nextInt();
    }while(cases != -1);
  }
}
