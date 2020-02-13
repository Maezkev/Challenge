import java.util.Scanner;

public class Isithalloween {
    public static void main(String[] args) {
        Scanner inputuser = new Scanner(System.in);
        String tgl_raw = inputuser.nextLine();
        String tgl = tgl_raw.toUpperCase();
        String okt = "OCT 31";
        String dec = "DEC 25";
        System.out.println(okt.equals(tgl) || dec.equals(tgl) ? "yup" : "nope");
    }
}