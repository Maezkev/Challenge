import java.util.Scanner;
import java.util.Arrays;

class Licensetolaunch
{  
  public static void main(String args[])
  {  
    Scanner inputuser = new Scanner(System.in);
    int cases = inputuser.nextInt();
    int days [] = new int [cases + 1];
    
    for(int i = 0 ; i < cases ; i++){
      days [i] = inputuser.nextInt();
    }
    
    int least = days[0];
    int jumday = 0;
    
    for(int i = 0 ; i < cases ; i++){
      if(days[i] < least){
        least = days[i];
      }
    }
    for(int i = 0 ; i < cases ; i++){
      if(days[i] == least){
        break;
      }else{
        jumday++;
      }
    }
    System.out.println(jumday);
  }
}
