import java.util.*;

public class Quickbrownfox{  
  static Scanner inputuser = new Scanner(System.in);
  public static void main(String args[]){  
    int jmlcases = inputuser.nextInt();
    for(int q = 0 ; q < jmlcases ; q++){
      go();
    }
  }
  
  public static void go(){
    String kalimatori = inputuser.nextLine();
    String kalimatlow = kalimatori.toLowerCase();
    char kc = kalimatlow.charAt(0);
    char [] kalchar = kalimatlow.toCharArray();

    char [] cha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    Character [] obj = {cha[0], cha[1], cha[2], cha[3], cha[4], cha[5], cha[6], cha[7], cha[8], cha[9], cha[10], cha[11], cha[12], cha[13], cha[14], cha[15], cha[16], cha[17], cha[18], cha[19], cha[20], cha[21], cha[22], cha[23], cha[24], cha[25]};

    boolean [] misschar = new boolean [26];
    boolean adamiss = false;

    for(int o = 0 ; o < 26 ; o++){
      for(int i = 0 ; i < kalchar.length ; i++){
        if(kalchar[i] != obj[o]){
          misschar[o] = true;
        }else{
          misschar[o] = false;
          break;
        }
      }
    }

    for(int i = 0 ; i < 26 ; i++){
      if(misschar[i]){
        adamiss = true;
        break;
      }
    }

    if(adamiss){
      System.out.print("missing ");
      for(int i = 0 ; i < 26 ; i++){
        if(misschar[i]){
          System.out.print(obj[i]);
        }
      }
    }else{
      System.out.println("pangram");
    }
  }
}
