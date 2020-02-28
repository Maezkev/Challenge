import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class Batterup{  
  public static void main(String args[]){  
    Scanner inputuser = new Scanner(System.in);
    int cases = inputuser.nextInt();
    int [] pukulan = new int [cases + 1];
    int score = 0;
    int hitungan = 0;
    
    for(int i = 0 ; i < cases ; i++){
      pukulan[i] = inputuser.nextInt();
    }
    
    for(int i = 0 ; i < cases ; i++){
      if(pukulan[i] == -1){
        score += 0;
        hitungan += 0;
      }else if(pukulan[i] == 0){
        score += 0;
        hitungan += 1;
      }else if(pukulan[i] == 1){
        score += 1;
        hitungan += 1;
      }else if(pukulan[i] == 2){
        score += 2;
        hitungan += 1;
      }else if(pukulan[i] == 3){
        score += 3;
        hitungan += 1;
      }else if(pukulan[i] == 4){
        score += 4;
        hitungan += 1;
      }
    }
    System.out.println((double)score/hitungan);
  }
}
