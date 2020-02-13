import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner inputuser = new Scanner(System.in);
        int bilx = inputuser.nextInt();
        int bily = inputuser.nextInt();
        int jmlbil = inputuser.nextInt();

        for (int i = 1; i <= jmlbil; i++) {
            int f = i % bilx;
            int b = i % bily;
            if (f == 0 && b == 0) {
                System.out.println("FizzBuzz");
            } else if (f == 0) {
                System.out.println("Fizz");
            } else if (b == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}