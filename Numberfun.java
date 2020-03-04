import java.util.*;

public class Numberfun{  
  public static void main(String args[]){  
    Scanner inputuser = new Scanner(System.in);
    int cases = inputuser.nextInt();
    for(int i = 0 ; i < cases ; i++){
      boolean kali = false, bagi = false, tambah = false, kurang = false;
      double bilangan [] = new double[4];
      
      for(int inp = 0 ; inp < 3 ; inp++){
        bilangan[inp] = inputuser.nextInt();
      }
      
      int b1 = 0, b2 = 1; 
      for(int p = 0 ; p < 2 ; p++){
        if(bilangan[b1] * bilangan[b2] == bilangan[2]){
          kali = true;
        }if(bilangan[b1] / bilangan[b2] == bilangan[2]){
          bagi = true;
        }if(bilangan[b1] + bilangan[b2] == bilangan[2]){
          tambah = true;
        }if(bilangan[b1] - bilangan[b2] == bilangan[2]){
          kurang = true;
        }
        b1++;
        b2--;
      }
      if(kali || bagi || tambah || kurang){
        System.out.println("Possible");
      }else{
        System.out.println("Impossible");
      }
    }
  }
}
