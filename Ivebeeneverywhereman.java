import java.util.*;

public class Ivebeeneverywhereman{  
  public static void main(String args[]){  
    Scanner inputuser = new Scanner(System.in);
    int total;
    
    int cases = inputuser.nextInt();
    for(int c = 0 ; c < cases ; c++){
      total = 0;
      int jmlcity = inputuser.nextInt();
      String [] kota = new String [jmlcity + 1];
      
      for(int j = 0 ; j < jmlcity + 1 ; j++){
        kota [j] = inputuser.nextLine().toLowerCase();
      }
      
      for (int i = 0 ; i < kota.length ; i++){
        for (int j = i + 1 ; j < kota.length ; j++){
          if (kota[i].equals(kota[j])){
            kota[j] = "Duplikat";
          }
        }
      }
      
      for(int i = 0 ; i < kota.length ; i++){
        if(kota[i].equals("Duplikat")){
          total += 0;
        }else{
          total += 1;
        }
      }

      System.out.println(total - 1);
    }
    
  }
}
