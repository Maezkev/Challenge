import java.util.Scanner;
import java.util.Arrays;

public class Nastyhacks {
    public static void main(String[] args) {
        Scanner inputuser = new Scanner(System.in);
        int ulangan = inputuser.nextInt();

        int[][] database = new int[5][ulangan + 2];

        for (int i = 1; i <= ulangan; i++) {
            database[1][i] = inputuser.nextInt();
            database[2][i] = inputuser.nextInt();
            database[3][i] = inputuser.nextInt();

            database[4][i] = database[2][i] - database[3][i];
        }
        for (int i = 1; i <= ulangan; i++) {
            if (database[4][i] < database[1][i]) {
                System.out.println("do not advertise");
            } else if (database[4][i] == database[1][i]) {
                System.out.println("does not matter");
            } else if (database[4][i] > database[1][i]) {
                System.out.println("advertise");
            }
        }
    }
}