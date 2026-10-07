package Pertemuan6;
import java.util.Scanner;

public class TugasLatihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku, diskon;
        System.out.print("Apakah jenis buku anda: ");
        jenisBuku = sc.nextLine();
        System.out.print("Berapakah jumlah buku anda: ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 12;
            } else {
                diskon = 10;
            } 
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                diskon = 9;
            } else {
                diskon = 8;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5;
            } else {
                diskon = 0;
            }
        }
        System.out.println("Jumlah diskon yang anda dapatkan adalah: " + diskon + "%");
    }   
}
