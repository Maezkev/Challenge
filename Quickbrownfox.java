import java.util.*;

public class Quickbrownfox {
    static char[] cha ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void main(String[] args)throws Exception{
        Scanner inputuser = new Scanner(System.in);
        int cases=inputuser.nextInt(); inputuser.nextLine();
        for(int i = 0 ; i < cases ; i++){
            int totalygada = 0;
            boolean[] adamiss = new boolean[26];
            char[] kalimat = inputuser.nextLine().toLowerCase().toCharArray();
            for(int j = 0;j < kalimat.length ; j++){
                if(kalimat[j] >= 97 && kalimat[j] <= 122){
                    if(adamiss[kalimat[j] - 97] != true) totalygada++;
                    adamiss[kalimat[j] - 97] = true;
                }
            }
            
            if(totalygada == 26)System.out.println("pangram");
            else{System.out.print("missing ");
                for(int j = 0 ; j < adamiss.length ; j++){
                    if(adamiss[j] == false)System.out.print(cha[j]);
                }System.out.println();
            }
        }
    }
}
