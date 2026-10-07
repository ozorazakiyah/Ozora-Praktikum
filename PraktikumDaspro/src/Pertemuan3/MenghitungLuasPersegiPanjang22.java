package Pertemuan3;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang22 {
    public static void main(String[] args) {
        Scanner ozora = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;
        panjang = ozora.nextInt();
        lebar = ozora.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi adalah: " + luas);
    }
}
