package Pertemuan3;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner ozora = new Scanner(System.in);
        int banyak_lembar, total_biaya;
        int biaya_cetak = 500;
        int biaya_jilid = 5000;

        banyak_lembar = ozora.nextInt();
        total_biaya = (banyak_lembar*biaya_cetak)+biaya_jilid;
        System.out.println("Biaya yang harus dibayarkan Mahasiswa sebesar Rp. " + total_biaya);

    }
}
