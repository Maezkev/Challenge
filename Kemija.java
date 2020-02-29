import java.util.*;

class Kemija
{  
  public static void main(String args[])
  {  
    Scanner inputuser = new Scanner(System.in);
    
    String kalimatenkripsi = inputuser.nextLine();
    
    char kalchar = kalimatenkripsi.charAt(0);
    char [] kalimatchar = kalimatenkripsi.toCharArray();
    
    char cha = 'a';
    char chi = 'i';
    char chu = 'u';
    char che = 'e';
    char cho = 'o';
    Character objA = new Character(cha);
    Character objI = new Character(chi);
    Character objU = new Character(chu);
    Character objE = new Character(che);
    Character objO = new Character(cho);
    
    for(int i = 0 ; i < kalimatenkripsi.length() ; i++){
      if(kalimatchar[i] == objA){
        i += 2;
        System.out.print(kalimatchar[i]);
      }else if(kalimatchar[i] == objI){
        i += 2;
        System.out.print(kalimatchar[i]);
      }else if(kalimatchar[i] == objU){
        i += 2;
        System.out.print(kalimatchar[i]);
      }else if(kalimatchar[i] == objE){
        i += 2;
        System.out.print(kalimatchar[i]);
      }else if(kalimatchar[i] == objO){
        i += 2;
        System.out.print(kalimatchar[i]);
      }else{
        System.out.print(kalimatchar[i]);
      }
    }
  }
}
