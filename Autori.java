import java.util.Scanner;

class Autori
{  
  public static void main(String args[])
  {  
    Scanner inputuser = new Scanner(System.in);
    System.out.println("GO\n");
    String namanya = inputuser.nextLine();
    
    System.out.print(Character.toUpperCase(namanya.charAt(0)));
    for (int i = 1; i < namanya.length() - 1; i -= -1)
      if (namanya.charAt(i) == '-')
        System.out.print(Character.toUpperCase(namanya.charAt(i + 1)));
  }
}
