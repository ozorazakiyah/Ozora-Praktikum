package Pertemuan5;
import java.util.Scanner;

public class Tugas1Pemilihan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String pesan;
        boolean uktLunas;
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        uktLunas = sc.nextBoolean();

        pesan = (uktLunas) ? "Pembayaran UKT terverifikasi" : "Lakukan pembayaran terlebih dahulu";
        System.out.print(pesan);
    }
}
