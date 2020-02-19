import java.util.Scanner;
import java.util.Arrays;

public class Abc{
  static int numb[] = new int[5];
  static String s_huruf[] = new String[5];
  static char c_huruf[] = new char[5];
  public static void main(String[]args){
    Scanner inputuser = new Scanner(System.in);
    
    numb[1] = inputuser.nextInt();
    numb[2] = inputuser.nextInt();
    numb[3] = inputuser.nextInt();
    
    String kalimat = inputuser.next();
    
    c_huruf[1] = kalimat.charAt(0);
    c_huruf[2] = kalimat.charAt(1);
    c_huruf[3] = kalimat.charAt(2);
    
    swapnumb();
    swapnumb();
    kaltochar();
    
    for(int i = 1 ; i <= 3 ; i++){
      switch(s_huruf[i].toUpperCase()){
        case "A" :
          System.out.print(numb[1] + " ");
          break;
        case "B" :
          System.out.print(numb[2] + " ");
          break;
        case "C" :
          System.out.print(numb[3] + " ");
          break;
      }
    }
  }
  
  public static void swapnumb(){
    for(int i = 1 ; i <= 2 ; i++){
      if(numb[i] > numb[i+1]){
          numb[i] ^= numb[i+1];
          numb[i+1] ^= numb[i];
          numb[i] ^= numb[i+1];
      }
    }
  }
  
  public static void kaltochar(){
    for(int i = 0 ; i < 3 ; i++){
      s_huruf[i+1] = String.valueOf(c_huruf[i+1]);
    }
  }
}