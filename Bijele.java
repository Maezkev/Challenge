import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner inputuser = new Scanner(System.in);
        int king = inputuser.nextInt(); // 1
        int queen = inputuser.nextInt(); // 1
        int rooks = inputuser.nextInt(); // 2
        int bishops = inputuser.nextInt(); // 2
        int knights = inputuser.nextInt(); // 2
        int pawns = inputuser.nextInt(); // 8

        int harus_king = 1 - king;
        int harus_queen = 1 - queen;
        int harus_rooks = 2 - rooks;
        int harus_bishops = 2 - bishops;
        int harus_knights = 2 - knights;
        int harus_pawns = 8 - pawns;

        System.out.println(harus_king + " " + harus_queen + " " + harus_rooks + " " + harus_bishops + " "
                + harus_knights + " " + harus_pawns);
    }
}